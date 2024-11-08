package sectani.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sectani.catalogservice.entity.Livre;
import sectani.catalogservice.repository.LivreRepository;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {
    private final LivreRepository repository;

    public LivreController(LivreRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Livre> getAllLivres(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
}
