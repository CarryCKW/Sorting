package com.sort.sortmethod;

public class InsertSort extends Base {
    public static void Sort(int[] array){
        int n=array.length;
        for (int i=1;i<n;i++){
            for (int j=i;j>0&&Isless(array[j],array[j-1]);j--){
                swap(array,j,j-1);
            }
        }
    }
}
