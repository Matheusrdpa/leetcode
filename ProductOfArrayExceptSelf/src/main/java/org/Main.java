package org;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums){
        int[] res = new int[nums.length];

        int accLeft = 1;
        for (int i = 0; i<nums.length;i++){
            res[i] = accLeft;
            accLeft *= nums[i];
        }

        int accRight = 1;
        for (int i = res.length-1; i>=0;i--){
            res[i] *= accRight;
            accRight *= nums[i];
        }
        return res;
    }
}