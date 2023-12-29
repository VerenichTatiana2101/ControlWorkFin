package view;
import java.util.ArrayList;
import java.util.Arrays;
import model.Animals;
import model.Cats;
import model.Dogs;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animals> myList = new ArrayList<>();
        Animals cat = new Cats("cat", "musa", LocalDate.of(2014, 10, 15), Arrays.asList("meow", "ups"));
        Animals dog = new Dogs("dog", "airish", LocalDate.of(2014, 10, 15), Arrays.asList("gow"));

        myList.add(cat);
        myList.add(dog);

        new UserView().userChoice(myList);
        
        
       
        


        

    }
}
