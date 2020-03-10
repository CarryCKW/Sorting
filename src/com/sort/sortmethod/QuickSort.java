package com.sort.sortmethod;

public class QuickSort extends Base{
    public static void Sort(int[] array){
        quickSort(array,0,array.length-1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left<right){
            int mid=getMiddle(array,left,right);
            quickSort(array,left,mid-1);
            quickSort(array,mid+1,right);
        }
    }

    private static int getMiddle(int[] array, int left, int right) {
        int temp=array[left];
        while (left<right){
            while (left<right&& array[right]>=temp){
                right--;
                addCompare();
            }
            array[left]=array[right];
            addAssign();
            while(left<right&&array[left]<temp){
                left++;
                addCompare();
            }
            array[right]=array[left];
            addAssign();
        }
        array[left]=temp;
        addAssign();
        return left;
    }
}
