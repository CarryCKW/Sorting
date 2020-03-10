package com.sort;

import javax.swing.*;
import java.awt.*;

public class TextComponent {
    public static JTextArea showText;

    private static final int row=20;
    private static final int col=100;
    private static final Font font= new Font("宋体",Font.PLAIN,16);

    public TextComponent(){

    }

    public static void setShowText(String str){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                showText.append(str);
                showText.append("\r\n");
            }
        });
    }

    public static JScrollPane getShowTextPanel(){
        showText=setText(showText);
        setShowText("请选择排序方法。");
        return new JScrollPane(showText);
    }

    public static JTextArea setText(JTextArea text){
        text=new JTextArea(row,col);
        text.setFont(font);
        text.setLineWrap(true);
        return text;
    }
}
