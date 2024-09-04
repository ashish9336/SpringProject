package oops2;

public class Car extends Vehicle{

    void start(){
        super.start();
        System.out.println(this);
        System.out.println(this.model+"Car is starting");
    }
    //creating car Constructor

    Car(){
        super(4);
        System.out.println("car is staring begining");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelCount=4;
        obj.model="110";
        obj.start();
    }
}
