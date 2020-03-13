package com.sort.sortmethod;

public class ShellSort extends Base{
    public static void Sort(int[] array){
        int temp;
        int j;
        int x = 0;

        for (int r = array.length / 2; r >= 1; r /= 2) {
            for (int i = r; i < array.length; i++) {
                temp = array[i];
                addAssign();
                j = i - r;
                while (j >= 0 && temp < array[j]) {
                    array[j + r] = array[j];
                    j -= r;
                    addCompare();
                }
                array[j + r] = temp;
                addAssign();
            }
            x++;
        }
    }
}
