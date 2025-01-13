package project.valuesCalculator.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.valuesCalculator.DTO.ServiceDTO;
import project.valuesCalculator.Service.ServiceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/calc/service")
public class ServiceController {
    private ServiceService serviceService;

    public ServiceController (ServiceService serviceService){
        this.serviceService = serviceService;
    }

    @PostMapping
    public String createService(@RequestBody ServiceDTO serviceDTO){
        return serviceService.createService(serviceDTO);
    }
}
