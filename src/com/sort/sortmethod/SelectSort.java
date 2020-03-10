package com.sort.sortmethod;

public class SelectSort extends Base{
    public static void Sort(int[] array){
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++){
                if (array[j]<array[min]){
                    addCompare();
                    min = j;
                }
            }
            if(i!=min)
                swap(array, i, min);
        }
    }
}
