package com.hassan.iManage;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String[] args){

        Database.initializeDatabase();
        Map<Integer,Data> dataMap = Database.getInstance();

        get("/hello",(req,res) -> "Hello World");

        get("/get/messages/:id", (request, response) -> {
            Data data = dataMap.get(Integer.valueOf(request.params(":id")));
            if(data == null) {
                response.status(404);
                return response.body();
            }
            return "ID: " + data.getId() + "\nText: " + data.getText()
                    + "\nFrom: " + data.getFrom() + "\nTo: " + data.getTo();
        });



        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        post("/post", (request, response) -> {
            return "post call";
            // Create something
        });
    }
}
