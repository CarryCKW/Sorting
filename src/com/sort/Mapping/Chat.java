package com.sort.Mapping;


import com.sort.TempData.TimeData;
import com.sort.doSort;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.date.DateUtilities;

public class Chat {
    private doSort ds;
    public  static double[] times = new double[20];
    CategoryDataset dataset=createDataset();
    JFreeChart jFreeChart=createChart(dataset);

    public static JFreeChart createChart(CategoryDataset categoryDataset){
        JFreeChart jFreeChart= ChartFactory.createLineChart("AlgorithmTime","+5000/Time","Time",
                categoryDataset, PlotOrientation.VERTICAL,false,false,false);
        CategoryPlot plot=(CategoryPlot)jFreeChart.getPlot();
        plot.setBackgroundAlpha(0.5f);
        plot.setForegroundAlpha(1.0f);
        LineAndShapeRenderer renderer = (LineAndShapeRenderer)plot.getRenderer();
        renderer.setBaseShapesVisible(true); // series 点（即数据点）可见
        renderer.setBaseLinesVisible(true); // series 点（即数据点）间有连线可见
        renderer.setUseSeriesOffset(true); // 设置偏移量
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        return jFreeChart;
    }

    public  CategoryDataset createDataset(){
        String[] rowKeys={"NumOfArray"};
        String[] colKeys= new String[20];
        for(int i=0;i<20;i++){
            colKeys[i]= String.valueOf((i+1));
            //times[i]=(double)(Math.random()*5);
        }
        //读取排序时间
        times= TimeData.getTimesD();
        
        double[][] data={{times[0],times[1],times[2],times[3],times[4],times[5],times[6],times[7],times[8],times[9],
        times[10],times[11],times[12],times[13],times[14],times[15],times[16],times[17],times[18],times[19]},}; //original
        /*double[][] data = new double[doSort.getStep()][20];
        for (int i=0;i<doSort.getStep();i++){
            for (int j=0;j<20;j++){
                data[i][j]=times[j];
            }
        }*/ //wrong

        return DatasetUtilities.createCategoryDataset(rowKeys,colKeys,data);
    }


}
