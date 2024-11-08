package sectani.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sectani.userservice.entity.User;
import sectani.userservice.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/interest/{genre}")
    public List<User> getUsersByInterest(@PathVariable String genre){
        return repository.findAllByInterest(genre);
    }
}
