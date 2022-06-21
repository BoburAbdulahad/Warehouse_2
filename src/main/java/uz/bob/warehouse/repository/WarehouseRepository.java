package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Warehouse;
import uz.bob.warehouse.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "warehouseList",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
