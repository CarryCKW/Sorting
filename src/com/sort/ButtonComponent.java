package com.sort;

import com.sort.Mapping.MappingExecute;

import javax.swing.*;

public class ButtonComponent {
    private static JButton sortButton;
    private static JButton mappingButton;
    private static JComboBox comboBox;
    private static TextComponent textArea = new TextComponent();

    public ButtonComponent(){}

    public static JButton getSortButton(){
        sortButton=new JButton("开始排序");
        sortButton.addActionListener(a->{
            Runnable r = ()->{
                new SortExecute();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread thread=new Thread(r);
            thread.start();
        });
        return sortButton;
    }

    public static JButton getMappingButton(){
        mappingButton=new JButton("时间复杂度图像");
        mappingButton.addActionListener(a->{
            Runnable r=()->{
                new MappingExecute();
            };
            Thread thread=new Thread(r);
            thread.start();
        });
        return mappingButton;
    }
}
