package text.quest.web.domain;

import text.quest.web.entities.Event;
import text.quest.web.entities.Option;

import java.util.List;

public interface EventBuilder {
    Event getEvent(int id);
    List<Option> getOption();
    EventDto compareEventAndOption(Event event, List<Option> options);
}
