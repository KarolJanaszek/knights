package knightsoforder.knights.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Knight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer knightId;
    private String nick;

    private Integer lvl;

    private Integer maxPd;
    private Integer pd;

    private Integer maxHp;
    private Integer hp;

    private Integer iLvl;

    private Integer gold;
    private Integer silver;
    private Integer bronze;

    private Integer strength;
    private Integer agility;
    private Integer stamina;
    private Integer trade;
//
//    @OneToOne
//    private User user;


    //toString
    @Override
    public String toString() {
        return getKnightId()+". Nick: "+getNick();
    }

}
