package com.github.hcsp.calculation;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    /**
     * 给定三个大小不确定的数字a,b,c，将其按照从大到小的顺序输出。
     *
     * <p>例如，a=1,b=3,c=2，返回字符串"3>2>1"。
     *
     * <p>又如，a=-1,b=100,c=4，返回字符串"100>4>-1"
     *
     * @param a 数字一
     * @param b 数字二
     * @param c 数字三
     * @return 所要求的字符串
     */
    public static String printNumbersInOrder(int a, int b, int c) {
        List<Integer> array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
         Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?-1:o1.equals(o2)?0:1;
            }
        });
         StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
          if (stringBuilder.length()==0){
              stringBuilder.append(array.get(i));
          } else {
              stringBuilder.append(">").append(array.get(i));
          }
        }
        return stringBuilder.toString();
       // int array[] = {a,b,c};
//        Arrays.sort(array);
//        return array[2]+">"+array[1]+">"+array[0];
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
