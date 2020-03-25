package com.shortestpath.readexcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    private static String filepath="D:\\C-match\\citylist.xlsx";
    private static int maxRow=0;
    private static int maxCol=0;
    private static XSSFWorkbook xssfWorkbook = null;
    private static XSSFSheet sheet=null;

    public void doReady() throws IOException {
        xssfWorkbook = new XSSFWorkbook(new FileInputStream(filepath));
        sheet = xssfWorkbook.getSheetAt(0);
        maxRow = sheet.getLastRowNum();
        maxCol = sheet.getRow(0).getLastCellNum();
        //System.out.println("ready done...");
    }


    public double getX_coordinate(int i,int j){
        return Double.valueOf(dataChange(sheet.getRow(i).getCell(j)));
    }

    public Double getY_coordinate(int i, int j){
        return Double.valueOf(dataChange(sheet.getRow(i).getCell(j)));
    }

    public String getCity_Name(int i,int j){
        return dataChange(sheet.getRow(i).getCell(j));
    }

    public int getCity_id(int i,int j){
        return Double.valueOf(dataChange(sheet.getRow(i).getCell(j))).intValue();
    }

    public int getMaxRow(){
        return maxRow;
    } // 返回城市个数

    public int getMaxCol(){
        return maxCol;
    }

    public XSSFCell get(int i, int j){
        return sheet.getRow(i).getCell(j);
    }

    public String dataChange(XSSFCell xssfCell){
        String cellValue = new String();
        if(xssfCell==null)
            return null;
        //DecimalFormat decimalFormat = new DecimalFormat("#");
        switch (xssfCell.getCellType()){
            case XSSFCell.CELL_TYPE_NUMERIC:
                //cellValue = decimalFormat.format(xssfCell.getNumericCellValue());
                cellValue=String.valueOf(xssfCell.getNumericCellValue());
                break;
            case XSSFCell.CELL_TYPE_STRING:
                //cellValue = decimalFormat.format(xssfCell.getStringCellValue());
                cellValue=String.valueOf(xssfCell.getStringCellValue());
                break;
            default: break;
        }
        return cellValue;
    }

    /*
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(filepath));
        XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
        int maxRow = sheet.getLastRowNum();
        for (int i=0;i<=maxRow;i++) {
            int maxCol = sheet.getRow(i).getLastCellNum();
            for (int j = 0; j < maxCol; j++) {
                System.out.print(sheet.getRow(i).getCell(j) + " ");
            }
            System.out.println();
        }
     */
}
