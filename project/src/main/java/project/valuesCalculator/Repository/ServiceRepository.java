package project.valuesCalculator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.valuesCalculator.Models.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer>{
    
}
