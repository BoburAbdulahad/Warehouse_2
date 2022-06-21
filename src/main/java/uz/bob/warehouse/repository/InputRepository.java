package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Input;
import uz.bob.warehouse.projection.CustomInput;

@RepositoryRestResource(path = "input",collectionResourceRel = "inputList",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {

}
