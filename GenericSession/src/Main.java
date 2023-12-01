import database.DataBase;
import enumPack.Gender;
import impl.AnimalServiceImpl;
import impl.PersonServiceImpl;
import model.Animal;
import model.Person;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        method1();
        method2();


    }

    public static void method1() {
        List<Person> people = new ArrayList<>(
                List.of(new Person(1010L, "Messi", 34, Gender.MALE),
                        new Person(1011L, "Linda", 27, Gender.FEMALE),
                        new Person(1237L, "Anjela", 25, Gender.FEMALE),
                        new Person(3456L, "Sam", 32, Gender.MALE),
                        new Person(2254L, "Zack", 22, Gender.MALE))
        );

        DataBase dataBase = new DataBase();
        PersonServiceImpl personService = new PersonServiceImpl(dataBase);

        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\t        Commands: " +
                        "\n1-> Save list of object" +
                        "  \t2-> Get object by ID " +
                        "\n3-> Delete object by name" +
                        "  \t4-> Get list of all objects" +
                        "\n5-> Sort objects name" +
                        "    \t6-> Filter by gender" +
                        "\n 7-> Clear all list of objects" +
                        "  \t 8 -> ANIMAL SERVICE !!! ");
                int a = scanner.nextInt();
                switch (a) {
                    case 1 -> System.out.println(personService.add(people));
                    case 2 -> System.out.println(personService.getById(1011L));
                    case 3 -> System.out.println(personService.removeByName("Zack"));
                    case 4 -> System.out.println(personService.getAll());
                    case 5 -> {
                        System.out.println("Choose a letter to sort names of people: (A - ascending)***(Z - descending)!!!");
                        String d = new Scanner(System.in).nextLine();
                        System.out.println(personService.sortByName(d));
                    }
                    case 6 -> System.out.println(personService.filterByGender());
                    case 7 -> System.out.println(personService.clear());
                    case 8 -> method2();

                    default -> System.out.println("\t Choose only this Commands!!!: ");

                }
            }
        } catch (InputMismatchException e) {
            System.err.println(" Input correct commands!!!");
        }
    }

    public static void method2() {
        DataBase dataBase = new DataBase();
        AnimalServiceImpl animalService = new AnimalServiceImpl(dataBase);
        System.out.println("YOU ARE IN AN ANIMAL SERVICE !!!");
        List<Animal> animals = new ArrayList<>(
                List.of(new Animal(200L, "Lion", 4, Gender.MALE),
                        new Animal(201L, "Bear", 6, Gender.FEMALE),
                        new Animal(202L, "Shark", 3, Gender.MALE),
                        new Animal(203L, "Hippo", 5, Gender.FEMALE),
                        new Animal(204L, "Crocodile", 9, Gender.MALE))
        );


        while (true) {
            System.out.println("\t        Commands: " +
                    "\n9-> Save list of object" +
                    "  \t10-> Get object by ID " +
                    "\n11-> Delete object by name" +
                    "  \t12-> Get list of all objects" +
                    "\n13-> Sort objects name" +
                    "    \t14-> Filter by gender" +
                    " \t \n 15-> Clear all list of objects" +
                    "\n16 -> PERSON SERVICE !!! ");
            try {
                Scanner scanner1 = new Scanner(System.in);

                int d = scanner1.nextInt();

                switch (d) {
                    case 9 -> System.out.println(animalService.add(animals));
                    case 10 -> System.out.println(animalService.getById(202L));
                    case 11 -> System.out.println(animalService.removeByName("Crocodile"));
                    case 12 -> System.out.println(animalService.getAll());
                    case 13 -> {
                        System.out.println(" Choose a letter to sort names of animals( A - ascending )***( Z - descending ) ");
                        String letter = new Scanner(System.in).nextLine();
                        System.out.println(animalService.sortByName(letter));
                    }
                    case 14 -> System.out.println(animalService.filterByGender());
                    case 15 -> System.out.println(animalService.clear());
                    case 16 -> method1();
                    default -> System.out.println("       \t Choose only this Commands!!!: ");
                }
            } catch (InputMismatchException e) {
                System.err.println(" Input correct commands!!!");
            } catch (ArithmeticException e) {
                System.out.println("!");
            }
        }

    }
}