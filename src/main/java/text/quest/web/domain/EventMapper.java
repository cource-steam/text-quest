package text.quest.web.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import text.quest.web.core.repositories.EventRepository;
import text.quest.web.core.repositories.OptionRepository;
import text.quest.web.entities.Event;
import text.quest.web.entities.Option;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service("eventMapperServices")
public class EventMapper implements Mapper<Integer, EventDto> {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private OptionRepository optionRepository;

    @Override
    public EventDto mapImpl(Integer i) {
        Optional<Event> event = eventRepository.findById(i);

        if (event.isEmpty()) throw new NoSuchElementException();

        Optional<Option> firstOption = optionRepository.findById(event.get().getOptionFirst());
        if (firstOption.isEmpty()) throw new NoSuchElementException();

        if (event.get().getOptionSecond() == null) {
            return EventDto.builder()
                    .event(event.get())
                    .firstOptions(firstOption.get())
                    .build();
        } else {
            Optional<Option> secondOption = optionRepository.findById(event.get().getOptionSecond());
            if (secondOption.isEmpty()) throw new NoSuchElementException();

            return EventDto.builder()
                    .event(event.get())
                    .firstOptions(firstOption.get())
                    .secondOptions(secondOption.get())
                    .build();
        }
    }

}
