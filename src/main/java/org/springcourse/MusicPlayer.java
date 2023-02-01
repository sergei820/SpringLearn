package org.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1,
                       @Qualifier("classicMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String playMusic() {
        //System.out.println("Playing: " + classicMusic.getSong());
        //System.out.println("Playing: " + jazzMusic.getSong());
        return "Playing: " + music1.getSong() + " " + music2.getSong();
    }
}
