package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutController {
    @GetMapping("/")
    public String AboutMain(Model model)
    {        return "about";
    }
}
