package service;

import db.DataBase;
import model.Contact;
import model.Phone;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContactServiceImpl implements ContactService {
private final DataBase dataBase;

    public ContactServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addContactToPhone(Long phoneId, List<Contact> contact) {
        for (Phone f: dataBase.getPhone()) {
            if (f.getId().equals(phoneId)){
                f.setContacts(contact);
                return "Contact is saved!!!";
            }
        }
        return null;
    }

    @Override
    public Contact findContactByName(Long phoneId, String contactName) {
        List<Phone> list = dataBase.getPhone().stream().filter(phone -> phone.getId().equals(phoneId)).toList();
        List<Contact> list1 = list.get(0).getContacts().stream().filter(contact -> contact.getName().equalsIgnoreCase(contactName)).toList();
        Contact contact = (Contact) list1.get(0);
//        Contact contact=new Contact();
//        for (Contact c:list1) {
//            contact.setName(c.getName());
//            contact.setPhoneNumber(c.getPhoneNumber());
//        }
        return contact;//list.get(0);
    }

    @Override
    public Contact findContactByPhoneNumber(Long phoneId, String phoneNumber) {
        List<Phone>list = dataBase.getPhone().stream().filter(phone -> phone.getId().equals(phoneId)).toList();
        List<Contact>contacts = list.get(0).getContacts().stream().filter(contact -> contact.getPhoneNumber().equals(phoneNumber)).toList();
        Contact contact = (Contact) contacts.get(0);
        return contact;
    }

    @Override
    public List<Contact> sortContactsByName(Long phoneId) {
        List<Phone>phones = dataBase.getPhone();
        List<Contact>contacts =
                phones.stream().filter(phone -> phone.getId().equals(phoneId)).flatMap(phone -> phone.getContacts().stream()).sorted(Comparator.comparing(Contact::getName))
                        .collect(Collectors.toList());

        return contacts;
    }
    @Override
    public void deleteContactByNameFromPhone(Long phoneId, String contactName) {
        List<Phone>phones = dataBase.getPhone();
        for (Phone s:phones) {
            if (s.getId().equals(phoneId)){
                List<Contact>contacts = s.getContacts();
                contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(contactName));
                System.out.println("Successfully deleted!!!");
            }
        }
    }

}
