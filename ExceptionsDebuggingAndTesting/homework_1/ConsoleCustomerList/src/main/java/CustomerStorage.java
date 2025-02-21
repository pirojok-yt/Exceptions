import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws TooMuchDataException,WrongEmailException, FewDataException, WrongNumberException {
        if(data.split("\\s+").length > 4) {
            throw new TooMuchDataException("Too much data");
        }
        else if(data.split("\\s+").length < 4){
            throw new FewDataException("Not enough data");
        }
        final String eRegex = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]+";
        final String nRegex = "[+][0-9]{11}";
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if(!components[INDEX_EMAIL].matches(eRegex)){
            throw new WrongEmailException("Email:" + components[INDEX_EMAIL] + " is not valid");
        }
        if(!components[INDEX_PHONE].matches(nRegex)) {
            throw new WrongNumberException("Number: " + components[INDEX_PHONE] + " is not valid");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}