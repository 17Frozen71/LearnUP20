package services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.ResourceBundle;

@Slf4j
@Service
public class MyService {

    ResourceBundle resource_RU = ResourceBundle.getBundle("text");
    ResourceBundle resource_US = ResourceBundle.getBundle("text", Locale.US);
    private final Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void doWork(String massege){
       logger.log(resource_US.getString(massege), resource_RU.getString(massege));
    }
}
