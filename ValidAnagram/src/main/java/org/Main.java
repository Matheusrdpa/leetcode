package org;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
            String s = "racecar";
            String t = "carrace";
            System.out.println(validAnagram(s,t));
        }

    public static boolean validAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char sc = s.charAt(i);
            char st = t.charAt(i);
            sMap.put(sc, sMap.getOrDefault(sc,0)+ 1);
            tMap.put(st, tMap.getOrDefault(st,0)+ 1);
        };

        for(Map.Entry<Character,Integer> entry: sMap.entrySet()){
            if (!tMap.containsKey(entry.getKey()) || !tMap.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        };
        return true;
    }
}
