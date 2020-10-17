package presentation;

import core.hibernate.dao.EventDaoImpl;
import domain.EventDto;
import domain.EventMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServices {

    private EventMap eventMap;
    private EventDaoImpl eventDao;

    @Autowired
    public EventServices(EventMap eventMap,
                       EventDaoImpl eventDao) {
        this.eventMap = eventMap;
        this.eventDao = eventDao;
    }

    public EventDto createDto(Integer eventId) {
        return eventMap.mapImpl(eventDao.findById(eventId));
    }
    
}
