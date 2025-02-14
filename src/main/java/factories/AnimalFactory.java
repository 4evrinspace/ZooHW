package factories;

import animals.Animal;
import animals.Herbo;
import animals.Monkey;
import animals.Rabbit;
import animals.Tiger;
import animals.Wolf;
import java.util.Map;
import org.springframework.stereotype.Component;


@Component
public class AnimalFactory {
    private final Map<String, Class<? extends Animal>> animalTypes = Map.of(
            "monkey", Monkey.class,
            "rabbit", Rabbit.class,
            "tiger", Tiger.class,
            "wolf", Wolf.class
    );

    //Реализация нижеследущих методов обсуждалась с лектром, поэтому похожая реализация может быть у других людей
    public boolean isHerbo(String type) {
        Class<? extends Animal> classType = animalTypes.get(type.toLowerCase());
        if (classType == null) {
            throw new IllegalArgumentException("Invalid animal type.");
        }
        return Herbo.class.isAssignableFrom(classType);
    }



    public Animal createAnimal(String toCreate, String name, int food, Integer kindness) {
        Class<? extends Animal> classToCreate = animalTypes.get(toCreate.toLowerCase());
        if (classToCreate == null) {
            throw new IllegalArgumentException("Invalid animal type.");
        }

        try {
            if (Herbo.class.isAssignableFrom(classToCreate)) {
                return classToCreate.getConstructor(String.class, int.class, int.class).newInstance(
                        name, food, kindness);
            } else {
                return classToCreate.getConstructor(String.class, int.class).newInstance(name, food);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to call animal constructor", e);
        }
    }

}
