package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        // 숫자 1000 ~ 1사이 중에서
        // 5의 배수만 제외하고 출력하시오
        // 101 미만이되면 작동을 멈추시오

        int i = 1000;
        while (i > 0) {
            if (i % 5 == 0) {
                i--;
                continue;
            }
            if (i < 101) {
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
