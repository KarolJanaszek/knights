package knightsoforder.knights.repository;


import knightsoforder.knights.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
