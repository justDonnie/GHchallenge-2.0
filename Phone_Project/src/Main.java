import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Contacts contacts1 = new Contacts(996777232427L, "James Milner");
        Contacts contacts2 = new Contacts(996777245673L, "Leo Messi");
        Contacts contacts3 = new Contacts(996707232323L, "Pablo Gavi");
        Contacts contacts4 = new Contacts(996555232703L, "Erling Haaland");
        Contacts[] contacts = {contacts1, contacts2, contacts3, contacts4};

        Phone phone1 = new Phone("Apple", "Iphone 14", "apple123", contacts);
        Phone phone2 = new Phone("Apple", "Iphone 13", "apple321", contacts);
        Phone[] phones = {phone1, phone2};
        int m1 = 0;
        while (m1 < 10) {
            Scanner scanner0 = new Scanner(System.in);
            System.out.println("Choose a phone: (Iphone 14)*{apple123}/(Iphone 13)*{apple321}:");
            String phone = scanner0.nextLine();
            for (Phone phone3 : phones) {
                if (phone.equals(phone3.getName())) {
                    int a = 0;
                    while (a < 2) {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Turn ON (password):");
                        try {
                            String password = scanner1.nextLine();
                            if (password.length() < 8) {
                                System.out.println(password.length());
                            throw new MyException("Password should contains 8 symbols!!!");
                            }
                            while (password.equals(phone3.getPassword())) {
                                phone3.turnOn1(password, phones);
                                System.out.println("a-> call with number" + "\n" +
                                        "b-> call to contact by name \n" +
                                        "c-> search contact by name \n" +
                                        "d-> change contact        \n" +
                                        "e-> get all contact list");
                                int m = 0;
                                while (m < 10) {
                                    Scanner scanner = new Scanner(System.in);
                                    String s = scanner.nextLine();
                                    switch (s) {
                                        case "a":
                                            contacts1.call(996777245673L, contacts);
                                            break;
                                        case "b":
                                              contacts1.callByName("Pablo Gavi", contacts);
                                            break;
                                        case "c":
                                            contacts1.searchContact("James Milner", contacts);
                                            break;
                                        case "d":
                                            contacts1.updateName("Leo Messi", 996777245673L, "Ulan K", 996777787546L, contacts);
                                            break;
                                        case "e":
                                            contacts1.getAllContacts(contacts);
                                            break;
                                        default:
                                            System.out.println("Choose only these commands!!!\n" +
                                                    "a-> call with number" + "\n" +
                                                    "b-> call to contact by name \n" +
                                                    "c-> search contact by name \n" +
                                                    "d-> change contact        \n" +
                                                    "e-> get all contact list ");
                                    }
                                }
                            }
                        }catch (MyException m){
                            System.out.println(m.getMessage());
                        }
                    }
                }
            }
        }
    }
}


//||p.equals(phone2.turnOn1("apple321",phones)

//1 если 996 менен башталбаса это не кыргызский номер
//2 андай контакт жок болсо такого контакта не сущест
//3андай контакт жок болсо не найден
// если озгорулуп аткан контакты аты окшош болсо "такой контакт уже существует"
//
