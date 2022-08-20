package ru.learnup.spring.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.MyService;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestApplication.class, args);
		//Создаем переменные с хранящимися репликами и контекстом
		MyService myService = context.getBean(MyService.class);

		//Запускаем первое событие для вывода приветственого сообщения и сообщения с условиями
		myService.doWork("start");
		myService.doWork("attempt");

		//Создаем рандомное число и инициализируем сканер для дальнейшей работы
		int rnd = (int) (Math.random() * 1000);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(rnd);

		//Далее идет простой алгоритм, который работает пока не отгадаем число, он подсказывает нужно ли увеличить/уменьшить число
		while (a != rnd) {
			if (a < rnd)
				myService.doWork("more");
			else
				myService.doWork("less");
				a = sc.nextInt();
		}

		//Вывод сообщения о победе в игре
		myService.doWork("victory");
	}
}
