package uz.bob.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.bob.warehouse.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {


    Integer getId();

    String getName();

    long getSize();

    String getContentType();



}
