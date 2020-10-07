package com.company;

public class Main {

    public int longestOnes(int[] A, int K) {
        int result = 0;
        int kUsed = 0;
        int startIdx = 0;
        for (int i = 0; i < A.length; i++) {
            //expand
            if (A[i] == 0) {
                kUsed++;
            }

            //shrink
            while (kUsed > K) {
                if (A[startIdx++] == 0) {
                    kUsed--;
                }
            }

            //update result
            result = Math.max(result, i - startIdx + 1);
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
