package model;
import java.time.LocalDate;
import java.util.List;

public class Cats extends Pets {

    public Cats(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }

    @Override
    public String toString() {
        return "Cats []";
    }
    
}
