package com.company;

public class Main {

    public int numberOfSubstrings(String s) {
        int [] count = new int[]{0, 0, 0};
        int i = 0;
        int result = 0;
        for (int j=0; j<s.length(); j++) {
            count[s.charAt(j) - 'a'] += 1;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                count[s.charAt(i++) - 'a'] -= 1;
            }
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
