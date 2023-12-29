package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.Animals;
import model.DataBase;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    DataBase db = new DataBase();
    Controller controller = new Controller();
    int inCommand;

    public void userChoice(ArrayList<Animals> myList) {
        while (true) {
            System.out.println("Select:\n"
                    + "1 - add animal\n"
                    + "2 - show a animals\n"
                    + "3 - show commands\n"
                    + "4 - learn commands\n"
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
                    // обучить животное команде
                    db.learnCommands(askName());
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
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        return name;
    }

    // Добавление животных
    public void addAnimal() {
        System.out.println("Введите тип животного (cat, dog, hamster, horse, donkey, camel):");
        String type = scanner.nextLine();

        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();

        System.out.print("Ведите дату рождения в формате (yyyy-MM-dd): ");
        String birthdateString = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthdateString);

        System.out.println("Введите список команд, которое выполняет животное: ");
        String commandsString = scanner.nextLine();
        List<String> commands = Arrays.asList(commandsString.split(","));
        System.out.println(controller.createNewAnimals(type, name, birthday, commands));
    }
}
