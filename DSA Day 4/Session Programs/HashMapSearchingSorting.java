import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSearchingSorting {

    public static void main(String[] args) {

        Map<Integer, String> products = new HashMap<>();

        products.put(103, "Laptop");
        products.put(101, "Mobile");
        products.put(102, "Keyboard");

        // Search using key
        System.out.println(
                "Product 102: " + products.get(102)
        );

        // Check key
        System.out.println(
                "Contains key 101: "
                        + products.containsKey(101)
        );

        // Check value
        System.out.println(
                "Contains Laptop: "
                        + products.containsValue("Laptop")
        );

        // Sort HashMap by key using TreeMap
        Map<Integer, String> sortedProducts =
                new TreeMap<>(products);

        System.out.println(
                "Sorted by key: " + sortedProducts
        );
    }
}