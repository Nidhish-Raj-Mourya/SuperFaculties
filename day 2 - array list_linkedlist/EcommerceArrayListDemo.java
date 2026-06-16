import java.util.ArrayList;
import java.util.List;

class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class EcommerceArrayListDemo {

    public static void main(String[] args) {

        // Simulating products fetched from a database
        List<Product> products = fetchProducts();

        System.out.println("E-commerce Product List:");

        for (Product product : products) {
            System.out.println(
                    product.id + ". "
                    + product.name
                    + " - Rs. " + product.price
            );
        }
    }

    // This method acts like a fake database
    static List<Product> fetchProducts() {

        ArrayList<Product> products = new ArrayList<>();

        products.add(
                new Product(1, "Nike Shoes", 3999)
        );

        products.add(
                new Product(2, "Puma Shoes", 2999)
        );

        products.add(
                new Product(3, "Boat Headphones", 1999)
        );

        return products;
    }
}