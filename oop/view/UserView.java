package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import controller.Controller;

public class UserView {
    Scanner scanner = new Scanner(System.in);

    Controller controller = new Controller();
    Scanner scan = new Scanner(System.in);
    int inCommand;

    public void userChoice() {
        while (true) {
            System.out.println("Select the type of user to add:\n"
                    + "1 - add animal\n"
                    + "2 - show a student\n"
                    + "3 - exit");
            inCommand = scan.nextInt();
            scan.nextLine();
            switch (inCommand) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Please, enter a number 1 to 3.");
                    break;
            }
        }
    }

    public void addAnimal() {
        System.out.println("Введите тип животного (cat, dog, hamster, horse, donkey, camel):");
        String type = scanner.nextLine();

        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();

        System.out.print("Enter the birthdate of the animal (yyyy-MM-dd): ");
        String birthdateString = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthdateString);

        System.out.println("Enter the commands the animal can perform (comma-separated): ");
        String commandsString = scanner.nextLine();
        List<String> commands = Arrays.asList(commandsString.split(","));
        System.out.println(controller.createNewAnimals(type, name, birthday, commands));
    }
}
