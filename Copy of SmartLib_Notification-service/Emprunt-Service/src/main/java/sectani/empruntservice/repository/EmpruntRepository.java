package sectani.empruntservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sectani.empruntservice.entity.Emprunt;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt,Long> {
}
