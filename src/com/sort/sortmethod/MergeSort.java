package com.sort.sortmethod;


public class MergeSort extends Base {
    public static void Sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);

    }

    private static void merge(int[] a, int left, int mid, int right) {

        int[] tmp = new int[a.length];
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex = left;
        // 逐个归并
        while (left <= mid && r1 <= right) {
            if (a[left] <= a[r1])
                tmp[tIndex++] = a[left++];
            else
                tmp[tIndex++] = a[r1++];
            addAssign();
            addCompare();
        }
        // 将左边剩余的归并
        while (left <= mid) {
            tmp[tIndex++] = a[left++];
            addAssign();
        }
        // 将右边剩余的归并
        while (r1 <= right) {
            tmp[tIndex++] = a[r1++];
            addAssign();
        }

        //从临时数组拷贝到原数组
        while (cIndex <= right) {
            a[cIndex] = tmp[cIndex];
            cIndex++;
            addAssign();
        }
    }
}
/*public class MergeSort extends Base{

    public static void Sort(int[] arr){

        sort(arr,0,arr.length);
    }

    private static void sort(int[] a,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        int[] temp= new int[a.length];
        sort(a,left,mid);
        sort(a,mid+1,right);
        int i=left,j=mid+1,k=left;
        while (i<=mid&&j<=right){
            if(Isless(a[i],a[j])){
                temp[k]=a[i];
                k++;
                i++;
            }
            else{
                temp[k]=a[j];
                k++;
                j++;
            }
            addAssign();
        }
        while(i<=mid){
            temp[k]=a[i];
            k++;
            i++;
            addAssign();
        }
        while (j<=right){
            temp[k]=a[j];
            k++;
            j++;
            addAssign();
        }
        for (i=left;i<=right;i++){
            a[i]=temp[i];
            addAssign();
        }
    }
}
*/