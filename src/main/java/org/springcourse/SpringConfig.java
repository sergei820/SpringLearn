package org.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(jazzMusic(), classicMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
