package observer;

public class ConcreteObservable implements Observable{

    @Override
    public void registerAnimal(String animal) {
        System.out.println("\nAnimal crated.");
        System.out.println("Animal name: " + animal);
    }

}
