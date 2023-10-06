package com.fredolin.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredolin.freelancerfinderapp.Models.FreelancerSkillsModel;
import com.fredolin.freelancerfinderapp.Repo.FreelancerSkillsRepoInt;

@Service
public class FreelancerSkillsService {
    
    @Autowired
    private FreelancerSkillsRepoInt fsri;

    public List<FreelancerSkillsModel> getdata(){
        return fsri.findAll();
    }

    public FreelancerSkillsModel savedata(FreelancerSkillsModel fsm){
        return fsri.save(fsm);
    }

    public FreelancerSkillsModel updatedata(FreelancerSkillsModel fsm,int id){
        fsm.setId(id);
        return fsri.save(fsm);
    }

    public void deletedata(int id){
        fsri.deleteById(id);
    }
}
