package org.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class JazzMusic implements Music {

    @PostConstruct
    public void doMyInit() {System.out.println("Doing my initialization");}
    @PreDestroy
    public void doMyDestroy() {System.out.println("Doing my destruction");}

    /*private JazzMusic() {}

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }

    */

    @Override
    public String getSong() {
        return "Louis Armstrong - What A Wonderful World";
    }
}
