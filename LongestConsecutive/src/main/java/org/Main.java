package org;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> list = new HashSet<>();

        int start;
        int count = 1;


        for(Integer i: nums){
            list.add(i);
        }

        for(Integer i : list){
            int inCount = 1;
            if(list.contains(i-1)){
                continue;
            }

            start = i;

            while(list.contains(start+1)){
                inCount += 1;
                start += 1;
            }

            if(inCount > count){
                count = inCount;
            }
        }

        return count;
    }
}