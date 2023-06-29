package test;

public class Solution {

    public int[] solution(String[] strlist) {
        int[] answer = {};
        for (int i = 0; i < strlist.length; i++) {
             answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        // System.out.println(new Solution().solution(7));    
        // System.out.println(new Solution().solution(4));    
        // System.out.println(new Solution().solution(7, 99));    
    }
}
