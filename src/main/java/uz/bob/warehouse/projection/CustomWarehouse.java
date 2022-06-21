package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean isActive();

}
