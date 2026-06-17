import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCategoryHashMap {

    public static void main(String[] args) {

        Map<String, List<String>> categoryProducts = new HashMap<>();

        addProduct(categoryProducts, "Electronics", "Laptop");
        addProduct(categoryProducts, "Electronics", "Mobile");
        addProduct(categoryProducts, "Electronics", "Headphones");

        addProduct(categoryProducts, "Clothing", "Shirt");
        addProduct(categoryProducts, "Clothing", "Jeans");

        addProduct(categoryProducts, "Books", "Java Programming");
        addProduct(categoryProducts, "Books", "Data Structures");

        displayCategories(categoryProducts);

        System.out.println("\nElectronics Products:");
        displayProductsByCategory(categoryProducts, "Electronics");
    }

    static void addProduct(
            Map<String, List<String>> categoryProducts,
            String category,
            String product
    ) {

        categoryProducts
                .computeIfAbsent(category, key -> new ArrayList<>())
                .add(product);
    }

    static void displayCategories(
            Map<String, List<String>> categoryProducts
    ) {

        for (Map.Entry<String, List<String>> entry
                : categoryProducts.entrySet()) {

            System.out.println(
                    entry.getKey() + " → " + entry.getValue()
            );
        }
    }

    static void displayProductsByCategory(
            Map<String, List<String>> categoryProducts,
            String category
    ) {

        List<String> products = categoryProducts.get(category);

        if (products == null) {
            System.out.println("Category not found.");
            return;
        }

        for (String product : products) {
            System.out.println(product);
        }
    }
}