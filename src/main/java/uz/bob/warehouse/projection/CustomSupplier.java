package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();

}
