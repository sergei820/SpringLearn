package org.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MusicPlayer {

    private ClassicMusic classicMusic;
    private JazzMusic jazzMusic;
    //private Music music;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, JazzMusic jazzMusic) {
        this.classicMusic = classicMusic;
        this.jazzMusic = jazzMusic;
    }


    //public MusicPlayer(Music music) {
    //    this.music = music;
    //}

    public String playMusic() {
        //System.out.println("Playing: " + classicMusic.getSong());
        //System.out.println("Playing: " + jazzMusic.getSong());
        return "Playing: " + jazzMusic.getSong();
    }
}
