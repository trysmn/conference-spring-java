package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImplementation implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImplementation() {
        System.out.println("We are currently inside the SpeakerServiceImplementation no args constructor...");
    }

    public SpeakerServiceImplementation(SpeakerRepository speakerRepository) {
        System.out.println("We are currently inside the SpeakerServiceImplementation repository constructor...");
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We are currently inside the initialize method...");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository speakerRepository) {
        System.out.println("We are currently inside the SpeakerServiceImplementation repository setter...");
        this.repository = speakerRepository;
    }
}
