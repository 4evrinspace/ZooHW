package animals;

import lombok.ToString;

@ToString(callSuper = true)
public class Monkey extends Herbo {
    public Monkey(String name, int food, int kindness) {
        super(name, food, kindness);
    }
}
