package OOPS.topic11;

public class INTERFACE {
    static void main(String[] args) {

        //Interface  =  A blueprint for a class that specifies a set of abstract methods.
        //              that implemmenting classes MUST define.
        //              Supports multiple inheritance like behaviour.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        fish fish = new fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

    }
}
