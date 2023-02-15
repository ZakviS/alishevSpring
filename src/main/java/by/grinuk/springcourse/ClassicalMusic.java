package by.grinuk.springcourse;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

//если у компонента нет id то id будет название класса с маленькой буквы
@Component
public class ClassicalMusic implements Music {

    String[] song = new String[]{"firstC","secondC","thirdC"};
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
