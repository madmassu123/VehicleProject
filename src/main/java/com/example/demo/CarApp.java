package com.example.demo;


import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



       //Vehicle a = new Vehicle();
        Car a = new Car();
        print(a.starting());
        print(a.accelerating());

        //a.setType("porsche");
        //a.setColor("red");
        System.out.println(" What type of car you have:");
        a.setType(scan.nextLine());
        System.out.println(" What color is your car :");
        a.setColor(scan.nextLine());
       // print(a.getType());
       // print(a.getColor());
        System.out.println("The "+ a.getColor()+ " "+ a.getType()+ " is starting");
        System.out.println("The "+ a.getColor()+ " "+ a.getType()+ " is accelerating");
        System.out.println("The "+ a.getColor()+ " "+ a.getType()+ " is going 50mph");
        System.out.println("The "+ a.getColor()+ " "+ a.getType()+ " is stopped");


         Car b = new Car();
        print(b.starting());
        print(b.accelerating());
        print(b.toStop());
       // b.setType("jetta
        // ");
       // b.setColor("blue");

        System.out.println(" What type of car you have:");
        b.setType(scan.nextLine());
        System.out.println(" What color is your car :");
        b.setColor(scan.nextLine());
        //print(b.getType());
        //print(b.getColor());
        System.out.println("The "+ b.getColor()+ " "+ b.getType()+ " is starting");
        System.out.println("The "+ b.getColor()+ " "+ b.getType()+ " is accelerating");
        System.out.println("The "+ b.getColor()+ " "+ b.getType()+ " is going 50mph");
        System.out.println("The "+ b.getColor()+ " "+ b.getType()+ " is stopped");


        System.out.println("The blue jetta just passed the red porsche");

    }
     private  static void  print(String s){
        System.out.println(s);
     }
}
