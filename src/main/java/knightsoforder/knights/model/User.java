package knightsoforder.knights.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_ID;

    private String email;
    private String password;

    @OneToOne
    private Knight knight;
}
