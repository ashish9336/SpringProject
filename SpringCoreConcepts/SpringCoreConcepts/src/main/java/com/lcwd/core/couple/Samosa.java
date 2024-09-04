package com.lcwd.core.couple;

public class Samosa {
    String name;
    public void eat(){
        System.out.println("wow samosa is very spicy");
        System.out.println(name);
    }
    public Samosa(String name){
        System.out.println("this is:" +name);
        this.name=name;
    }

}
