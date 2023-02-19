import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {

    public SortedMap<String, String> contactList = new TreeMap<>();

    public int add(String name, String number) {
        if (!contactList.containsValue(number)) {
            contactList.put(name, number);
        } else {
            System.out.println("Данный контакт уже добавлен в телефонную книгу :(");
        }
        return contactList.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contactList.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return contactList.get(name);
    }

    public void printAllNames() {
        for (Map.Entry<String, String> entry : contactList.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}