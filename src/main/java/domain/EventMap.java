package domain;

import entity.dto.Event;

import java.util.List;
import java.util.stream.Collectors;

public class EventMap implements Mapper<Event, EventDto> {

    @Override
    public EventDto mapImpl(Event item) {
        EventDto eventDto = new EventDto();
        eventDto.setId(item.getId());
        eventDto.setText(item.getText());
        eventDto.setNextFirst(item.getNextFirst());
        eventDto.setNextSecond(item.getNextSecond());
        return eventDto;
    }

    @Override
    public List<EventDto> mapImpl(List<Event> item) {
        return item.stream()
                .map(this::mapImpl)
                .collect(Collectors.toList());
    }
}
