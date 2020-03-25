package com.shortestpath.algorithm;

import com.shortestpath.City.CityUnit;
import com.shortestpath.City.EdgeUnit;
import com.shortestpath.readexcel.ReadExcel;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Floyd {
    private double[][] dis;
    private int[][] path;
    private static int MAX = Integer.MAX_VALUE;
    private ReadExcel readExcel =null;
    private List<EdgeUnit> pathList;
    private List<CityUnit> cityUnitList;
    private int size=0;

    public Floyd() throws IOException {
        floyd();
    }

    public int getSize() {
        return size;
    }

    public int[][] getPath() {
        return path;
    }

    public double[][] getDis() {
        return dis;
    }

    public List getPath(int i, int j){//i,j始终为City_id
        pathList = new ArrayList<EdgeUnit>();
        tofind(i,j,pathList);
        //System.out.println("路径查找完成......");
        return pathList;
    }

    public List<CityUnit> getCityUnitList() {
        return cityUnitList;
    }

    private void tofind(int i, int j, List<EdgeUnit> list){
        if(path[i][j]!=-1){
            if(path[i][j]==j||i==j) return; //防止循环递归
            EdgeUnit edgeUnit = new EdgeUnit(path[i][j],j,dis[path[i][j]][j]);
            list.add(edgeUnit);
            System.out.println(path[i][j] + " -> " + j + " costs " + dis[path[i][j]][j]);
            tofind(i,path[i][j],list);
        }
        else return;
    }

    private void setSize(){
        size =readExcel.getMaxRow();
        this.dis =new double[size][size];
        this.path = new int[size][size];
    }

    //the algorithm core
    private void floyd() throws IOException {
        readExcel = new ReadExcel();
        readExcel.doReady();
        setSize();
        size = readExcel.getMaxRow(); //size == 城市个数
        //城市id从 0, 1, 2.... size-1
        //init
        cityUnitList = new ArrayList<CityUnit>();
        for (int i=1;i<=size;i++){
            CityUnit cityUnit =new CityUnit(readExcel.getCity_id(i,0),
                    readExcel.getCity_Name(i,1),
                    readExcel.getX_coordinate(i,2),
                    readExcel.getY_coordinate(i,3));
            cityUnitList.add(cityUnit);
        }
        DecimalFormat decimalFormat =new DecimalFormat("########.00");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(i!=j){
                    path[i][j]= i;
                }
                else {
                    path[i][j] = -1;
                }
                double ix=readExcel.getX_coordinate(i+1,2);
                double iy=readExcel.getY_coordinate(i+1,3);
                double jx=readExcel.getX_coordinate(j+1,2);
                double jy=readExcel.getY_coordinate(j+1,3);

                dis[i][j]=dis[j][i]= Double.parseDouble(decimalFormat.format((double) Math.sqrt((ix-jx)*(ix-jx)+(iy-jy)*(iy-jy))))+Math.random()*250;
            }
        }
        //core
        //System.out.println("to sort.....");

        for (int k=0;k<size;k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if ((dis[i][k] + dis[k][j]) < dis[i][j]) {
                        path[i][j] = path[k][j];
                        dis[i][j] = dis[i][k] + dis[k][j];
                    }
                }
            }
        }


    }

}
