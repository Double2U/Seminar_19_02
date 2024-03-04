import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.LinkedHashMap;

public class PhoneBook {

    private Map<String, ArrayList<Integer>> contacts = new HashMap<>();

    public void addContact(String name, Integer phoneNum) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum);
            contacts.put(name, phoneNumbers);
          }
        }

    public ArrayList<Integer> showPhoneNumber(String name){
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            return phoneNumbers;
          }
        }
        
    public void printSortedPhoneBook(){
        if (!contacts.isEmpty()) {
            contacts = contacts.entrySet()
                                .stream()
                                .sorted(comparingInt(e -> -e.getValue().size()))
                                .collect(Collectors.toMap(Map.Entry::getKey,
                                                            Map.Entry::getValue,
                                                             (e1, e2) -> e1,
                                                             LinkedHashMap::new));
            System.out.println(contacts);
            
        }
        else {
            System.out.println("Телефонная книга пуста");
        }
        

    }    
} 

