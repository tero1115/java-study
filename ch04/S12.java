package ch04;

public class S12 {
    public static void main(String[] args) {
        // for, while문을 이용해서 별찍기

        //  "*".repeat(3) 이렇게 사용하면 ***이 된다

        // 1
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4
        // *****
        //  ***
        //   *

        for (int i = 5; i > 0; i = i-2) {
            System.out.print(" ".repeat((5 - i) / 2));
            System.out.print("*".repeat(i));
            System.out.println();
        }

        // 5 
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        for (int i = 0; i < 5; i++) {
            if (i>0 && i <4) {
                System.out.print("*");
                System.out.print(" ".repeat(3));
                System.out.print("*");
                System.out.println();
                continue;
            }
            System.out.print("*".repeat(5));
            System.out.println();
        }
    }
}
