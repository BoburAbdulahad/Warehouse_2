package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.projection.CustomCategory;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
