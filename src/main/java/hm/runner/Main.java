package hm.runner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import hm.services.ConsoleUI;

@SpringBootApplication
@ComponentScan(basePackages = "hm")
public class Main {
    //Ну тут правда пришлось хпт спрашивать как это сделать, сам в спринге не особо пока разбираюсь
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ConsoleUI console = context.getBean(ConsoleUI.class);
        console.run();
    }
}
