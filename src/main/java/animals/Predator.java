package animals;

import lombok.ToString;

@ToString(callSuper = true)
abstract public class Predator extends Animal {
    public Predator(String name, int food) {
        super(name, food);
    }
}
