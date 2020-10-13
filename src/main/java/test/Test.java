package test;

import core.hibernate.dao.EventDaoImpl;
import core.springdata.IEventRepository;
import entity.EventList;
import entity.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Scanner;

public class Test {

    @Autowired
    public static IEventRepository repository;

    public static void main(String[] args) throws IOException {
        //Проверка работы с Spring
        //repository.findAll().forEach(Event::toString);

        EventList list = new EventList();
        for (Event event : new EventDaoImpl().findAll()) {
            list.add(event);
        }

        System.out.println("Start");

        System.out.println(list.getObject(0).getText());
        System.out.println(list.get(0).getNextFirst() + " " + list.get(0).getNextSecond());
        System.out.println("Выбери выбор:");

        Scanner scanner = new Scanner(System.in);
        int next = 0;
        boolean exit = false;
        while (!exit) {
            if (scanner.hasNextInt()) {
                next = scanner.nextInt();
                System.out.println(list.getObject(next).getText());
                System.out.println(list.get(next).getNextFirst() + " " +
                        list.get(next).getNextSecond());
                System.out.println("Выбери выбор:");
            } else {
                if (scanner.hasNextLine() && scanner.nextLine().equals("exit")) {
                    exit = true;
                } else System.out.println("Перевыбери выбор:");
            }
        }
    }
}
