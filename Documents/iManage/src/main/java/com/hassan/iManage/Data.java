package com.hassan.iManage;

public class Data {

    private int id;
    private String text;
    private String from;
    private String to;

    public Data(int id, String text, String from, String to){
        this.id = id;
        this.text = text;
        this.from = from;
        this.to = to;
    }

    public Data(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
