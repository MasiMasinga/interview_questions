package com.company;

public class Main {

    public int numJewelsInStones(String J, String S) {
        int ans  = 0;
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < J.length(); j++){
                if(J.charAt(j) == S.charAt(i)){
                    ans ++;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
