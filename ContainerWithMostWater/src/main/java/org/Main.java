package org;

public class Main {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int pR = height.length - 1;
        int pL = 0;
        int record = 0;

        while(pL < pR){
            int width = pR - pL;
            int size = Math.min(height[pR], height[pL]);
            if(width * size > record){
                record = width * size;
            }
            if(height[pL] > height[pR]){
                pR--;
            }else{
                pL++;
            }
        }
        return record;
    }
}