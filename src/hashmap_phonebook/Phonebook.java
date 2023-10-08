package hashmap_phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private static Map<String, Contact> allContacts = new HashMap<>();

    public static void main(String[] args) {
        addContacts();
        printAll();
    }

    private static void addContacts() {
        addContact(new Contact("Соседи", "Дарын"));
        addContact(new Contact("Работа", "Дарын"));
        addContact(new Contact("Соседи", "Петр"));
        addContact(new Contact("Соседи", "Федор"));
        addContact(new Contact("Работа", "Петр"));
        addContact(new Contact("Работа", "Олжас"));
    }

    private static void addContact(Contact contact) {
        allContacts.put(contact.getGroupName(), contact);
    }

    private static void printAll() {
        for (Map.Entry<String, Contact> entry : allContacts.entrySet()) {
            System.out.println("group: " + entry.getKey() + ", name: " + entry.getValue());
        }
    }
}
