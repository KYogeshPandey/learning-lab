package DSA;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {14,3,57,-4,0,87,888};
        System.out.println(Min(arr));

    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int Min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans > arr[i]){
                ans = arr[i];
            }

        }
        return ans;
    }
}
