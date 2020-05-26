package hanrury.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class joinController {

    @RequestMapping(value="join/agree", method = RequestMethod.GET)
    public String agree(Model m) {

        return "join/agree";
    }
    @RequestMapping(value="join/checkme", method = RequestMethod.GET)
    public String checkme(Model m) {

        return "join/checkme";
    }
    @RequestMapping(value="join/joinme", method = RequestMethod.GET)
    public String joinme(Model m) {

        return "join/joinme";
    }
    @RequestMapping(value="join/joinok", method = RequestMethod.GET)
    public String joinok(Model m) {

        return "join/joinok";
    }

}