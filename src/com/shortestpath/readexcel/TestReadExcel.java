package com.shortestpath.readexcel;

import java.io.IOException;

public class TestReadExcel {
    public static void main(String[] args) throws IOException {
        ReadExcel readExcel = new ReadExcel();
        readExcel.doReady();
        int row = readExcel.getMaxRow();
        int col = readExcel.getMaxCol();
        System.out.println("row=" + row + "col=" + col);
        for (int i=1;i<=row;i++) {
            for (int j = 0; j < col; j++) {
                switch (j){
                    case 0:
                        System.out.print(readExcel.getCity_id(i,j)+ " ");//!!!
                        break;
                    case 1:
                        System.out.print(readExcel.getCity_Name(i,j)+" ");
                        break;
                    case 2:
                        System.out.print(readExcel.getX_coordinate(i,j)+ " ");
                        break;
                    case 3:
                        System.out.print(readExcel.getY_coordinate(i,j) + " ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
