import java.time.LocalDate;

public class Hamsters extends Pets {

    public Hamsters(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
        
    }

    @Override
    public String toString() {
        return "Hamsters []";
    }
    
}
