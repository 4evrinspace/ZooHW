package animals;

import lombok.ToString;

@ToString(callSuper = true)
public class Rabbit extends Herbo {
    public Rabbit(String name, int food, int kindness) {
        super(name, food, kindness);
    }
}
