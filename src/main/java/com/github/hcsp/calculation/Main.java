package com.github.hcsp.calculation;

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
        //用冒泡排序实现对数组进行从大到小排序
        int arr[]={a,b,c};//定义一个数组，用于存放函数的实参。
        for (int i = 0; i <=arr.length-1 ; i++) {//第一遍循环次数与实参个数有关
            for (int j = 0; j <arr.length-i-1 ; j++) {//第二遍循环次数与实参比较次数有关
                int temp;//定义一个临时变量
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return (arr[0]+">"+arr[1]+">"+arr[2]);
    }

    public static void main(String[] args) {
        System.out.println(printNumbersInOrder(1, 2, 3));
        System.out.println(printNumbersInOrder(-1, 2, -3));
    }
}
