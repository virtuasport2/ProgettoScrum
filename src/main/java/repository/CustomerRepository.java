package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.akt.models.User;

@Repository
public interface CustomerRepository extends CrudRepository<User, Long> {

	List<User> findByEmail(String email);
	 
}