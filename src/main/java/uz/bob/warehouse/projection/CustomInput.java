package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Currency;
import uz.bob.warehouse.entity.Input;
import uz.bob.warehouse.entity.Supplier;
import uz.bob.warehouse.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();


}
