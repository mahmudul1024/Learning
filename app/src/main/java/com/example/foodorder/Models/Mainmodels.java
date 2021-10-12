package com.example.foodorder.Models;

public class Mainmodels {
  int imaage;
  String name,price,description;

    public Mainmodels(int imaage, String name, String price, String description){
        this.imaage=imaage;
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public int getImaage(){
        return imaage;
    }

    public void setImaage(int imaage){
        this.imaage=imaage;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }
}
