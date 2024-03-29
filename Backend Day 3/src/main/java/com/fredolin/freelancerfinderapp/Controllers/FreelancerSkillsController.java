package com.fredolin.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fredolin.freelancerfinderapp.Models.FreelancerSkillsModel;
import com.fredolin.freelancerfinderapp.Services.FreelancerSkillsService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class FreelancerSkillsController {
    
    @Autowired
    private FreelancerSkillsService fss;

    @GetMapping("/getfreelancerskills")
    public List<FreelancerSkillsModel> getdata(){
        return fss.getdata();
    }

    @PostMapping("/savefreelancerskills")
    public FreelancerSkillsModel savedata(@RequestBody FreelancerSkillsModel fsm){
        return fss.savedata(fsm);
    }

    @PutMapping("/updatefreelancerskills")
    public FreelancerSkillsModel updatedata(@RequestBody FreelancerSkillsModel fsm,@PathVariable int id){
        return fss.updatedata(fsm, id);
    }

    @DeleteMapping("/deletefreelancerskills")
    public void deletedata(@PathVariable int id){
         fss.deletedata(id);
    }
}
