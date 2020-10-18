package domain;

import core.hibernate.dao.EventDaoImpl;
import entity.dto.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EventsChoiceImpl implements EventsChoice {
    //todo при работе с отображением определиться в необходимости реализации
    // кнопок выбора отдельными полями класса по их количеству
    private List<Integer> nextEventsId;

    public EventsChoiceImpl(List<Integer> nextEventsId) {
        this.nextEventsId = nextEventsId;
    }

    @Override
    public Event apply(Event event) {
        Optional<Integer> nextEvent = nextEventsId.stream()
                .filter(v -> v.equals(event.getId()))
                .findFirst();
        return nextEvent.map(value -> new EventDaoImpl().findById(value)).orElse(null);
    }

    public static EventsChoiceImpl getInstance(Event event) {
        /*List<Integer> nextEventsId = Arrays.stream(event.getNextEvents().split(","))
                .filter(v -> !v.trim().isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());*/
        return null; //new EventsChoiceImpl(nextEventsId);
    }

}
