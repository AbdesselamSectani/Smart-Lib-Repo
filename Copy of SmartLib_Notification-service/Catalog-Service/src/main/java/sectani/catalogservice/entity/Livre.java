package sectani.catalogservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Livre {
    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String auteur;
    private String genre;
    private String description;
    private String status;

    public Livre(String titre, String auteur, String genre, String description, String status) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.description = description;
        this.status = status;
    }
}
