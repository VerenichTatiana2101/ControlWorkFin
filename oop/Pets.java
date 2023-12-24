import java.time.LocalDate;

public class Pets extends Animals{

    public Pets(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);

    }

    @Override
    public String toString() {
        return "Pets []";
    }
  
}
