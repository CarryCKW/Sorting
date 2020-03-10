package com.sort;

public class SortExecute {
    private String Type;
    private doSort newSortThread;

    private TextComponent textComponent;

    public SortExecute(){
        Type=SelectComponent.getComboBoxSelection();
        textComponent=new TextComponent();

        System.out.println("排序方式为" + Type);
        newSortThread = new doSort(Type);

    }
}
