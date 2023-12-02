package model;

import enumClass.Brands;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Long id;
    private String name;
    private String brands;
    private List<Contact>contacts;

    public Phone(Long id, String name, String brands) {
        this.id = id;
        this.name = name;
        this.brands = brands;
    }

    public Phone(Long id, String name, String brands, List<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.brands = brands;
        this.contacts = contacts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    public void SetContact(Contact contact){
        if (this.contacts == null){
            this.contacts = new ArrayList<>();
        }
        contacts.add(contact);

    }


    @Override
    public String toString() {
        return "Phone - " +
                "id: " + id +
                " name: " + name +
                " brands: " + brands +
                " contacts: " + contacts ;
    }
}
