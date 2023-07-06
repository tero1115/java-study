package test;

public class Solution {

    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
            }
        }

        for (int i = 0; i < sides.length; i++) {
            if (sides[i] != max) {
                temp += sides[i];
            }
        }

        if (max >= temp) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] intArray = {199,72,222};

        // System.out.println(new Solution().solution(7,10));    
        System.out.println(new Solution().solution(intArray));    
        // System.out.println(new Solution().solution(7, 99));    
    }
}
