package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
