package by.grinuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {



    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("musicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        int i = (int) (Math.random() * 2);
        Type[] musicType = Type.values();
        if (musicType[i].toString().equals("CLASSICAL")){
            return "Playing: " + music1.getSong();
        }
        else{
            return "Playing: " + music2.getSong();
        }
    }
}
