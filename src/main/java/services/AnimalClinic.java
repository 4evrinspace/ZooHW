package services;

import animals.Animal;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class AnimalClinic {
    public boolean isHealthy(Animal toCheck) {
        Random rng = new Random();
        return rng.nextBoolean();
    }
}
