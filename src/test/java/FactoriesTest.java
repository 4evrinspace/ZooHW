import hm.animals.Animal;
import hm.animals.Monkey;
import hm.animals.Wolf;
import hm.factories.AnimalFactory;
import hm.factories.ThingFactory;
import hm.things.Thing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FactoriesTest {
    @Test
    public void testAnimalFactory()
    {

        AnimalFactory animalFactory = new AnimalFactory();
        Monkey animal = (Monkey) animalFactory.createAnimal("Monkey", "rg", 0, 2);
        assertEquals(animal.getName(), "rg");
        assertEquals(animal.getFood(), 0);
        assertEquals(animal.getKindness(), 2);
        assertEquals(animalFactory.isHerbo("Monkey"), true);
        assertEquals(animalFactory.isHerbo("Tiger"), false);
        Wolf wf = (Wolf) animalFactory.createAnimal("Wolf", "wf", 0, null);
        assertEquals(wf.getName(), "wf");
        assertEquals(wf.getFood(), 0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> animalFactory.createAnimal("1", "rg", 0, 2));

    }

    @Test
    public void testThingFactory()
    {
        ThingFactory thingFactory = new ThingFactory();
        Thing thing = thingFactory.createThing("Table");
        assertEquals(thing.getName(), "Table");
        Assertions.assertThrows(IllegalArgumentException.class, () -> thingFactory.createThing("1"));

    }
}
