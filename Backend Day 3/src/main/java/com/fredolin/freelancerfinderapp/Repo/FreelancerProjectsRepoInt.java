package com.fredolin.freelancerfinderapp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredolin.freelancerfinderapp.Models.FreelancerProjectsModel;

@Repository
public interface FreelancerProjectsRepoInt extends JpaRepository<FreelancerProjectsModel,Integer>{
    
}
