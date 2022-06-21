package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Output;
import uz.bob.warehouse.projection.CustomOutput;

@RepositoryRestResource(path = "output",collectionResourceRel = "outputList",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {


}
