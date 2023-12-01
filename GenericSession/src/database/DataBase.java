package database;

import model.Animal;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Person>people=new ArrayList<>();
    private List<Animal>animals=new ArrayList<>();

    public DataBase() {
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
