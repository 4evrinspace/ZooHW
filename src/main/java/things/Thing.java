package things;

import interfaces.IInventory;
import interfaces.IsNameable;

abstract public class Thing implements IInventory, IsNameable {

    private int number;
    private final String name;

    // Мб будет также, как и с животными (придется подтверждать присвоение зоопарку),
    // поэтому номер будет выдаваться только при зачислении в зоопарк

    public Thing(String name) {
        this.number = -1;
        this.name = name;
    }


    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        if (this.number == -1) {
            if (number < 0) {
                throw new IllegalArgumentException("Inventory number of thing cannot be negative.");
            }
            this.number = number;
        } else {
            throw new UnsupportedOperationException("Inventory number of thing cannot be changed after it is set.");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Name of thing cannot be changed.");
    }

}
