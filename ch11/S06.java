package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class S06 {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.add("사과");
        queue.add("바나나");
        queue.add("멜론");

        System.out.println(queue);

        queue.poll();

        // 선입선출, 음식점, 은행 번호표
        System.out.println(queue);
    }
}
