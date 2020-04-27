package com.sort.Mapping;

public class MappingExecute extends Thread{

    @Override
    public void run() {
        super.run();
        doMappingExecute();
    }

    public void doMappingExecute(){
        TestMapping testMapping= new TestMapping();
        testMapping.Run();
    }

//    public MappingExecute(){
//        TestMapping testMapping= new TestMapping();
//        testMapping.Run();
//    }

}
