package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository speakerRepository;

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
