package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();


        for(int i = 0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int pL = i+1;
            int pR = nums.length -1;
            while (pL < pR){
                int sum = nums[pL] + nums[pR] + nums[i];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[pL],nums[pR]));
                    pL++;
                    while(pL<pR && nums[pL] == nums[pL-1]){
                        pL++;
                    }
                }else if(sum < 0){
                    pL++;
                }else{
                    pR--;
                }
            }
        }
        return res;
    }
}