package com.ayushi.learn_springBoot.Controllers;

import com.ayushi.learn_springBoot.Components.Alien;
import com.ayushi.learn_springBoot.dao.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // Simple
    @RequestMapping("/test")
    public String landingPage(){
        return "alienFormPage";
    }
    // Simple
    @RequestMapping("home")
    public String home(){
        System.err.println("here");
        return "homePage";
    }
    // Receive data from client as single object
    //http://localhost:8080/receive1?aid=1&aname=ayushi&lang=java
    @RequestMapping("receive1")
    public ModelAndView receiveData1(Alien alien){
        ModelAndView mv = new ModelAndView();
        // Send model or data
        mv.addObject("obj", alien);
//        Send view name
        mv.setViewName("homePage");
        return mv;
    }

    // Receive data from client as single object
    // http://localhost:8080/receive2?aid=1&aname=ayushi&lang=java
    @RequestMapping("receive2")
    public ModelAndView receiveData2(@RequestParam("aid") int id, @RequestParam("aname") String name, @RequestParam("lang") String lang){
        ModelAndView mv = new ModelAndView();
        // Send model or data
        mv.addObject("alien_id", id);
        mv.addObject("alien_name", name);
        mv.addObject("alien_lang", lang);
//        Send view name
        mv.setViewName("homePage");
        return mv;
    }

    // Add data : Receive data from alienHomePage.jsp View -> Add it to H2 Database
    @Autowired
    AlienRepo repo;
    @RequestMapping("addAlienToDB")
    public String addAlienToDB(Alien alien){
        repo.save(alien);
        return "homePage";
    }

    // Fetch data from db and display on showAlien.jsp
    @RequestMapping("fetchData")
    public ModelAndView fetchData(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("showAlien");
        Alien alien = repo.findById(aid).orElse(new Alien());
        System.out.println(alien);
        mv.addObject("alien", alien);
        return mv;
    }

}
