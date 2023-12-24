import java.time.LocalDate;

public class Horses extends Packanimals {

    public Horses(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
    }

    @Override
    public String toString() {
        return "Horses []";
    }
    
}
