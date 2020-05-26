package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImplementation() {
        System.out.println("We are currently inside the SpeakerServiceImplementation no args constructor...");
    }

    public SpeakerServiceImplementation(SpeakerRepository speakerRepository) {
        System.out.println("We are currently inside the SpeakerServiceImplementation repository constructor...");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository speakerRepository) {
        System.out.println("We are currently inside the SpeakerServiceImplementation repository setter...");
        this.repository = speakerRepository;
    }
}
