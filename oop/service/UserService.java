package service;

import java.time.LocalDate;
import java.util.List;

import model.Animals;
import model.Camels;
import model.Cats;
import model.Dogs;
import model.Donkeys;
import model.Hamsters;
import model.Horses;
import observer.ConcreteObservable;
import observer.Observable;

public class UserService implements DataService {
    Observable observable = new ConcreteObservable();

    @Override
    public Animals createAnimals(String type, String name, LocalDate birthday, List<String> commands) {
        Animals animal;

        switch (type.toLowerCase()) {
            case "cat":
                animal = new Cats(type, name, birthday, commands);
                break;
            case "dog":
                animal = new Dogs(type, name, birthday, commands);
                break;
            case "hamster":
                animal = new Hamsters(type, name, birthday, commands);
                break;
            case "horse":
                animal = new Horses(type, name, birthday, commands);
                break;
            case "donkey":
                animal = new Donkeys(type, name, birthday, commands);
                break;
            case "camel":
                animal = new Camels(type, name, birthday, commands);
                break;
            default:
                System.out.println("Некорректный тип животного!");
                return null;
        }
        observable.registerAnimal(animal.getName());
        return animal;
    }

}
