import java.time.LocalDate;

public class Dogs extends Pets {

    public Dogs(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
    }

    @Override
    public String toString() {
        return "Dogs []";
    }
    
}
