package ch08;

public class S01 {
    public static void main(String[] args) {

        System.out.println("이전 코드");
        
        try {
            // 예외가 일어날 수 있는 코드
            System.out.println(10 / 0);
        // catch 특징 예외가 발생했을 때
        // 프로그램을 멈추지 않고 처리한 뒤 다음으로 넘긴다
        } catch (ArithmeticException e) {
            System.out.println("계산중에 예외가 발생했습니다.");
        }

        System.out.println("다음 코드");

    }
}
