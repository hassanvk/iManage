package com.hassan.iManage;

import static spark.Spark.*;

public class main {
    public static void main(String[] args){
        System.out.println("before running");
        get("/hello",(req,res) -> "Hello World");
        System.out.println("after running");

    }
}
