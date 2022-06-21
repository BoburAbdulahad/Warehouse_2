package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Attachment;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Measurement;
import uz.bob.warehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    boolean isActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

     Measurement getMeasurement();

}
