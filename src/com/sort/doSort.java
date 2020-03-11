package com.sort;

import com.sort.RandomData.RandomArray;
import com.sort.TempData.TimeData;
import com.sort.sortmethod.*;

import javax.swing.*;

public class doSort {
    private long startTime;
    private long endTime;

    private long CompareTimes;
    private long AssignTimes;

    private int len=5000;
    private int[] array;
    private static int[] times;
    private static double[] timesD;

    private String Type;
    private TextComponent textComponent;

    private TimeData timeData;

    public doSort(){}
    public doSort(String Type){
        this.Type=Type;
        times=new int[21];
        timeData=new TimeData();

        textComponent=new TextComponent();
        textComponent.setShowText(Type + "\r\n 排序开始:");
        this.sort();
        textComponent.setShowText("排序结束！");
    }

    private void sort(){
        for(int i=0;i<20;i++){
            array=new int[len];
            new RandomArray(array,len);
            len+=5000;
            startTime=System.currentTimeMillis();
            switch (Type){
                case "冒泡排序":
                    BubbleSort.Sort(array);
                    CompareTimes=Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "插入排序":
                    InsertSort.Sort(array);
                    CompareTimes= Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "堆排序":
                    HeapSort.Sort(array);
                    CompareTimes=Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "归并排序":
                    MergeSort.Sort(array);
                    CompareTimes=Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "选择排序":
                    SelectSort.Sort(array);
                    CompareTimes=Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "快速排序":
                    QuickSort.Sort(array);
                    CompareTimes=Base.getCompare();
                    AssignTimes=Base.getAssign();
                    break;
                case "希尔排序":

                case "基数排序":

                default:
                    break;
            }

            Base.recover();
            endTime=System.currentTimeMillis();
            times[i]=(int)(endTime-startTime);
            timeData.setTimes(i,(endTime-startTime));
            //timesD[i]=(double)(endTime-startTime); //->change to 秒
            textComponent.setShowText("————数组容量为" + (i+1)*5000 +"——用时" + times[i] +"ms  ——比较次数：" + CompareTimes +" ——赋值次数: "+AssignTimes);
            CompareTimes=0;
            AssignTimes=0;
            Base.recover();
        }
    }

    public static int[] getTimes(){
        return times;
    }

    public static double[] getTimesD(){
         return timesD;
    }
}
