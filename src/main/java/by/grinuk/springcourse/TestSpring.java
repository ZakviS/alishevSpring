package by.grinuk.springcourse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

/*
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
