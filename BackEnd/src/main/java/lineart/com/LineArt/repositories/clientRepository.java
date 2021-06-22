package lineart.com.LineArt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lineart.com.LineArt.entities.clients;

@Repository
public interface clientRepository extends JpaRepository<clients, Long>{

}
