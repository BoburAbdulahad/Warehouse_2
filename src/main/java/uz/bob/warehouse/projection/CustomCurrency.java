package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

    boolean isActive();


}
