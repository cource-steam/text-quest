package text.quest.web.core.repositories;

import org.springframework.data.repository.CrudRepository;
import text.quest.web.entities.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
