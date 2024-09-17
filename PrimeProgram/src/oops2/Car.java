package oops2;

public class Car extends Vehicle{

    void start(){
        Scooter scooterObj = new Scooter();
        scooterObj.breaking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model+"Car is starting..and constructer");

    }
    //creating car Constructor

    /*Car(){
        super(4);
        System.out.println("car is staring begining");
    }*/
    Car braking(){
        return  this;
    }
    Car(){
        super(4);
        System.out.println("car is staring begining");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
         /* obj.wheelCount=2;
        obj.model="120";
        obj.wheelCount=4;
        obj.start();
       System.out.println(obj.wheelCount);*/

    }
}
class Scooter{
    void breaking(Car car){
        System.out.println(car.model + "is breaking");
    }
}

