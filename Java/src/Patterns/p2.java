package Patterns;

public class p2 {
    public static void main() {

        // a
        // ab
        // abc
        // abcd

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('a' + j));
            }
            System.out.println();

        }

    }
}
