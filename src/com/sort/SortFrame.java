package com.sort;

import javax.swing.*;
import java.awt.*;

public class SortFrame extends JFrame {
    public SortFrame() throws HeadlessException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        //UI界面
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //具体界面
        SortPanel sp = new SortPanel();
        setContentPane(sp);
        setLocation(100,100);
        pack();
    }
}
