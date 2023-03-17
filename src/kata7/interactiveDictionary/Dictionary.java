package kata7.interactiveDictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit");
        d.newEntry("Soccer", "A sport");
        System.out.println(d.look("Soccer"));
    }

    private final Map<String, String> dictionary =new HashMap<>();

    public Dictionary() {

    }

    public void newEntry(String key, String value) {
        dictionary.put(key, value);
    }

    public String look(String key) {
        return dictionary.getOrDefault(key, "Cant find entry for " + key);
    }
}
