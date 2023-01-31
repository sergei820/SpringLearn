package org.springcourse;

public class ClassicMusic implements Music {

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @Override
    public String getSong() {
        return "Some classic music";
    }
}
