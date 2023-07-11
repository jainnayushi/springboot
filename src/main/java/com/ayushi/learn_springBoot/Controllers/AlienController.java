package com.ayushi.learn_springBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
    @RequestMapping("/")
    public ModelAndView alienForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienFormPage");
        return mv;
    }
}

