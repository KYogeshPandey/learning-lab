import java.util.HashMap;
import java.util.Scanner;

    class Product {
        private static int next_id = 1;

        private int product_id;
        String product_name;
        double product_price;

        Product (String p_name, double p_price) {
            this.product_id = next_id++;
            this.product_name = p_name;
            this.product_price = p_price;
        }

        public int getProduct_id(){
            return product_id;
        }

        @Override
        public String toString() {
            return "product{" +
                    "product_id=" + product_id +
                    ", product_name='" + product_name + '\'' +
                    ", product_price=" + product_price +
                    '}';
        }
    }

    class Owner {
        String owner_name;
        int owner_id;

        Owner (int id, String name) {
            this.owner_id = id;
            this.owner_name = name;
        }
    }

    class Operations {

        static HashMap<Integer, Product> productHashmap = new HashMap<>();
        static Scanner sc = new Scanner(System.in);

        static void Create_product() {
            System.out.print("Enter name of product: ");
            String name = sc.next();
            System.out.print("Enter price of product: ");
            double price = sc.nextDouble();

            Product product = new Product(name,price);

            productHashmap.put(product.getProduct_id(),product);

            System.out.println("Product Created....");
            System.out.println(product.getProduct_id() + " : " + product);
        }

        static void Update_product() {
            System.out.print("Enter id of product you want to update: ");
            int id = sc.nextInt();

            Product product = productHashmap.get(id);

            if (product == null) {
                System.out.println("Product not found");
                return;
            }

            System.out.println(
                    product.getProduct_id() + " : " +
                            product.product_name + " : " +
                            product.product_price
            );

            System.out.println("Current Product:");
            System.out.println(product);

            System.out.print("Enter new product name: ");
            String name = sc.next();

            System.out.print("Enter new product price: ");
            double price = sc.nextDouble();

            // Update same object
            product.product_name = name;
            product.product_price = price;

            System.out.println("Product Updated...");
            System.out.println(product);

        }

        static void Delete_product() {
            System.out.print("Enter id of product you want to Delete: ");
            int id = sc.nextInt();

            Product product = productHashmap.remove(id);

            if (product == null) {
                System.out.println("Product not found");
            }
            else {
                System.out.println("Product Deleted....");
            }
        }

        static void Get_product() {

            if (productHashmap.isEmpty()) {
                System.out.println("No product found");
            }
            for (Product product : productHashmap.values()) {
                System.out.println(product);
            }
        }

        static void Exit() {
            System.out.println("Exited....");
        }
    }

public class Shopping extends Operations{
    public static void main(String[] args) {

        System.out.println("Welcome to Shopping Website");

        while (true) {

            System.out.println("\n1. Create Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. See All Products");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 -> Create_product();
                case 2 -> Update_product();
                case 3 -> Delete_product();
                case 4 -> Get_product();
                case 5 -> {
                    Exit();
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }

    }
}
