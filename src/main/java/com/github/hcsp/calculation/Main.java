package main.java.com.github.hcsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static String printNumbersInOrder(int a, int b, int c) {
        int[] intArr = {a, b, c};
        Arrays.sort(intArr);
        String[] stringArr = new String[intArr.length];
        for (int i = 0; i < intArr.length; i++) stringArr[i] = String.valueOf(intArr[i]);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(stringArr));
        Collections.reverse(strList);
        return String.join(">", strList);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}

