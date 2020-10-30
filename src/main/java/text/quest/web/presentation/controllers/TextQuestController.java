package text.quest.web.presentation.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import text.quest.web.domain.EventDto;
import text.quest.web.domain.EventService;

@RestController
public class TextQuestController {

    private final EventService eventService;

    public TextQuestController(@Qualifier("eventService") final EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public Model start(Model model) {
        return model;
    }

    @RequestMapping(value = "/quest", method = RequestMethod.GET)
    public Model getEventById(@RequestParam Integer id, Model model) {
        EventDto eventDto = eventService.getEvent(id);
        model.addAttribute("text", eventDto.getEvent().getText());
        model.addAttribute("options", eventDto.getOptions());

        return model;
    }

    @RequestMapping(value = "/quest", method = RequestMethod.POST)
    public @ResponseBody Integer getNextEventId(@RequestParam Integer id) {
        return id;
    }
}