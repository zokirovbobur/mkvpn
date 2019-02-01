package bbro.demovpn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping
    public String hw(){return "HW";}
    @GetMapping("req")
    public ModelAndView req(){
        return new ModelAndView("reqPage.html");
    }
}
