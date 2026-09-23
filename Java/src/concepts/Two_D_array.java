package concepts;

public class Two_D_array {
    static void main() {
        // 2D Array = An array where each element is an array
        //            Useful for storig a matrix of data

        String[][] groceries = {{"apple","mango","banana"},
                                {"pea","cucumber","onion"},
                                {"red","black","blue"}};

        groceries [0][2] = "pinapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
