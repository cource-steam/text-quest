package domain;

import entity.dto.Event;

import java.util.function.Function;

public interface EventsChoice extends Function<Event, Event> {

}
