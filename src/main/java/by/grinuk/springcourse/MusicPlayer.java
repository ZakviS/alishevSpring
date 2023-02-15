package by.grinuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {


    private Music music1;
    private Music music2;
    //Type musicType;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("musicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {
        int i = (int) (Math.random() * 2);
        Type[] musicType = Type.values();
        if (musicType[i].toString().equals("CLASSICAL")){
            System.out.println("Playing: " + music1.getSong());
        }
        else{
            System.out.println("Playing: " + music2.getSong());

        }
    }
}
