package sectani.catalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sectani.catalogservice.entity.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Long> {
}