import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductSearchResults {

    public static void main(String[] args) {

        ArrayList<Product> searchResults = new ArrayList<>();

        searchResults.add(new Product("Nike Black Shoes", 3999));
        searchResults.add(new Product("Puma Running Shoes", 2999));
        searchResults.add(new Product("Adidas Sports Shoes", 4499));

        System.out.println("Search Results:");

        for (int i = 0; i < searchResults.size(); i++) {
            Product product = searchResults.get(i);

            System.out.println(
                    (i + 1) + ". "
                    + product.name
                    + " - ₹" + product.price
            );
        }
    }
}