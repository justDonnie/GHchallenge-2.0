public interface InterContacts {
    void call(long number,Contacts[]contacts);
    void callByName(String fullName,Contacts[]contacts);
    void searchContact(String fullName, Contacts[]contacts);
    void updateName(String oldName,long oldNumber,String newName, long newNumber , Contacts[]contacts);
    void getAllContacts(Contacts[]contacts);
}
