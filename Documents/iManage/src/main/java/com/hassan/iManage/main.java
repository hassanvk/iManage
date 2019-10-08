package com.hassan.iManage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String[] args){


        Map<Integer,Data> dataMap = Database.getInstance();

        //Hello World
        get("/hello",(req,res) -> "Hello World");

        //Hello + your name
        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        //Get message of id from datamap
        get("/get/messages/:id", (request, response) -> {
            Data data = dataMap.get(Integer.valueOf(request.params(":id")));
            if(data == null) {
                response.status(404);
                return response.body();
            }
            System.out.println(new Gson().toJson(data));
            return new Gson().toJson(data);
        });

        //Add new data to datamap
        post("/post/messages", (request, response) -> {
            response.type("application/json");
            Data data = new Gson().fromJson(request.body(), Data.class);
            dataMap.put(data.getId(),data);
            response.status(200);
            return  new Gson().toJson(dataMap.get(data.getId()));
        });
    }
}
