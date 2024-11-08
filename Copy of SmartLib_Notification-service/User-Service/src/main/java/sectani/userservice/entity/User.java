package sectani.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String email;
    private String tel;
    private String interest;

    public User(String nom, String email, String tel, String interest) {
        this.nom = nom;
        this.email = email;
        this.tel = tel;
        this.interest = interest;
    }
}
