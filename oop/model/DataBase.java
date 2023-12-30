package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
  Scanner scanner = new Scanner(System.in);
  ArrayList<Animals> listAnimals = new ArrayList<>();

  public void initAnimals(ArrayList<Animals> listAnimals) {
    this.listAnimals = listAnimals;
  }

  public ArrayList<Animals> getListAnimals() {
    return listAnimals;
  }

  public void setListAnimals(ArrayList<Animals> listAnimals) {
    this.listAnimals = listAnimals;
  }

  public void registerAnimal(Animals animal) {
    listAnimals.add(animal);
  }

  public Animals getAnimals(String name) {
    for (Animals animals : listAnimals) {
      if (animals.getName().equals(name)) {
        return animals;
      }
    }
    return null;
  }

  public List<String> showCommands(String name) {
    for (Animals animals : listAnimals) {
      if (animals.getName().equals(name)) {
        return animals.getCommands();
      }
    }
    return null;
  }

  public void learnCommands(String name) {
    for (Animals animals : listAnimals) {
      if (animals.getName().equals(name)) {
        System.out.println("Enter a list of animal commands (comma separated): ");
        String commandsString = scanner.nextLine();
        List<String> commands = Arrays.asList(commandsString.split(","));
        animals.getCommands().addAll(commands);
        return;
      }
    }
    System.out.println("Animal named " + name + " not found.");
  }

  @Override
  public String toString() {
    String res = "";
    for (Animals obj : listAnimals) {
      res += obj.toString() + "\n";
    }
    return res;
  }
}
