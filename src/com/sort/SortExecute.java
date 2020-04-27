package com.sort;

public class SortExecute extends Thread{
    private String Type;
    private doSort newSortThread;

    private TextComponent textComponent;

    @Override
    public void run() {
        super.run();
        doSortExecute();
    }

    public void doSortExecute(){
        Type=SelectComponent.getComboBoxSelection();
        textComponent=new TextComponent();

        System.out.println("排序方式为" + Type);
        newSortThread = new doSort(Type);

    }

//    public SortExecute(){
//        Type=SelectComponent.getComboBoxSelection();
//        textComponent=new TextComponent();
//
//        System.out.println("排序方式为" + Type);
//        newSortThread = new doSort(Type);
//
//    }
}
