package knightsoforder.knights.repository;

import knightsoforder.knights.model.Knight;
import org.springframework.data.repository.CrudRepository;

public interface KnightRepository extends CrudRepository<Knight, Integer> {

    default void saveDefault(Knight knight){
        knight.setLvl(1);
        knight.setMaxPd(10);
        knight.setPd(0);
        knight.setMaxHp(100);
        knight.setHp(100);
        knight.setILvl(0);
        knight.setGold(0);
        knight.setSilver(0);
        knight.setBronze(0);
        knight.setStrength(10);
        knight.setAgility(10);
        knight.setStamina(10);
        knight.setTrade(10);
        save(knight);
    }

}
