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
    private Integer knight_ID;
    private String nick;

    private Integer lvl;

    private Integer max_pd;
    private Integer pd;

    private Integer max_hp;
    private Integer hp;

    private Integer i_lvl;

    private Integer gold;
    private Integer silver;
    private Integer bronze;

    private Integer strength;
    private Integer agility;
    private Integer stamina;
    private Integer trade;

    @OneToOne
    private User user;

}
