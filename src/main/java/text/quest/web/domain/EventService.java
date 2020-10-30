package text.quest.web.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("eventService")
public class EventService {

    private final EventDtoBuilderImpl eventDtoBuilder;

    public EventService(@Qualifier("eventDtoBuilder") final EventDtoBuilderImpl eventDtoBuilder) {
        this.eventDtoBuilder = eventDtoBuilder;
    }

    public EventDto getEvent(int id) {
        return eventDtoBuilder.compareEventAndOption(
                eventDtoBuilder.getEvent(id),
                eventDtoBuilder.getOption());
    }
}
