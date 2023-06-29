package ch04;

import java.util.Scanner;

public class S03Quiz {
    public static void main(String[] args) {
        // 점수를 입력받아서
        // 90점 이상이면 A
        // 80점 이상이면 B
        // 70점 이상이면 C
        // 60점 이상이면 D
        // 60점 미만이면 F

        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();

        if (nextInt <0 && nextInt >100) {
            System.out.println("잘못 입력하셨습니다.");
            scanner.close();
            return;
        }

        switch (nextInt / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
        
        scanner.close();
    }
}
