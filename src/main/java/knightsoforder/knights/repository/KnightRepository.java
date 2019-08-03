package knightsoforder.knights.repository;

import knightsoforder.knights.model.Knight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KnightRepository extends CrudRepository<Knight, Integer> {

    default void saveDefault(Knight knight){
        knight.setLvl(1);
        knight.setMaxPd(10);
        knight.setPd(0);
        knight.setMaxHp(100);
        knight.setHp(100);
        knight.setILvl(0);
        knight.setGold(1);
        knight.setSilver(30);
        knight.setBronze(50);
        knight.setStrength(10);
        knight.setAgility(10);
        knight.setStamina(10);
        knight.setTrade(10);
        save(knight);
    }

    @Query(value = "SELECT * FROM knight ORDER BY nick", nativeQuery = true)
    List<Knight> sortKnightsByName();

}
