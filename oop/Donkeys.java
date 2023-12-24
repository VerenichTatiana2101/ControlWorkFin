import java.time.LocalDate;

public class Donkeys extends Packanimals {

    public Donkeys(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
    }

    @Override
    public String toString() {
        return "Donkeys []";
    }
    
}
