package sectani.userservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sectani.userservice.entity.User;
import sectani.userservice.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {
    private final UserRepository repository;

    public UserServiceApplication(UserRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("Aymane Houri","houri.aymane03@gmail.com","+212 642","Science"));
        users.add(new User("Abdesselam Sectani","a.sectani2019@gmail.com", "+212 650561884", "Comedy"));
        users.add(new User("Abdesselam Sectani","abdesselam.sectani@etu.uae.ac.ma", "+212 650561884", "Comedy"));
        users.add(new User("Hiba Bechar","itshibaaa80@gmail.com", "+212 650561884", "Horror"));

        repository.saveAll(users);
    }
}
