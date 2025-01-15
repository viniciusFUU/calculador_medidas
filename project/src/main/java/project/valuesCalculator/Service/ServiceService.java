package project.valuesCalculator.Service;

import org.springframework.stereotype.Service;

import project.valuesCalculator.DTO.ServiceDTO;
import project.valuesCalculator.Models.Client;
import project.valuesCalculator.Models.Floor;
import project.valuesCalculator.Models.ServiceM;
import project.valuesCalculator.Models.ServiceType;
import project.valuesCalculator.Models.Wall;
import project.valuesCalculator.Repository.ClientRepository;
import project.valuesCalculator.Repository.ServiceRepository;

@Service
public class ServiceService {
    private ServiceRepository serviceRepository;
    private ClientRepository clientRepository;
    private Floor floor;
    private Wall wall; 

    public ServiceService(ServiceRepository serviceRepository, ClientRepository clientRepository, Floor floor, Wall wall){
        this.serviceRepository = serviceRepository;
        this.clientRepository = clientRepository;
        this.floor = floor;
        this.wall = wall;
    }

    public String createService(ServiceDTO serviceDTO){
        double value = 0.0;
        Client c = clientRepository.findByClientName(serviceDTO.getClientName());
        ServiceM serviceM = new ServiceM();
        System.out.println(serviceDTO.getClientName());

        serviceM.setMeterValue(serviceDTO.getMeterValue());
        serviceM.setIdClient(c);
        
        ServiceType serviceType = ServiceType.fromString(serviceDTO.getServiceType());
        serviceM.setServiceType(serviceType);

        switch (serviceType) {
            case FLOOR:
                floor.setFront(serviceDTO.getJobDTO().getServiceMeasureBase());
                floor.setSide(serviceDTO.getJobDTO().getServiceMeasureSide());

                value = floor.calcService(serviceDTO.getMeterValue());
                break;
            
            case WALL:
                wall.setServiceMeasureBase(serviceDTO.getJobDTO().getServiceMeasureBase());
                wall.setServiceMeasureSide(serviceDTO.getJobDTO().getServiceMeasureSide());
                wall.setServiceMeasureHeigth(serviceDTO.getJobDTO().getServiceMeasureHeigth());

                value = wall.calcService(wall, serviceDTO.getJobDTO().getMeterValue());
            default:
                break;
        }
        serviceM.setServiceValue(value);
        serviceRepository.save(serviceM);
        
        return "Serviço cadastrado com sucesso.";
    }

    public String updateService(int idService, String valueToChange, String newValue){
        ServiceM service = serviceRepository.findById(idService);
        String oldValue = "";

        switch (valueToChange) {
            case "serviceType":
                oldValue = service.getServiceType().toString();
                ServiceType serviceType = ServiceType.fromString(newValue);
                service.setServiceType(serviceType);
                break;
            case "meterValue":
                oldValue = String.valueOf(service.getMeterValue());
                double meterValue = Double.parseDouble(newValue);
                service.setMeterValue(meterValue);
            default:
                return "Erro ao atualizar o "+valueToChange;
        }

        serviceRepository.save(service);
        return valueToChange+" atualizado de "+oldValue+" para "+newValue;
    }

    public String deleteService(int serviceId){
        ServiceM service = serviceRepository.findById(serviceId);
        
        if(service != null){
            try{
                serviceRepository.delete(service);
            } catch (Exception e){
                e.printStackTrace();
            }

            return "Serviço deletado com sucesso";
        }

        return "Não existe este serviço";
    }
}