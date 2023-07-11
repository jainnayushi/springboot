package com.ayushi.learn_springBoot.dao;

import com.ayushi.learn_springBoot.Components.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DevDao extends JpaRepository<Developer, Integer> {
    List<Developer> findByDevTech(String devTech);
    List<Developer> findByDevIdGreaterThan(int devId);
    @Query("from Developer where devTech=?1 order by devName")
    List<Developer> findByDevTechSorted(String devTech);


}
