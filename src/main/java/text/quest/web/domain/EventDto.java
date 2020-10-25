package text.quest.web.domain;

import lombok.Builder;
import lombok.Data;
import text.quest.web.entities.Event;
import text.quest.web.entities.Option;

@Data
@Builder
public class EventDto {
    private Event event;
    private Option firstOptions;
    private Option secondOptions;
}
