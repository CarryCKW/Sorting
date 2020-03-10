package com.sort;

import javax.swing.*;
import java.awt.*;

public class SortPanel extends JPanel {
    private static JButton sortButton;
    private static JButton mappingButton;

    private static JComboBox selectionComboBox;

    private static JScrollPane sortScrollPane;
    private static JPanel jPanelSort;
    private static JPanel jPanelMenu;

    private static JLabel jLabel;

    public SortPanel(){
        sortButton=ButtonComponent.getSortButton();
        mappingButton=ButtonComponent.getMappingButton();

        selectionComboBox=SelectComponent.getComboBox();

        jLabel=new JLabel("排序过程");

        sortScrollPane=TextComponent.getShowTextPanel();

        init_panel();
        init_frame();
    }

    private void init_frame() {
        setLayout(new GridBagLayout());
        add(jPanelMenu,setConstraints(0, 0, 1, 3, 1, 1));
        add(jPanelSort,setConstraints(0, 1, 2, 3, 1, 1));

        jPanelMenu.setLayout(new GridBagLayout());
        jPanelMenu.add(sortButton,setConstraints(1, 0, 1, 1, 1, 1));
        jPanelMenu.add(mappingButton,setConstraints(2, 0, 1, 1, 1, 1));
        jPanelMenu.add(selectionComboBox,setConstraints(0, 0, 1, 1, 1, 1));

        jPanelSort.setLayout(new GridBagLayout());
        jPanelSort.add(jLabel,setConstraints(0, 0, 1, 2, 1, 1));
        jPanelSort.add(sortScrollPane,setConstraints(0, 2, 2, 4, 0, 2));
    }

    private void init_panel() {
        jPanelMenu=new JPanel();//流式布局
        jPanelSort=new JPanel();

        jPanelMenu.setBorder(BorderFactory.createEtchedBorder());
        jPanelSort.setBorder(BorderFactory.createEtchedBorder());

    }

    private static GridBagConstraints setConstraints(int gx, int gy, int gh, int gw, int wx, int wy) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gx;
        constraints.gridy = gy;
        constraints.gridheight = gh;
        constraints.gridwidth = gw;
        constraints.weightx = wx;
        constraints.weighty = wy;
        constraints.fill = GridBagConstraints.BOTH;
        return constraints;
    }

    /*
    setLayout(new FlowLayout());
        add(jPanelMenu,set);
        add(jPanelSort);

        jPanelMenu.setLayout(new FlowLayout());
        jPanelMenu.add(selectionComboBox);
        jPanelMenu.add(sortButton);
        jPanelMenu.add(mappingButton);

        jPanelSort.setLayout(new FlowLayout());
        jPanelSort.add(sortScrollPane);
        jPanelSort.add(jLabel);
     */
}
