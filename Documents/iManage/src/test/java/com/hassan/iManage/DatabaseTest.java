package com.hassan.iManage;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class DatabaseTest {


//    @org.junit.Before
//    public void setUp() throws Exception {
//        Map<Integer, Data> dataMap = new HashMap<>();
//        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
//        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
//        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
//        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
//        System.out.println("Database initialized");
//    }

    @org.junit.Test
    public void initializeDatabase() {
        Map<Integer, Data> dataMap = new HashMap<>();
        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
        assertEquals(101,dataMap.get(101).getId());
        assertEquals("text for 102",dataMap.get(102).getText());
        assertEquals("Dave",dataMap.get(103).getFrom());
        assertEquals("Hassan",dataMap.get(104).getTo());
    }

    @org.junit.Test
    public void getInstance() {
        Map<Integer, Data> dataMap = new HashMap<>();
        assertEquals(dataMap,Database.getInstance());
    }
}