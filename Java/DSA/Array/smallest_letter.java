// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// 744. Find Smallest Letter Greater Than Target

public class smallest_letter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
        
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int last = letters.length - 1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (target < letters[mid]) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }
}
