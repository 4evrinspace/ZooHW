package services;

import animals.Animal;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import things.Thing;
import java.util.ArrayList;
import java.util.List;

@Component
public class Zoo {


    @Autowired
    private AnimalClinic animalClinic;


    private final List<Animal> ZooAnimals = new ArrayList<>();

    public List<Animal> getZooAnimals() {
        return ZooAnimals;
    }


    private final List<Thing> ZooThings = new ArrayList<>();

    public List<Animal> getZooThings() {
        return ZooAnimals;
    }

    private int counter = 1;

    public void addAnimal(Animal animal) {
        if (animalClinic.isHealthy(animal)) {
            animal.setNumber(counter);
            counter++;
            ZooAnimals.add(animal);
        }
    }

    public void addThing(Thing thing) {
        thing.setNumber(counter);
        counter++;
        ZooThings.add(thing);
    }
}
