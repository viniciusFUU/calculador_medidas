package project.valuesCalculator.Service;

import org.springframework.stereotype.Service;

import project.valuesCalculator.Repository.ServiceRepository;

@Service
public class ServiceService {
    private ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository){
        this.serviceRepository = serviceRepository;
    }

    public String createService(){
        
    }
}
