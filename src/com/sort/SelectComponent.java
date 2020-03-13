package com.sort;

import javax.swing.*;

public class SelectComponent {
    private static String[] selectType={"选择排序", "冒泡排序", "快速排序", "希尔排序","插入排序", "堆排序", "基数排序", "归并排序"};
    //下拉框
    private static JComboBox comboBox;
    //获取下拉框
    public static JComboBox getComboBox(){
        comboBox=new JComboBox();
        comboBox.setEditable(true);
        for(int i=0;i<selectType.length;i++){
            comboBox.addItem(selectType[i]);
        }
        return comboBox;
    }

    public static String getComboBoxSelection(){
        String selection = "";
        return selection=(String)comboBox.getSelectedItem();
    }
    public static String[] getSelectType(){
        return selectType;
    }
}
