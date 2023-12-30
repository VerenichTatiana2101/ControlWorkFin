package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.DataBase;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    DataBase db = new DataBase();
    Controller controller = new Controller();
    int inCommand;

    public void userChoice() {
        while (true) {
            System.out.println("Select an item from the menu:\n"
                    + "1 - add an animal\n"
                    + "2 - show list of animals\n"
                    + "3 - see a list of animal commands\n"
                    + "4 - teach the animal new commands\n"
                    + "5 - exit");
            inCommand = scanner.nextInt();
            scanner.nextLine();
            switch (inCommand) {
                case 1:
                    // Добавление животных
                    addAnimal();
                    break;
                case 2:
                    // показать список животных в питомнике(все, домание, коты собаки)
                    System.out.println(controller.getListAnimals());
                    break;
                case 3:
                    // посмотреть список поманд
                    System.out.println(controller.showCommands(askName()));   
                case 4:
                    // обучить животное команде, сам метод в data base, 
                    // не успела доделать пока не работает
                    controller.learnCommands(askName());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Please, enter a number 1 to 5.");
                    break;
            }
        }
    }

    private String askName() {
        System.out.println("Enter the animal's name:");
        String name = scanner.nextLine();
        return name;
    }

    // Добавление животных
    public void addAnimal() {
        System.out.println("Enter the type of animal (cat, dog, hamster, horse, donkey, camel):");
        String type = scanner.nextLine();

        System.out.println("Enter the animal's name:");
        String name = scanner.nextLine();

        System.out.print("Enter your date of birth in the format (yyyy-MM-dd): ");
        String birthdateString = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthdateString);

        System.out.println("Enter a list of animal commands (comma separated): ");
        String commandsString = scanner.nextLine();
        List<String> commands = Arrays.asList(commandsString.split(","));
        System.out.println(controller.createNewAnimals(type, name, birthday, commands));
    }
}
