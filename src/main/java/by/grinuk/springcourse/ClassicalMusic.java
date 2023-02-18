package by.grinuk.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//если у компонента нет id то id будет название класса с маленькой буквы
@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

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
