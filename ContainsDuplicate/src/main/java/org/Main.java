package org;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0) + 1);
            if (hashMap.get(nums[i]) > 1){
                return true;
            }
        }
        return false;
    }
}