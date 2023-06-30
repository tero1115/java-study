package ch04;

public class S07 {
    public static void main(String[] args) {
        // ctrl + c 로 강제 종료 가능
        int i = 1;
        while (true) {
            if (i > 1000) {
                // while문 내부에서 반복을 멈출 때 사용
                System.out.println("반복 종료 " + i);
                break;
            }
            System.out.println(i);
            i++;
            
        }
    }
}
