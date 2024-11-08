package sectani.empruntservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Emprunt {
    @Id
    @GeneratedValue
    private Long empruntId;
    private Date dateEmprunt;
    private Date dateRetour;
    private Long userId;
    private Long livreId;
    private Boolean isReturned;

    public Emprunt(Date dateEmprunt, Date dateRetour, Long userId, Long livreId, Boolean isReturned) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.userId = userId;
        this.livreId = livreId;
        this.isReturned = isReturned;
    }
}
