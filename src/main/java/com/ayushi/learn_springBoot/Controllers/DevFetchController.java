package com.ayushi.learn_springBoot.Controllers;

import com.ayushi.learn_springBoot.Components.Developer;
import com.ayushi.learn_springBoot.dao.DevDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DevFetchController {
    @Autowired
    DevDao repo;

    @RequestMapping("/dev")
    public ModelAndView landingPageDev(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("devFormPage");
        System.err.println("Here");
        return mv;
    }

    //Fetch Developers data based
    //1. Default methods
    @RequestMapping("fetchDevDataById")
    public ModelAndView fetchDevData(@RequestParam int devId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("devHomePage");
        Developer dev = repo.findById(devId).orElse(new Developer());
        System.err.println("By Id - " + repo.findById(devId).orElse(new Developer()));
        mv.addObject("dev", dev);
        return mv;
    }
    @RequestMapping("fetchDevDataByDevIdGreaterThan")
    public ModelAndView fetchDevDataByDevIdGreaterThan(@RequestParam int devId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("devHomePage");
        List<Developer> devList = repo.findByDevIdGreaterThan(devId);
        mv.addObject("devList", devList);
        System.err.println("For greater than Id - "+repo.findByDevIdGreaterThan(devId));
        return mv;
    }
    //2. Customized Methods
    @RequestMapping("fetchDevDataByTech")
    public ModelAndView fetchDevDataByTech(@RequestParam String devTech){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("devHomePage");
//        Developer dev = (Developer) repo.findByDevTech(devTech);
//        mv.addObject("dev_tech", dev);
        System.err.println("By Tech - "+repo.findByDevTech(devTech));
        return mv;
    }
    //3. By Query

    @RequestMapping("fetchDevDataByQuery")
    public ModelAndView fetchDevDataByQuery(@RequestParam String devTech){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("devHomePage");
//        Developer dev = (Developer) repo.findByDevTechSorted(devTech);
//        mv.addObject("dev_techSorted", dev);
        System.err.println("By Tech in sorted name order - "+ repo.findByDevTechSorted(devTech));
        return mv;
    }
    // SQL Entry
//    insert into developer values (1, 'ayushi1', 'python1');
//    insert into developer values (2, 'ayushi2', 'python2');
//    insert into developer values (3, 'ayushi3', 'python3');
//    insert into developer values (4, 'ayushi4', 'python4');
//    insert into developer values (6, 'ayushi6', 'python5');
//    insert into developer values (5, 'ayushi5', 'python5');
//    insert into developer values (7, 'ayushi7', 'python5');

    // Output
//    By Id - Developer{devId=2, devName='ayushi2', devTech='python2'}
//    For greater than Id - [Developer{devId=4, devName='ayushi4', devTech='python4'}, Developer{devId=5, devName='ayushi5', devTech='python5'}, Developer{devId=6, devName='ayushi6', devTech='python5'}, Developer{devId=7, devName='ayushi7', devTech='python5'}]
//    By Tech - [Developer{devId=2, devName='ayushi2', devTech='python2'}]
//    By Tech in sorted name order - [Developer{devId=5, devName='ayushi5', devTech='python5'}, Developer{devId=6, devName='ayushi6', devTech='python5'}, Developer{devId=7, devName='ayushi7', devTech='python5'}]


}
