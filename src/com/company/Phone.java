package com.company;

public class Phone {
    private int ram ;
    private int version;
    private String name ;


    public Phone (int ram , int version , String name){
        this.ram = ram;
        this.version =  version;
        this.name = name;

        // you can a multiple constructors if you want
        // using or selecting diff parameters

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void text (String name){
        System.out.println("texting " + name);
    }

    public void call (int number){
        System.out.println("calling " + number);
    }


}
