import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Phone implements InterPhones {
    private String brand;
    private String name;
    private String password;
    private Contacts[] contact;

    public Phone(String brand, String name, String password, Contacts[] contact) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contact = contact;
    }

    public Phone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Contacts[] getContact() {
        return contact;
    }

    public void setContact(Contacts[] contact) {
        this.contact = contact;
    }

    @Override
    public String turnOn1(String password, Phone[] phones) {
        Phone[] phones1 = new Phone[phones.length];
            for (int i = 0; i < phones.length; i++) {
                if (password.equals(phones[i].getPassword())) {
                    phones1[i] = phones[i];
                    System.out.println(" Your " + phones1[i].getName() + " is ON");
                    break;
                }
            }
            return Arrays.toString(phones1);
    }


    @Override
    public String toString() {
        return "Phone- " +
                "brand: " + brand + '\'' +
                " name: " + name + '\'' +
                " password: " + password + '\'' +
                " contact: " + Arrays.toString(contact);
    }
}





//else if (!password.equals(phones[i].getPassword())) {
//                    phones1[i] = phones[i];
//                    System.out.println("Wrong password! Try Again!...");
//                    break;