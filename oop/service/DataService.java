package service;

import java.time.LocalDate;
import java.util.List;
import model.Animals;

public interface DataService {
    Animals createAnimals(String type, String name, LocalDate birthday, List<String> commands); 
    
    String getListAnimals();

    List<String> getCommands(String name);

    void setCommands(String name);
}
