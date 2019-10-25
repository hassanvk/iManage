package com.hassan.iManage;

import javax.persistence.*;

@Entity
@Table(name = "Data")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private int id;
    @Column(name = "Text")
    private String text;
    @Column(name = "From")
    private String from;
    @Column(name = "To")
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
