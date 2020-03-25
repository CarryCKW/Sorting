package com.shortestpath.algorithm;

import com.shortestpath.City.CityUnit;
import com.shortestpath.City.EdgeUnit;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TestFloyd {
    public static void main(String[] args) throws IOException {
        Floyd floyd = new Floyd();
        List<CityUnit> cityUnitList = new ArrayList<CityUnit>();
        cityUnitList=floyd.getCityUnitList();
        /*for (int i=0;i<cityUnitList.size();i++){
            System.out.println(cityUnitList.get(i).cityName);
        }*/
        int size=floyd.getSize();
        /*int[][] path = floyd.getPath();
        for (int i=0;i<size;++i){
            for (int j=0;j<size;++j){
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }*/
        List<EdgeUnit> edgeUnitList;
        edgeUnitList = floyd.getPath(1,10);

    }
}
