package uz.bob.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.bob.warehouse.entity.Category;
import uz.bob.warehouse.entity.Client;
import uz.bob.warehouse.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "clientList",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
