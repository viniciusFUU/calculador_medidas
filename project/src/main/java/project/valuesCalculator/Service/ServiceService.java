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

    public ServiceService(ServiceRepository serviceRepository, ClientRepository clientRepository, Floor floor){
        this.serviceRepository = serviceRepository;
        this.floor = floor;
        this.clientRepository = clientRepository;
    }

    public String createService(ServiceM serviceM, String clientName, double meterValue, ServiceType serviceType, ServiceDTO serviceDTO){
        double value = 0.0;
        Client c = clientRepository.findByClientName(clientName);

        serviceM.setServiceType(serviceType);
        serviceM.setMeterValue(meterValue);
        serviceM.setIdClient(c);

        switch (serviceType) {
            case FLOOR:
                floor.setFront(serviceDTO.getServiceMeasureBase());
                floor.setSide(serviceDTO.getServiceMeasureSide());

                value = floor.calcService(floor, meterValue);
                break;
            
            case WALL:
                wall.setServiceMeasureBase(serviceDTO.getServiceMeasureBase());
                wall.setServiceMeasureSide(serviceDTO.getServiceMeasureSide());
                wall.setServiceMeasureHeigth(serviceDTO.getServiceMeasureHeigth());

                value = wall.calcService(wall, meterValue);
            default:
                break;
        }
        serviceM.setServiceValue(value);
        serviceRepository.save(serviceM);
        
        return "Serviço cadastrada com sucesso.";
    }
}