package com.sort.RandomData;

public class RandomArray {
    private int number;

    public RandomArray(int[] arr,int len){
        System.out.println("当前数组容量: " + len);
        for (int i=0;i<len;i++){
            number=(int)(Math.random()*1000000);
            arr[i]=number;
        }
    }
}
