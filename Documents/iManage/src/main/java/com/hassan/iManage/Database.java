package com.hassan.iManage;

import java.util.HashMap;
import java.util.Map;
import static com.hassan.iManage.Time.*;

public class Database {

    private static final Map<Integer, Data> dataMap = new HashMap<>();

    static{
        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
        System.out.println(getZonedTime() + ": Database initialized");
    }

    public static Map<Integer, Data> getInstance(){
        return dataMap;
    }

    public Map<Integer, Data> getInstanceNonStatic(){
        return dataMap;
    }
}
