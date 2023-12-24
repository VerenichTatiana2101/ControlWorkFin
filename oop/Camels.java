import java.time.LocalDate;

public class Camels extends Packanimals {

    public Camels(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
    }

    @Override
    public String toString() {
        return "Camels []";
    }
    
}
