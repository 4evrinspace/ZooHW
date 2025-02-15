package hm.factories;

import org.springframework.stereotype.Component;
import hm.things.Computer;
import hm.things.Table;
import hm.things.Thing;
import java.util.Map;
import java.util.function.Supplier;

@Component
public class ThingFactory {
    private final Map<String, Supplier<Thing>> typesToConstructors = Map.of(
            "computer", Computer::new,
            "table", Table::new
    );

    public Thing createThing(String toCreate) {
        Supplier<Thing> constructor = typesToConstructors.get(toCreate.toLowerCase());
        if (constructor == null) {
            throw new IllegalArgumentException("Invalid type of thing");
        } else {
            return constructor.get();
        }
    }
}
