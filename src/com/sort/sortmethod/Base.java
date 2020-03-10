package com.sort.sortmethod;

import org.w3c.dom.ls.LSOutput;

public abstract class Base {
    public static long  Compare=0;
    public static long  Assign=0;
    public static void Sort(int[] array){

    }

    public static boolean Isless(int x,int y){
        Compare++;
        return x<y;
    }

    public static void swap(int[] arr, int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        Assign++;
    }

    public static void show(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static boolean Issorted(int[] arr){
        for(int i=1;i<arr.length;i++) {
            if (Isless(arr[i], arr[i - 1]))
                return false;
        }
        return true;
    }

    public static void recover(){
        Compare=0;
        Assign=0;
    }

    public static void addCompare(){
        Compare++;
    }
    public static void addAssign(){
        Assign++;
    }

    public static long getCompare(){
        return Compare;
    }
    public static long getAssign(){
        return Assign;
    }
}
