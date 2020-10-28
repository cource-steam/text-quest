package text.quest.web.presentation.contrillers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import text.quest.web.domain.EventDto;
import text.quest.web.domain.EventServices;
import text.quest.web.entities.Option;

import java.util.ArrayList;

@RestController //@Controller
public class TextQuestController {

    private final EventServices eventServices;

    public TextQuestController(@Qualifier("eventServices") final EventServices eventServices) {
        this.eventServices = eventServices;
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public Model start(Model model) {
        return model;
    }

    @RequestMapping(value = "/quest", method = RequestMethod.GET)
    public Model getEventById(@RequestParam Integer id, Model model) {
        EventDto eventDto = eventServices.getEvent(id);
        model.addAttribute("text", eventDto.getEvent().getText());
        model.addAttribute("options", eventDto.getOptions());

        System.out.println(eventDto.getOptions());
        return model;
    }

     @RequestMapping(value = "/quest", method = RequestMethod.POST)
    public @ResponseBody Integer getNextEventId(@RequestParam Integer id) {
        return id;
    }
}