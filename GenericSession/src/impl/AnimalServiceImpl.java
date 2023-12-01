package impl;

import database.DataBase;
import enumPack.Gender;
import model.Animal;
import service.GenericService;
import java.util.Comparator;
import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {
    private List<Animal> animals;
    private DataBase dataBase;

    public AnimalServiceImpl(List<Animal> animals) {
        this.animals = animals;
    }

    public AnimalServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String add(List<Animal> animals) {
        dataBase.getAnimals().addAll(animals);
        return "Animals are saved! ";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal s : dataBase.getAnimals()) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String removeByName(String name) {
        for (Animal d : dataBase.getAnimals()) {
            if (d.getName().equalsIgnoreCase(name)) {
                dataBase.getAnimals().remove(d);
                return "Animal is successfully deleted!!!";
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return dataBase.getAnimals();
    }

    @Override
    public List<Animal> sortByName(String z) {
        if (z.equalsIgnoreCase("a")) {
            dataBase.getAnimals().sort(animalComparator1);
            return dataBase.getAnimals();
        } else if (z.equalsIgnoreCase("z")) {
            dataBase.getAnimals().sort(animalComparator2);
            return dataBase.getAnimals();
        }
        return null;
    }

    @Override
    public List<Animal> filterByGender() {
        for (Animal g : dataBase.getAnimals()) {
            if (g.getGender().equals(Gender.MALE)) {
                System.out.println(g);
            } else if (g.getGender().equals(Gender.FEMALE)) {
                System.out.println(g);
            }
        }
        return null;
    }

    @Override
    public List<Animal> clear() {
        dataBase.getAnimals().clear();
        return dataBase.getAnimals();
    }


    public static Comparator<Animal> animalComparator1 = new Comparator<Animal>() {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Animal> animalComparator2 = new Comparator<Animal>() {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };
}
