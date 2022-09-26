package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

    String str = "HOME";
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name",str);
        return "home";
    }
}
