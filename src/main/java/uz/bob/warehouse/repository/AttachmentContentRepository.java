package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.AttachmentContent;
import uz.bob.warehouse.entity.Category;

@Repository
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
