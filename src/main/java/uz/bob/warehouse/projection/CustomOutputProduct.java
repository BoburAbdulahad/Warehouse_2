package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.*;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();




}
