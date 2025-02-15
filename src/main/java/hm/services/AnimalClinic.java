package hm.services;

import hm.animals.Animal;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class AnimalClinic {
    public boolean isHealthy(Animal toCheck) {
        Random rng = new Random();
        return true;
    }
}
