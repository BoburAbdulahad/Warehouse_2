package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Measurement;
import uz.bob.warehouse.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "measurementList",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

    boolean existsByName(String name);
}
