package concepts;

public class NestedLoops {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a Student discount of 10%");
                System.out.println("You get a Senior discount of 20%");

                price = price*0.7;
            }
            else{
                System.out.println("You get only Student discount (10%)");
                price *= 0.9;

            }
        }
        else{
            if(isSenior){
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;

            }
        }
        System.out.printf("the price is %.2f", price);
    }

}
