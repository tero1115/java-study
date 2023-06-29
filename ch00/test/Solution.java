package ch00.test;

public class Solution {

    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        // System.out.println(new Solution().solution(10));    
        // System.out.println(new Solution().solution(4));    
        // System.out.println(new Solution().solution(7, 99));    
    }
}
