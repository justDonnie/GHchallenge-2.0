package impl;

import database.DataBase;
import enumPack.Gender;
import model.Person;
import service.GenericService;
import java.util.Comparator;
import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {

    private DataBase dataBase;

    public PersonServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String add(List<Person> people) {
        dataBase.getPeople().addAll(people);
        return "People are saved!!!";
    }

    @Override
    public Person getById(Long id) {
        for (Person s : dataBase.getPeople()) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String removeByName(String name) {
        for (Person d : dataBase.getPeople()) {
            if (d.getName().equalsIgnoreCase(name)) {
                dataBase.getPeople().remove(d);
                return "Person is successfully deleted!";
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return dataBase.getPeople();
    }

    @Override
    public List<Person> sortByName(String z) {
        if (z.equalsIgnoreCase("a")) {
            dataBase.getPeople().sort(personComparator1);
            return dataBase.getPeople();
        } else if (z.equalsIgnoreCase("z")) {
            dataBase.getPeople().sort(personComparator2);
            return dataBase.getPeople();
        }
        return null;
    }

    @Override
    public List<Person> filterByGender() {
        for (Person d : dataBase.getPeople()) {
            if (d.getGender().equals(Gender.MALE)) {
                System.out.println(d);
            } else if (d.getGender().equals(Gender.FEMALE)) {
                System.out.println(d);
            }
        }
        return null;
    }

    @Override
    public List<Person> clear() {
        dataBase.getPeople().clear();
        return dataBase.getPeople();
    }


    public static Comparator<Person> personComparator1 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Person> personComparator2 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };
}
