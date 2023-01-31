package org.alishev.springcourse;

public class JazzMusic implements Music {

    private JazzMusic() {}

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }

    public void doMyInit() {System.out.println("Doing my initialization");}

    public void doMyDestroy() {System.out.println("Doing my destruction");}

    @Override
    public String getSong() {
        return "Louis Armstrong - What A Wonderful World";
    }
}
