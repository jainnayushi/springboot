package com.ayushi.learn_springBoot.Controllers;

import com.ayushi.learn_springBoot.Components.Developer;
import com.ayushi.learn_springBoot.dao.DevDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DevRESTController {
    @Autowired
    DevDao repo;

    @RequestMapping("/devs")
    @ResponseBody
    public String getDevs(){
        return repo.findAll().toString();
    }
    // [Developer{devId=1, devName='ayushi1', devTech='python1'}, Developer{devId=2, devName='ayushi2', devTech='python2'}, Developer{devId=3, devName='ayushi3', devTech='python3'}, Developer{devId=4, devName='ayushi4', devTech='python4'}, Developer{devId=5, devName='ayushi5', devTech='python5'}, Developer{devId=6, devName='ayushi6', devTech='python5'}, Developer{devId=7, devName='ayushi7', devTech='python5'}]
    @RequestMapping("/dev/{devId}")
    @ResponseBody
    public String getDev(@PathVariable("devId") int devId){
        return repo.findById(devId).toString();
    }
    // Optional[Developer{devId=3, devName='ayushi3', devTech='python3'}]

    @PostMapping("/dev")
    @ResponseBody
    public Developer addDev(Developer dev){
        repo.save(dev);
        return dev;
    }

    @DeleteMapping("/dev/{devId}")
    @ResponseBody
    public String deleteDev(@PathVariable("devId") int devId){
        Developer dev = repo.getReferenceById(devId);
        repo.delete(dev);
        return "Deleted";
    }

    @PutMapping("/dev")
    @ResponseBody
    public Developer saveOrUpdateDev(@RequestBody Developer dev){
        repo.save(dev);
        return dev;
    }
}
