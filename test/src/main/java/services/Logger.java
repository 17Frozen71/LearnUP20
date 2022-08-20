package services;

import org.springframework.stereotype.Component;
@Component
public class Logger {

    public void log (Object EN, Object RU){
        System.out.println("LOG EN: " + EN);
        System.out.println("LOG RU: " + RU);
    }
}
