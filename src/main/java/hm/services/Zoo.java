package hm.services;

import hm.animals.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import hm.things.Thing;
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

    public List<Thing> getZooThings() {
        return ZooThings;
    }

    private int counter = 1;

    public boolean addAnimal(Animal animal) {
        boolean accepted = animalClinic.isHealthy(animal);
        if (accepted) {
            animal.setNumber(counter);
            counter++;
            ZooAnimals.add(animal);
        }
        return accepted;
    }

    public boolean addThing(Thing thing) {
        boolean accepted = true;
        thing.setNumber(counter);
        counter++;
        ZooThings.add(thing);
        return accepted;
    }
}
