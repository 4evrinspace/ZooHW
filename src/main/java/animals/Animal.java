package animals;

import interfaces.IAlive;
import interfaces.IInventory;
import interfaces.IsNameable;
import lombok.Getter;
import lombok.ToString;

// Немного не очевидно по условию, но "В ходе беседы мы выяснили, что инвентаризации подлежат не
//только предметы зоопарка, но и животные"


@ToString
abstract public class Animal implements IAlive, IInventory, IsNameable {

    private final int food;
    private int number;
    private final String name;

    // Только при создании объекта класса Animal можно указать количество еды
    public Animal(String name, int food) {
        this.food = food;
        this.number = -1; // по умолчанию -1, т.к. животные не зарегистрированы еще в зоопарке
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Name of animal cannot be changed.");
    }


    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        if (this.number == -1) {
            if (number < 0) {
                throw new IllegalArgumentException("Inventory number of animal cannot be negative.");
            }
            this.number = number;
        } else {
            throw new UnsupportedOperationException("Inventory number of animal cannot be changed after it is set.");
        }
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public void setFood(int food) {
        throw new UnsupportedOperationException("Number of food to eat for animal daily cannot be changed.");
    }
}
