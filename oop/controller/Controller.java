package controller;

import java.time.LocalDate;
import java.util.List;

import model.Animals;
import service.DataService;
import service.UserService;

public class Controller {
    
    private DataService serviceAn = new UserService();
    public Animals createNewAnimals(String type, String name, LocalDate birthday, List<String> commands) {
        return serviceAn.createAnimals(type, name, birthday, commands);
    }
}
