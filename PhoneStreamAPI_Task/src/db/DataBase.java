package db;

import model.Contact;
import model.Phone;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Phone> phone;
    private List<Contact>contacts;

    public DataBase(List<Phone> phone, List<Contact> contacts) {
        this.phone = phone;
        this.contacts = contacts;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
