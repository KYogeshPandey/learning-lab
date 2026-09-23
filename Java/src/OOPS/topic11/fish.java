package OOPS.topic11;

public class fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*the fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("*the fish is hunting*");
    }



}
