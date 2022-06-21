package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.OutputProduct;
import uz.bob.warehouse.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "outputProductList",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
