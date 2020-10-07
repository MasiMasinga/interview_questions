package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> printVertically(String inputs) {
        List<String> result = new ArrayList<String>();
        String[] strList = inputs.split(" ");
        int maxLenth = 0;
        for (int i = 0; i < strList.length; i++) {
            strList[i] = strList[i].strip();
            maxLenth = Math.max(maxLenth, strList[i].length());
        }

        for (int i = 0; i < maxLenth; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strList.length; j++) {
                char ch = ' ';
                if (i <= strList[j].length() - 1) {
                    ch = strList[j].charAt(i);
                }
                sb.append(ch);
            }
            result.add(sb.toString().stripTrailing());
        }

        return result;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
