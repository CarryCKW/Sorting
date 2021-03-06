package com.sort;

import com.sort.Mapping.MappingExecute;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ButtonComponent {
    private static JButton sortButton;
    private static JButton mappingButton;
    private static JComboBox comboBox;
    private static TextComponent textArea = new TextComponent();

    //固定使用一个线程的线程池
    private static ExecutorService pool = Executors.newFixedThreadPool(1);

    //换成更符合要求的线程池

    public ButtonComponent(){}

    public static JButton getSortButton(){
        sortButton = new JButton("开始排序");
        sortButton.addActionListener(a->{

            Thread thread1 = new SortExecute();
            pool.execute(thread1);
        });
        return sortButton;
    }

    public static JButton getMappingButton(){
        mappingButton = new JButton("时间复杂度图像");
        mappingButton.addActionListener(a->{
            Thread thread2 = new MappingExecute();
            pool.execute(thread2);
        });
        return mappingButton;
    }


//    public static JButton getSortButton(){
//        sortButton=new JButton("开始排序");
//        sortButton.addActionListener(a->{
//            Runnable r = ()->{
//                new SortExecute();
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            };
//            Thread thread=new Thread(r);
//            thread.start();
//        });
//        return sortButton;
//    }
//
//    public static JButton getMappingButton(){
//        mappingButton=new JButton("时间复杂度图像");
//        mappingButton.addActionListener(a->{
//            Runnable r=()->{
//                new MappingExecute();
//            };
//            Thread thread=new Thread(r);
//            thread.start();
//        });
//        return mappingButton;
//    }
}
