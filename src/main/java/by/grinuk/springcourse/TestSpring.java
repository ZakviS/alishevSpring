package by.grinuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.channels.ClosedSelectorException;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        //тут про область видимости бинов и методе prototype
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);


        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getName());


        //тут про Жизненный цикл бина
        ClassicalMusic classicalMusic = context.getBean("musicBean2",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
