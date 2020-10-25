package text.quest.web.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("eventServices")
public class EventServices {

    private final EventMapper eventMap;

    public EventServices(@Qualifier("eventMapperServices") final EventMapper eventMap) {
        this.eventMap = eventMap;
    }

    public EventDto getEvent(int i) {
        return eventMap.mapImpl(i);
    }
}
