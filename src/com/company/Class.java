package com.company;

public class Class {
    private int san;
    private String soz;
    private int [] mass;


    public Class (){

    }
    public Class(String soz){

    }
    public Class(String soz, int san){

    }

    public Class (String soz, int san , int[] mass){
        this.soz =  soz;
        this.san = san;
        this.mass = mass;

    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int [] getMass() {
        return mass;
    }

    public void setMass(int [] mass) {
        this.mass = mass;
    }
}

