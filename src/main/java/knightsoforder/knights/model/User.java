package knightsoforder.knights.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Email
    private String email;
    //@NotEmpty
    private String password;
    //@NotEmpty
    private String accountType;

    @OneToMany(mappedBy = "user")
    private List<Knight> knights = new ArrayList<>();

}
