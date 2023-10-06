package com.fredolin.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredolin.freelancerfinderapp.Models.FreelancerAwardsModel;
import com.fredolin.freelancerfinderapp.Repo.FreelancerAwardsRepoInt;

@Service
public class FreelancerAwardsService {
    
    @Autowired
    private FreelancerAwardsRepoInt fari;

    public List<FreelancerAwardsModel> getdata(){
        return fari.findAll();
    }

    public FreelancerAwardsModel savedata(FreelancerAwardsModel fam){
        return fari.save(fam);
    }

    public FreelancerAwardsModel updatedata(FreelancerAwardsModel fam,int id){
        fam.setId(id);
        return fari.save(fam);
    }

    public void deletedata(int id){
        fari.deleteById(id);
    }
}
