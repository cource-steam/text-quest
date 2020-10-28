package text.quest.web.domain;

import lombok.Builder;
import lombok.Data;
import text.quest.web.entities.Event;
import text.quest.web.entities.Option;

import java.util.List;

@Data
@Builder
public class EventDto {
    private Event event;
    private List<Option> options;
}
