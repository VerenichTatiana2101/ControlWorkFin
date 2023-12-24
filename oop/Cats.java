import java.time.LocalDate;

public class Cats extends Pets {

    public Cats(int id, String type, String name, LocalDate birthday) {
        super(id, type, name, birthday);
        
    }

    @Override
    public String toString() {
        return "Cats []";
    }
    
}
