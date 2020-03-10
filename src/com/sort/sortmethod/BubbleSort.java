package com.sort.sortmethod;

public class BubbleSort extends Base{
    public static void Sort(int[] array){
        for (int i=1;i<array.length;i++){
            for (int j=0;j<array.length - 1;j++){
                if(array[j]>array[j+1]){
                    addCompare();
                    swap(array,j+1, j);
                }
            }
        }
    }
}
