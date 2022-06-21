package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.User;
import uz.bob.warehouse.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "userList",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
