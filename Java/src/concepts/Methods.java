package concepts;

public class Methods {
    public static void main(String[] args){

        String name = "Yogesh";
        int age = 14;

        // happybirthday(name,age);
        double result = square(3);
        System.out.println(result);
        System.out.println(cube(3));
        String fullname = getFullname("Yogesh", "Pandey");
        System.out.println(fullname);
        if(ageCheck(age)){
            System.out.println("You can sign up!");
        }
        else{
            System.out.println("You must 18+ to sign up!");
        }
    }
    static void happybirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!");
    }
    static double square(double num){
        return num * num;
    }
    static double cube(double num){
        return num * num * num;
    }
    static String getFullname(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        return age >= 18;
    }
}
