package concepts;

public class overloaded_methods {
    public static void main() {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        String Pizza = bakePizza("flat bread", "Mozzeralla", "Pepparoni");
        System.out.println(Pizza);
    }
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping+ " " +  bread + " " + cheese + " Pizza";
    }
}
