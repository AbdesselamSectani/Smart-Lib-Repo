package sectani.catalogservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sectani.catalogservice.entity.Livre;
import sectani.catalogservice.repository.LivreRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CatalogServiceApplication implements CommandLineRunner {

    private final LivreRepository repository;

    public CatalogServiceApplication(LivreRepository repository) {
        this.repository = repository;
    }


    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Livre> livres = new ArrayList<>();
        livres.add(new Livre("Book 1", "Author 1", "Fiction", "Description of Book 1", "DISPONIBLE"));
        livres.add(new Livre("Book 2", "Author 2", "Mystery", "Description of Book 2", "EMPRUNTÉ"));
        livres.add(new Livre("Book 3", "Author 3", "Fantasy", "Description of Book 3", "DISPONIBLE"));
        livres.add(new Livre("Book 4", "Author 4", "Science Fiction", "Description of Book 4", "DISPONIBLE"));
        livres.add(new Livre("Book 5", "Author 5", "Romance", "Description of Book 5", "EMPRUNTÉ"));
        livres.add(new Livre("Book 6", "Author 6", "Non-Fiction", "Description of Book 6", "DISPONIBLE"));
        livres.add(new Livre("Book 7", "Author 7", "Historical", "Description of Book 7", "EMPRUNTÉ"));
        livres.add(new Livre("Book 8", "Author 8", "Thriller", "Description of Book 8", "DISPONIBLE"));
        livres.add(new Livre("Book 9", "Author 9", "Biography", "Description of Book 9", "DISPONIBLE"));
        livres.add(new Livre("Book 10", "Author 10", "Poetry", "Description of Book 10", "EMPRUNTÉ"));
        livres.add(new Livre("Book 11", "Author 11", "Horror", "Description of Book 11", "DISPONIBLE"));
        livres.add(new Livre("Book 12", "Author 12", "Children's", "Description of Book 12", "EMPRUNTÉ"));
        livres.add(new Livre("Book 13", "Author 13", "Science", "Description of Book 13", "DISPONIBLE"));
        livres.add(new Livre("Book 14", "Author 14", "Adventure", "Description of Book 14", "DISPONIBLE"));
        livres.add(new Livre("Book 15", "Author 15", "Drama", "Description of Book 15", "EMPRUNTÉ"));
        livres.add(new Livre("Book 16", "Author 16", "Comedy", "Description of Book 16", "DISPONIBLE"));
        livres.add(new Livre("Book 17", "Author 17", "Travel", "Description of Book 17", "DISPONIBLE"));
        livres.add(new Livre("Book 18", "Author 18", "Philosophy", "Description of Book 18", "EMPRUNTÉ"));
        livres.add(new Livre("Book 19", "Author 19", "Health", "Description of Book 19", "DISPONIBLE"));
        livres.add(new Livre("Book 20", "Author 20", "Cookbook", "Description of Book 20", "DISPONIBLE"));

        repository.saveAll(livres);
    }
}
