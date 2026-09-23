package OOPS.topic24;

public class GENERICS {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)


        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("Ticket", 15);

        System.out.println(product2.getPrice());
        System.out.println(product2.getItem());


    }
}
