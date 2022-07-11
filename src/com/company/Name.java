package com.company;

public class Name {

    private String[] name;

    public Name(){

    }
    public Name(String[]name){
        this.name = name;
    }
    public String[]getName(){
        return name;
    }
    public void setName(String[] name){
        this.name = name;
    }
    public void getNameByIndex(int index){
        System.out.println(name[index]);
    }

}
