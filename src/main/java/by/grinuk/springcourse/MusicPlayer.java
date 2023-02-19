package by.grinuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


public class MusicPlayer {


    private List<Music> musicList;
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


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int i = (int) (Math.random() * musicList.size());
        return "Playing: " + musicList.get(i).getSong();
    }
}
