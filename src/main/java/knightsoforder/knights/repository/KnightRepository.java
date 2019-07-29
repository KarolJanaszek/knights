package knightsoforder.knights.repository;

import knightsoforder.knights.model.Knight;
import org.springframework.data.repository.CrudRepository;

public interface KnightRepository extends CrudRepository<Knight, Integer> {
}
