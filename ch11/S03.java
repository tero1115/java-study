package ch11;

import java.util.HashSet;
import java.util.Set;

public class S03 {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<String>();

        set.add("바나나");
        set.add("사과");
        set.add("바나나");
        set.add("멜론");
        set.add("망고");
        set.add("딸기");

        System.out.println(set);

        // set은 순서가 없기 때문에 번호로 값을 저장 할 수 없다
        // set.get()

        // set는 리스트 안에 값이 있는지 없는지 파악할 때 사용된다
        System.out.println(set.contains("파인애플"));
    }
}
