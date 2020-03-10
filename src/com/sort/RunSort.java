package com.sort;

import javax.swing.*;
import java.awt.*;

public class RunSort {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame jFrame= null;
            try {
                jFrame = new SortFrame();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
            //jFrame.setSize(800,600);
            jFrame.setTitle("算法时间分析");
        });
    }
}
