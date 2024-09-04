package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is Playing");
    }
}
