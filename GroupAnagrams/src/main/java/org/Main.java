package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();

        for (int i = 0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String ch = String.valueOf(c);
            if (!map.containsKey(ch)){
                map.put(ch,new ArrayList<>());
            }
            map.get(ch).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}