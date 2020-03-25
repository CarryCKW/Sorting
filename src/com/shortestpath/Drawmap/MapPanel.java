package com.shortestpath.Drawmap;

import com.shortestpath.City.CityUnit;
import com.shortestpath.City.EdgeUnit;
import com.shortestpath.algorithm.Floyd;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class MapPanel extends JPanel {
    private JTextField textFieldfrom = null;
    private JTextField textFieldto = null;
    private JButton button = null;
    private JPanel jPanelforDraw = null;
    private int fromid = 0;
    private int toid = 0;
    private int size = 0;
    private List<CityUnit> cityUnitList =null;
    private List<EdgeUnit> edgeUnitList = null;
    private Object Graphics2D;

    public MapPanel(){
        init();
    }

    private void init(){
        textFieldfrom = new JTextField(4);
        textFieldto = new JTextField(4);
        button = new JButton("开始");
        jPanelforDraw = new JPanel();
        jPanelforDraw.setSize(1000,1000);
        add(textFieldfrom);
        add(textFieldto);
        add(button);
        add(jPanelforDraw);
        addListen();
    }

    private void addListen(){
        button.addActionListener(a->{
            Runnable r = ()->{
                fromid = Integer.parseInt(textFieldfrom.getText());
                toid = Integer.parseInt(textFieldto.getText());
                try {
                    doDraw();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
            Thread thread = new Thread(r);
            thread.start();
        });
    }
    private void doDraw() throws IOException {
        Floyd floyd = new Floyd();
        size = floyd.getSize();
        cityUnitList = floyd.getCityUnitList();
        edgeUnitList = floyd.getPath(fromid,toid);
    }

    public void paint(Graphics g){
        super.paint(g);
        BasicStroke bs = new BasicStroke(5.1f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
        Graphics2D graphics2D =(Graphics2D)g;
        for (int i=0;i<edgeUnitList.size();++i){
            int from = edgeUnitList.get(i).from_id;
            int to = edgeUnitList.get(i).to_id;
            double cost = edgeUnitList.get(i).weight;
            int fromx = Double.valueOf(cityUnitList.get(from).xcoordinate).intValue()*50;
            int fromy = Double.valueOf(cityUnitList.get(from).ycoordinate).intValue()*50;
            int tox = Double.valueOf(cityUnitList.get(to).xcoordinate).intValue()*50;
            int toy = Double.valueOf(cityUnitList.get(to).ycoordinate).intValue()*50;
            g.drawLine(fromx,fromy,tox,toy);
        }
    }

}
