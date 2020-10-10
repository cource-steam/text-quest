package test;

import core.hibernate.dao.EventDaoImpl;
import domain.EventsChoiceImpl;
import entity.dto.Event;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        //Проверка работы с HBase
        //new EventDaoImpl().save(new Event(0, "Hi"));
        //System.out.println(new EventDaoImpl().findAll());
        //new EventDaoImpl().update(new Event(0, "Ho"));
        //new EventDaoImpl().delete(new EventDaoImpl().findById(0));
        //new EventDaoImpl().save(new ExcelReader().read());

        Event start = new EventDaoImpl().findById(0);
        System.out.println(start.getText());

        EventsChoiceImpl eventsChoice = EventsChoiceImpl.getInstance(start);

        Event event1 = eventsChoice.apply(start);
        System.out.println(event1.getText());

        eventsChoice = EventsChoiceImpl.getInstance(event1);

        Event event2 = eventsChoice.apply(event1);
        System.out.println(event2.getText());
    }

}
