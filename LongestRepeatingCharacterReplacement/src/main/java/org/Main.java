package org;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        int l = 0;
        int[] count = new int[26];
        int res = 0;
        int maxFreq = 0;

        for (int r = 0; r<s.length();r++){
            int pR = s.charAt(r) - 'A';
            count[pR]++;

            maxFreq = Math.max(maxFreq, count[pR]);

            if ((r-l+1) - maxFreq > k){
                int pL = s.charAt(l) - 'A';
                count[pL]--;
                l++;
            }
            res = Math.max(res,(r-l+1));
        }
        return res;
    }
}