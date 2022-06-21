package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Category getParentCategory();

}
