package SDA_exercises.Ex4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> inventory;

    public Storage() {
        this.inventory = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        inventory.computeIfAbsent(key, t -> new ArrayList<>());
        inventory.get(key).add(value);
/*        List<String> values = inventory.get(key);
        if (values == null){
            values = new ArrayList<>();
        }
        values.add(value);
        inventory.put(key,values);*/
    }

    public void printValues(String key){
        inventory.get(key)
                .stream()
                .forEach(System.out::println);

/*        String [] values = inventory.entrySet()
                .stream()
                .filter(x -> x.getKey().matches(key))
                .map(Entry -> "Key: " + Entry.getKey() + ", Value: "+ Entry.getValue())
                .toArray(String[] :: new);

        System.out.println(String.join(",\n", values) + ".");*/
    } //displaying all elements under a given key

    public List<String> findKeys(String value){
        return inventory
                .entrySet()
                .stream()
                .filter(kvp -> kvp.getValue().contains(value))
                .map(kvp -> kvp.getKey())
                .collect(Collectors.toList());

 /*        String [] keys = inventory.entrySet()
                .stream()
                .filter(x -> x.getValue().stream().filter(y -> y.matches(value)).)
                .map(Entry -> "Key: " + Entry.getKey() + ", Value: "+ Entry.getValue())
                .toArray(String[] :: new);

        System.out.println(String.join(",\n", keys) + ".");*/
    } // displaying all keys that have a given value*/



}


