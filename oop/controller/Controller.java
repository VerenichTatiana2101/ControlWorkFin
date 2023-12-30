package controller;

import java.time.LocalDate;
import java.util.List;

import model.Animals;
import service.DataService;
import service.UserService;

public class Controller {
    
    private DataService serviceAnimal = new UserService();
    public Animals createNewAnimals(String type, String name, LocalDate birthday, List<String> commands) {
        return serviceAnimal.createAnimals(type, name, birthday, commands);
    }

    public String getListAnimals(){
        return serviceAnimal.getListAnimals();
    }

    public List<String> showCommands(String name){
        return serviceAnimal.getCommands(name);
    }

    public void learnCommands(String name){
        serviceAnimal.setCommands(name);
    }


}
