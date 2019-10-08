package com.hassan.iManage;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<Integer, Data> dataMap = new HashMap<>();
    static{
        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
        System.out.println("Database initialized");
    }
//    public static void initializeDatabase(){
//        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
//        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
//        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
//        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
//
//    }
    public static Map<Integer, Data> getInstance(){
        return dataMap;
    }
}
