package com.shortestpath.Drawmap;

import javax.swing.*;

public class MapFrame extends JFrame {
    public MapFrame() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        MapPanel mapPanel = new MapPanel();

        setContentPane(mapPanel);
        setLocation(0,0);

        pack();
    }

}
