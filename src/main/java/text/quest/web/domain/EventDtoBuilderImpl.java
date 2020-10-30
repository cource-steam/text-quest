package text.quest.web.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import text.quest.web.core.repositories.EventRepository;
import text.quest.web.core.repositories.OptionRepository;
import text.quest.web.entities.Event;
import text.quest.web.entities.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service("eventDtoBuilder")
public class EventDtoBuilderImpl implements EventBuilder {

    private Event event;

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private OptionRepository optionRepository;

    @Override
    public Event getEvent(int id) {
        Optional<Event> event = eventRepository.findById(id);
        if (event.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            this.event = event.get();
            return event.get();
        }
    }

    @Override
    public List<Option> getOption() {
        List<Option> options = new ArrayList<>();

        Optional<Option> firstOption = optionRepository.findById(event.getOptionFirst());
        if (firstOption.isEmpty()) throw new NoSuchElementException();
        options.add(firstOption.get());

        if (event.getOptionSecond() != null) {
            Optional<Option> secondOption = optionRepository.findById(event.getOptionSecond());
            if (secondOption.isEmpty()) throw new NoSuchElementException();

            options.add(secondOption.get());
        }

        return options;
    }

    @Override
    public EventDto compareEventAndOption(Event event, List<Option> options) {
        return EventDto.builder()
                .event(event)
                .options(options)
                .build();
    }
}