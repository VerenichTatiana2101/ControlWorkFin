package model;
import java.time.LocalDate;
import java.util.List;

public class Pets extends Animals{

    public Pets(String type, String name, LocalDate birthday, List<String> commands) {
        super(type, name, birthday, commands);
    }

}
