package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Dog  implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is Playing");
    }
}
