package by.grinuk.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
    String[] song = new String[]{"firstR","secondR","thirdR"};
    int i;
    public void rand(){
        i = (int) (Math.random() * 3);
    }
    @Override
    public String getSong() {
        rand();
        return song[i];
    }
}
