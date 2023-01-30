package org.alishev.springcourse;

public class JazzMusic implements Music {

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Louis Armstrong - What A Wonderful World";
    }
}
