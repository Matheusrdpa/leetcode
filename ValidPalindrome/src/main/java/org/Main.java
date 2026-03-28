package org;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder newString = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newString.append(Character.toLowerCase(c));
            }
        }

        if(newString.length() == 0) return true;

        int start = 0;
        int end = newString.length() - 1;

        while(start <= end){
            if(newString.charAt(start) != newString.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}