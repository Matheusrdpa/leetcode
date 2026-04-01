package org;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int pL = 0;
        int pR = 0;
        int max = 0;

        while(pR < s.length()){
            char charAtual = s.charAt(pR);

            if(set.contains(charAtual)){
                set.remove(s.charAt(pL));
                pL++;
            }else{
                set.add(charAtual);
                pR++;
                if(set.size() > max) max = set.size();
            }

        }
        return max;
    }


}