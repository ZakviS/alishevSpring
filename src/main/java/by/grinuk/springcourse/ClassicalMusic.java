package by.grinuk.springcourse;

import org.springframework.stereotype.Component;

//если у компонента нет id то id будет название класса с маленькой буквы
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
