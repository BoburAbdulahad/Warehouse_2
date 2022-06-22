package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Attachment;
import uz.bob.warehouse.entity.Category;

//@RepositoryRestResource(path = "attachment",collectionResourceRel = "attachmentList",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

    // TODO: 6/21/2022 file or image upload and download by spring data_rest tech

}
