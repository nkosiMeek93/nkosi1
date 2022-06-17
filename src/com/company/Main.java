package com.company;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone (8,11, "iphone 7 plus");


        // to print out the parameters
        // use the system out functionality

        System.out.println(phone.getName());
        System.out.println("has version " + phone.getVersion());
        System.out.println("with " + phone.getRam() + " of ram");


        // to call a method
        // use the object passed i.e. phone

        phone.call(9);
        phone.text("meek");

    }


}
