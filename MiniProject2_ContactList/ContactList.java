package MiniProject2_ContactList;
import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private List<Contact> vList;

    public ContactList() {
        List<Contact> newCT = new ArrayList<>();
        Contact ct1 =
                new Contact("Clelia Miguel","cleliamarcia@gmail","São Paulo", "+1(778)917-6459", "+55(11)2585-8130", "+55(11)99782-6518");
                newCT.add(ct1);
        Contact ct2 =
                new Contact("Anthony Miguel","anthonymmiguel@gmail.com","Bahia", "+55(11)94711-4500", "+55(11)2585-8130", "+1(778)917-6459" );
                newCT.add(ct2);
        this.vList = newCT;
    }

    public Contact getId(int Id) {
        if (Id > 0 && Id < this.vList.size()) {
            return this.vList.get(Id);
        } else {
            return null;
        }
    }

    public void getContacts() {
        for(int i = 0; i < this.vList.size(); i++) {
            Contact contact = this.vList.get(i);
            String vContact = i + ". " + contact.getName() + " | e-mail: " + contact.getEmail() + " | city: " + contact.getCity() + " | phone_number:(mobile ="
                              + contact.getMobile() + ", work= "+  contact.getWork() + ", home= "+ contact.getHome() + ")";
            System.out.println(vContact);
        }
    }

    public void Remove(Contact contact) {
        this.vList.remove(contact);
        System.out.println("Contact removed! ");
    }

    public void Add(Contact contact) {
        if(Validate(contact)) {
            this.vList.add(contact);
            System.out.println("Contact added!");
        }
    }

    public void Update(int Id, Contact contact) {
        this.vList.set(Id, contact);
        System.out.println("Contact updated!");
    }

    private boolean Validate(Contact contact) {
        for(Contact checkContact : this.vList) {
            if (checkContact.getName().equals(contact.getName())) {
                throw new IllegalArgumentException("Contact already exist!");
            }

            if(checkContact.getMobile().equals(contact.getMobile())) {
                throw new IllegalArgumentException("Contact already exist");
            }
        }
        return true;
    }

}
