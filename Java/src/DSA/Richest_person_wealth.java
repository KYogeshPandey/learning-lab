package DSA;

public class Richest_person_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {9,1,6},
                {3,3,7}
        };
        System.out.println(maximumWealth(accounts));

    }
    static  int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        // take max = 0 initially
        int max = 0;
        for (int person = 0; person < accounts.length; person++){
            // whenever start a new col, take a new rowsum
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];

            }

            // now we have sum of accounts of person
            // check with overall ans
            if (rowsum > max){
                max = rowsum;
            }

        }
        return max;
    }
}
