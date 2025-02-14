package services;

import factories.AnimalFactory;
import factories.ThingFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class ConsoleUI {
    private Scanner scanner = new Scanner(System.in);


    @Autowired
    private AnimalFactory animalFactory;
    @Autowired
    private ThingFactory thingFactory;
    @Autowired
    private Zoo zoo;

    public void run() {
        System.out.println("Moscow Zoo Application");
        String prevCommand = "";
        while (!prevCommand.equalsIgnoreCase("q")) {
            System.out.println();
            System.out.println("Enter command:");
            System.out.println("1 - add animal");
            System.out.println("2 - print all animals in the zoo");
            System.out.println("3 - add thing");
            System.out.println("4 - print all things in the zoo");
            System.out.println("5 - print EVERYTHING in the zoo");
            System.out.println("q - to quit");
            String curCommand = scanner.nextLine();
            switch (curCommand) {
                case "1" -> {
                    addAnimal();
                }
                case "2" -> {
                    zoo.getZooAnimals().forEach(System.out::println);
                }
                case "3" -> {
                    addThing();
                }
                case "4" -> {
                    zoo.getZooThings().forEach(System.out::println);
                }
                case "5" -> {
                    zoo.getZooAnimals().forEach(System.out::println);
                    zoo.getZooThings().forEach(System.out::println);
                }
                case "q" -> {
                    System.out.println("Goodbye!");
                    prevCommand = "q";
                }
                default -> {
                    System.out.println("Invalid command. Try again.");
                }
            }
        }
    }

    public void addAnimal() {
        System.out.println("Enter type of animal you would like to enter (monkey, rabbit, tiger, wolf):");
        String type = scanner.nextLine();
        System.out.println("Enter name of your animal:");
        String name = scanner.nextLine();
        System.out.println("Enter food consumption (kg):");
        int food = scanner.nextInt();
        scanner.nextLine();
        int kindness = 0;
        if (animalFactory.isHerbo(type)) {
            System.out.println("Enter kindness level of your animal (0-10):");
            kindness = scanner.nextInt();
            scanner.nextLine();
        }
        zoo.addAnimal(animalFactory.createAnimal(type, name,  food, kindness));
    }

    public void addThing() {
        System.out.println("Enter thing type (table, computer):");
        String type = scanner.nextLine();
        zoo.addThing(thingFactory.createThing(type));
    }

}
