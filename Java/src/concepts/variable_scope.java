package concepts;

public class variable_scope {

    int x = -1;  // CLASS
    public static void main() {

        // variable scope = where a variable can be accessed

        int x = 0; // LOCAL
        doSomething();
        System.out.println(x);
    }
    static void doSomething(){
        int x = 1;  // LOCAL
        System.out.println(x);
    }

}
