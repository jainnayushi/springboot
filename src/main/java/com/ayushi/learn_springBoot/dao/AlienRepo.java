package com.ayushi.learn_springBoot.dao;

import com.ayushi.learn_springBoot.Components.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    // Alien - Class to be used
    // Integer - type of primary key
}
