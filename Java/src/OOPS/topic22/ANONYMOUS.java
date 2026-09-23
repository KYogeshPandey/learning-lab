package OOPS.topic22;

public class ANONYMOUS {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behaviour without having to create a new class.
        //                   Often used for one time class (Timertask, Runnable, callbacks)

        DOG dog1 = new DOG();
        DOG dog2 = new DOG(){
            @Override
            void speak(){
                System.out.println("Scooby doo says *Ruh Roh* ");
            }
        };


        dog1.speak();
        dog2.speak();


    }
}
