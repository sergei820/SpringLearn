package org.alishev.springcourse;

public class ClassicMusic implements Music {

    private ClassicMusic() {}

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    public void doMyInit() {System.out.println("Doing my initialization");}

    public void doMyDestroy() {System.out.println("Doing my destruction");}

    @Override
    public String getSong() {
        return "Some classic music";
    }
}
