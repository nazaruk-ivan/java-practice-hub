import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // hashMap - a data structure that stores key-value pairs
        //keys have to be unique

        HashMap<String, Double> map = new HashMap<>();

        map.put("macbook M5 2025", 1600.00);
        map.put("iphone Air", 699.00);
        map.put("apple watch", 250.00);
        map.put("galaxy ultra s23", 436.99);

        //map.remove("iphone Air");
        //System.out.println(map.get("apple watch"));
        //System.out.println(map.containsKey("orange"));
        //System.out.println(map.containsValue(250.00));
        //System.out.println(map.size());

        for(String key: map.keySet()){
            System.out.println(key + " : £" +  map.get(key));
        }

    }
}