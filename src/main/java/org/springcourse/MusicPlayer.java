package org.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1,
                       @Qualifier("classicMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        //System.out.println("Playing: " + classicMusic.getSong());
        //System.out.println("Playing: " + jazzMusic.getSong());
        return "Playing: " + music1.getSong() + " " + music2.getSong();
    }
}
