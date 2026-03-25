package org;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[] {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(input, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i<nums.length;i++){
            int n = nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(new int[] {entry.getValue(),entry.getKey()});
        }

        list.sort((a,b) -> b[0]-a[0]);
        int[] res = new int[k];

        for (int i = 0; i<k; i++){
            res[i] = list.get(i)[1];
        }

        return res;
    }
}