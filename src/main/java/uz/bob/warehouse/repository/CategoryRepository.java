package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bob.warehouse.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
