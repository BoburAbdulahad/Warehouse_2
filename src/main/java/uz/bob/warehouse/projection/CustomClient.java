package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {


    Integer getId();

    String getName();

    boolean isActive();

    String getPhoneNumber();
}
