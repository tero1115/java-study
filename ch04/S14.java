package ch04;

public class S14 {
    public static void main(String[] args) {
        // 이중 for문
        // repeat 없이
        // "*"

        // 삼각별 그리기
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

        // 삼각별 그리기
        // *****
        //  ***
        //   *
        // 행이 3개 별이 5 3 1 공백이 0 1 2

        for (int i = 5; i > 0; i = i-2) {
            for (int k =0; k < 5 - i; k= k+2) {
                System.out.print(" ");
            }
            for (int j = 0 ; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단
        // 2 X 1 = 2
        // ...
        // 9 X 9 = 81

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + "= " + i*j);
            }
        }
    }
}
