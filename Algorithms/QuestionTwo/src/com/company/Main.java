package com.company;

public class Main {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
