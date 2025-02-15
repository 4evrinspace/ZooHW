package hm.animals;

import hm.interfaces.IsKind;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
abstract public class Herbo extends Animal implements IsKind {
    protected int kindness;

    public Herbo(String name, int food, int kindness) {
        super(name, food);
        if (kindness < 0 || kindness > 10) {
            throw new IllegalArgumentException("Kindness should be in range [0, 10]");
        }
        this.kindness = kindness;
    }


    @Override
    public int getKindness() {
        return kindness;
    }

    @Override
    public void setKindness(int kindness) {
        if (kindness < 0 || kindness > 10) {
            throw new IllegalArgumentException("Kindness should be in range [0, 10]");
        }
        this.kindness = kindness;
    }

    @Override
    public boolean isInteractable() {
        return (kindness > 5);
    }
}
