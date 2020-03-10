package com.sort.Mapping;

import org.jfree.chart.ChartPanel;

import javax.swing.*;
import java.awt.*;

public class TestMapping {
    public static void main(String[] args) {
        TestMapping testMapping = new TestMapping();
        testMapping.Run();
    }
    public void Run(){
        Chat ct=new Chat();
        ChartPanel chartPanel= new ChartPanel(ct.jFreeChart,true);
        JFrame jf= new JFrame();
        jf.add(chartPanel, BorderLayout.WEST);
        jf.setVisible(true);
        jf.setSize(1000,700);
        jf.setLocationRelativeTo(null);
    }
}
