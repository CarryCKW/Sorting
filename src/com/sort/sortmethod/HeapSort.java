package com.sort.sortmethod;

public class HeapSort extends Base{
    public static void Sort(int[] a){
        heapsort(a);
    }

    private static void heapsort(int[] a){
        for (int i=a.length/2;i>=0;i--){
            heapFix(a,i,a.length);
        }

        for (int i=a.length - 1;i>0;i--){
            swap(a,0,i);
            heapFix(a,0,i);
        }
    }

    private static void heapFix(int[] a, int i, int n) {
        int child;
        int father;
        for (father=a[i];leftChild(i)<n;i=child){
            child=leftChild(i);
            if (child != n - 1 && a[child] < a[child + 1]) {
                child++;
                addCompare();
            }

            if (father < a[child]) {
                a[i] = a[child];
                addCompare();
            } else {
                break;
            }
        }
        a[i]=father;
        addAssign();
    }

    private static int leftChild(int i){
        return i*2+1;
    }
}
