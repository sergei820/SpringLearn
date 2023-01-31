package org.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music musicBean = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        JazzMusic jazzMusicBean = context.getBean("musicBean", JazzMusic.class);
        System.out.println(jazzMusicBean.getSong());

        context.close();
    }
}
