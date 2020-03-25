package com.shortestpath;

import com.shortestpath.Drawmap.MapFrame;

import javax.swing.*;
import java.awt.*;

public class RunMapping {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            MapFrame mapFrame = null;
            try {
                mapFrame = new MapFrame();
                mapFrame.setSize(1400,800);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            mapFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mapFrame.setVisible(true);
            mapFrame.setTitle("Floyd-Algorithm");
        });
    }
}
