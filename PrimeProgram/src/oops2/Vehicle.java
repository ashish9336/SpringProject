package oops2;

public  class Vehicle {

    int wheelCount;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
        System.out.println("Creating a vehicle with Model");
    }
    /*Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
        this.model="120";
        System.out.println("Creating a vehicle and model"+wheelCount+""+model);
    }*/

    void start(){
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {

    }
    //final Method
    final void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
}
