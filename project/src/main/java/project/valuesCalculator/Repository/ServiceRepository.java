package project.valuesCalculator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.valuesCalculator.Models.ServiceM;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceM, Integer>{
    
}
