package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.OutputProduct;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
