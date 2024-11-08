package sectani.empruntservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sectani.empruntservice.entity.Emprunt;
import sectani.empruntservice.repository.EmpruntRepository;

import java.util.List;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {
    private final EmpruntRepository repository;

    public EmpruntController(EmpruntRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Emprunt> getAllemprunts(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Emprunt getempruntById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
}
