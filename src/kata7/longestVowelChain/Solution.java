package kata7.longestVowelChain;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("codewarriors"));
    }
private static final List<Character> VOWEL_LIST = List.of('a','e','i','o','u');
    public static int solve(String s){
        int temp=0;
        int result=0;
        for (int i = 0; i <s.length() ; i++) {
            if(!VOWEL_LIST.contains(s.charAt(i))){
                temp=0;
            } else{
                temp++;
            }

            result = Math.max(result,temp);
        }

        return result;
    }
}
