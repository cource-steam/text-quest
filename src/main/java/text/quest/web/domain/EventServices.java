package text.quest.web.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import text.quest.web.entities.Event;


@Service("eventServices")
public class EventServices {

    private final EventDtoBuilderImpl eventDtoBuilder;

    public EventServices(@Qualifier("eventDtoBuilderServices") final EventDtoBuilderImpl eventDtoBuilder) {
        this.eventDtoBuilder = eventDtoBuilder;
    }

    public EventDto getEvent(int id) {
        return eventDtoBuilder.compareEventAndOption(
                eventDtoBuilder.getEvent(id),
                eventDtoBuilder.getOption());
    }
}
