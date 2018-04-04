package com.example.demo;



    public class Vehicle {

        private String type;
        private String color;

        public Vehicle() {
           // System.out.println("A new Vehicle has been created!");
        }

        public Vehicle(String message){

            System.out.println(message);
        }
        public String starting( ) {

            return "" ;

                    //"A Vehicle starts...";
        }
        public String accelerating( ) {
            return "";
                   // "A Vehicle accelerates...";

        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Vehicle{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

