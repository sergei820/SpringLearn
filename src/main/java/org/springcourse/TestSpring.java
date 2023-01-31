package org.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music jazzMusicBean = context.getBean("jazzMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(jazzMusicBean);

        Music classicMusicBean = context.getBean("classicMusic", Music.class);
        MusicPlayer classicMusicPlayer = new MusicPlayer(classicMusicBean);

        musicPlayer.playMusic();
        classicMusicPlayer.playMusic();
        context.close();
    }
}
