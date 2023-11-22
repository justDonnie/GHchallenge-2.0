public class Contacts implements InterContacts {
    private long number;
    private String fullName;

    public Contacts(long number, String fullName) {
        this.number = number;
        this.fullName = fullName;
    }
    public Contacts(){

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public void call(long number,Contacts [] contacts) {
            for (int i = 0; i < contacts.length; i++) {
                if (number == contacts[i].getNumber()) {
                    System.out.println(" Calling..." + contacts[i].getNumber()+" "+contacts[i].getFullName());
                }
            }

    }

    @Override
    public void callByName(String fullName, Contacts[]contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if (fullName.equals(contacts[i].getFullName())){
                System.out.println(" You are calling to..."+contacts[i].getFullName()+" "+contacts[i].getNumber());
            }
        }
    }
    @Override
    public void searchContact(String fullName, Contacts[] contacts) {
        for (int i = 0; i < contacts.length ; i++) {
            if (fullName.equals(contacts[i].getFullName())){
                System.out.println(" Contact: "+contacts[i].getFullName()+" "+contacts[i].getNumber());
            }
        }
    }

    @Override
    public void getAllContacts( Contacts[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].toString());
        }
    }

    @Override
    public void updateName(String oldName, long oldNumber, String newName, long newNumber, Contacts[] contacts) {
        for (Contacts f:contacts) {
            if (f.getFullName().equals(oldName) && f.getNumber()==oldNumber) {
                f.setFullName(newName);
                f.setNumber(newNumber);
                System.out.println(newName+" "+newNumber);

            }

        }
    }

    @Override
    public String toString() {
        return "Contacts: " +
                "number " + number +
                " fullName: " + fullName + '\'';
    }
}



//for (Contacts f:contacts) {
//            if (f.getFullName().equals(oldName)){
//                f.setFullName(newName);
//                System.out.println(newName+getNumber());
//            }

//if (oldName.equals(fullName)){
//            oldName.replaceAll(oldName,newName);
//            System.out.println("Contact updated to "+getFullName());


