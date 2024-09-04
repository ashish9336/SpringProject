package oops2;

public class Vehicle {
    int wheelCount;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
        System.out.println("Creating a vehicle with wheelCount");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {

    }
}
