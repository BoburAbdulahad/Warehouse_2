package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.User;
import uz.bob.warehouse.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Set<Warehouse> getWarehouses();

    boolean isActive();




}
