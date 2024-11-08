package sectani.empruntservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sectani.empruntservice.entity.Emprunt;
import sectani.empruntservice.repository.EmpruntRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class EmpruntServiceApplication implements CommandLineRunner {
    private final EmpruntRepository repository;

    public EmpruntServiceApplication(EmpruntRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmpruntServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Calendar calendar = Calendar.getInstance();
        // Subtract one day from the current date
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        // Get the Date object for one day before today
        Date yesterday = calendar.getTime();

        List<Emprunt> emprunts = new ArrayList<>();
        emprunts.add(new Emprunt(new Date(), yesterday, 2L, 1L, false));
        emprunts.add(new Emprunt(new Date(), yesterday, 3L, 2L, false));
        emprunts.add(new Emprunt(new Date(), yesterday, 2L, 3L, false));
        emprunts.add(new Emprunt(new Date(), yesterday, 2L, 5L, false));
        emprunts.add(new Emprunt(new Date(), yesterday, 2L, 16L, false));
        emprunts.add(new Emprunt(new Date(), yesterday, 2L, 16L, true));
        emprunts.add(new Emprunt(new Date(), new Date(), 2L, 16L, false));
        emprunts.add(new Emprunt(new Date(), new Date(), 4L, 16L, false));
       repository.saveAll(emprunts);
    }
}
