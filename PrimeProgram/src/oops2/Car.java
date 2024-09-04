package oops2;

public class Car extends Vehicle{

    void start(){
        super.start();
        System.out.println(this);
        System.out.println(this.model+"Car is starting............and constructer");
    }
    //creating car Constructor

    /*Car(){
        super(4);
        System.out.println("car is staring begining");
    }*/
    Car(){
        super(2,"120");
        System.out.println("car is staring begining");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelCount=2;
        obj.model="120";
        obj.start();
    }
}
