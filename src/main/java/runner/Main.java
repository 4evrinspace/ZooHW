package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import services.ConsoleUI;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ConsoleUI cliMenu = context.getBean(ConsoleUI.class);
        cliMenu.run();
    }
}
