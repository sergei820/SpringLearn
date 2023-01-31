package org.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @Override
    public String getSong() {
        return "Some classic music";
    }
}
