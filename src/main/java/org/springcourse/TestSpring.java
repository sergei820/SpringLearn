package org.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_NOT_USING.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*Music jazzMusicBean = context.getBean("jazzMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(jazzMusicBean);

        Music classicMusicBean = context.getBean("classicMusic", Music.class);
        MusicPlayer classicMusicPlayer = new MusicPlayer(classicMusicBean);

        musicPlayer.playMusic();
        classicMusicPlayer.playMusic();*/

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
