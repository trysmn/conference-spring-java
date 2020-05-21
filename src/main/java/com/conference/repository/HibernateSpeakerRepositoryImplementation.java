package com.conference.repository;

import com.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImplementation implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Hello");
        speaker.setLastName("World");

        speakers.add(speaker);
        return speakers;
    }
}
