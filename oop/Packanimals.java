import java.time.LocalDate;

public class Packanimals extends Animals {

    public Packanimals(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
    }

    @Override
    public String toString() {
        return "Packanimals []";
    }
    
}
