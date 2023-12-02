import db.DataBase;
import model.Contact;
import model.Phone;
import service.ContactServiceImpl;
import service.PhoneService;
import service.PhoneServiceImpl;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Phone> phonesList = new ArrayList<>();
        List<Contact> contactsList = new ArrayList<>();
        DataBase dataBase = new DataBase(phonesList, contactsList);
        PhoneService phoneService = new PhoneServiceImpl(dataBase);
        ContactServiceImpl contactService = new ContactServiceImpl(dataBase);
        try {
            int a = 0;
            while (a < 22) {
                int k = new Scanner(System.in).nextInt();
                System.out.println(" \t     Choose these commands:  " +
                        "\n 1-> Create and save phones" +
                        "\n 2-> Get phones by ID " +
                        "\n 3-> Update phones " +
                        "\n 4-> Get all list of phones " +
                        "\n 5-> Get all list of phones by brand" +
                        "\n 6-> Delete phones by ID " +
                        "\n 7-> Add contacts to phones" +
                        "\n 8-> Search contacts by name" +
                        "\n 9-> Search contacts by phone number" +
                        "\n 10-> Get sorted list of contacts by name" +
                        "\t  11-> Delete contacts by name from phone");

                switch (k) {
                    case 1:
                        System.out.println(phoneService.addPhone(new ArrayList<>(
                                List.of(new Phone(1010L, "Iphone 14", "APPLE"),
                                        new Phone(1212L, "Samsung S21", "SAMSUNG"),
                                        new Phone(1111L, "Huawei S5", "HUAWEI"),
                                        new Phone(1313L, "Huawei H10", "HUAWEI"))
                        )));
                        break;
                    case 2:
                        System.out.println(phoneService.getPhoneById(1212L));
                        break;
                    case 3:
                        System.out.print("Input phone ID to update phone name!: ");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.print("Enter the new name: ");
                        String newName = new Scanner(System.in).nextLine();
                        System.out.println(phoneService.updatePhoneNameById(id, newName));
                        break;
                    case 4:
                        System.out.println(phoneService.getAllPhones());
                        break;
                    case 5:
                        System.out.print("Input the brand of phones to get all list!: ");
                        String brand = new Scanner(System.in).nextLine();
                        System.out.println(phoneService.getAllPhonesByBrand(brand));
                        break;
                    case 6:
                        System.out.print("Input the phone ID to delete the phone!: ");
                        Long aLong = new Scanner(System.in).nextLong();
                        phoneService.deletePhoneById(aLong);
                        break;
                    case 7:
                        System.out.print("Input the phone ID to save the contact: ");
                        Long bLong = new Scanner(System.in).nextLong();
                        System.out.println(contactService.addContactToPhone(bLong, new ArrayList<>(
                                List.of(new Contact("Leo", "+996777101010"),
                                        new Contact("Andrew", "+996777775454"),
                                        new Contact("Mike", "+996777454565"),
                                        new Contact("Sally", "+996777858585"))
                        )));
                        break;
                    case 8:
                        System.out.print("Input the phone ID to find the contact by name!: ");
                        Long cLong = new Scanner(System.in).nextLong();
                        System.out.print(" Enter the contacts name to search in contact list!: ");
                        String contactName = new Scanner(System.in).nextLine();
                        System.out.println(contactService.findContactByName(cLong, contactName));
                        break;
                    case 9:
                        System.out.print("Input the phone ID to find the contact by number!: ");
                        Long dLong = new Scanner(System.in).nextLong();
                        System.out.print("Input the contacts number to find!: ");
                        String numberList = new Scanner(System.in).nextLine();
                        System.out.println(contactService.findContactByPhoneNumber(dLong, numberList));
                        break;
                    case 10:
                        System.out.print("Input the phone ID to get sorted list of contacts!: ");
                        Long eLong = new Scanner(System.in).nextLong();
                        System.out.println(contactService.sortContactsByName(eLong));
                        break;
                    case 11:
                        System.out.print("Input the phone ID to find contact and delete!: ");
                        Long fLong = new Scanner(System.in).nextLong();
                        System.out.print(" Enter the contacts name to delete!: ");
                        String contactsName = new Scanner(System.in).nextLine();
                        contactService.deleteContactByNameFromPhone(fLong, contactsName);
                        break;
                    default:
                        System.err.println("   \t  Choose only these commands!!!");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Input correct commands!!!");
        }
    }
}