package com.hassan.iManage;

import com.google.gson.Gson;
import static com.hassan.iManage.Time.*;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String[] args){


        Map<Integer,Data> dataMap = Database.getInstance();
        Gson gson = new Gson();

        get("/hello",(req,res) -> "Hello World");

        get("/hello/:name", (request, response) -> "Hello: " + request.params(":name"));

        get("/get/messages/:id", (request, response) -> {
            Data data = dataMap.get(Integer.valueOf(request.params(":id")));
            if(data == null) {
                response.status(404);
                System.out.println(getZonedTime() + ": Message for ID: "
                        + request.params(":id") + " doesn't exist");
                return response.body();
            }
            System.out.println(getZonedTime() + ": Message found. Retrieving: " + gson.toJson(data));
            return gson.toJson(data);
        });

        post("/post/messages", (request, response) -> {
            response.type("application/json");
            Data data = gson.fromJson(request.body(), Data.class);
            dataMap.put(data.getId(),data);
            response.status(200);
            System.out.println(getZonedTime() + ": Message added to database: " + gson.toJson(data));
            return gson.toJson(dataMap.get(data.getId()));
        });
    }
}
