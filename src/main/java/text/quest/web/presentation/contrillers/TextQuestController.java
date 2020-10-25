package text.quest.web.presentation.contrillers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import text.quest.web.domain.EventServices;

@RestController //@Controller
@RequestMapping("/quest")
public class TextQuestController {

    private final EventServices eventServices;

    public TextQuestController(@Qualifier("eventServices") final EventServices eventServices) {
        this.eventServices = eventServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Model getEvent(Model model) {
        //EventDto eventDto = eventServices.getEvent(8);

        model.addAttribute("text", "World");
        model.addAttribute("optionText1", "World");
        model.addAttribute("nextEventId", 8);
        return model;
    }

    @RequestMapping(value = "/quest", method = RequestMethod.GET)
    public Model getEventForId(@RequestParam Integer id, Model model) {
        System.out.println(id);
        model.addAttribute("text", "World1");
        model.addAttribute("optionText1", "World1");
        model.addAttribute("nextEventId", 10);
        return model;
    }
}
