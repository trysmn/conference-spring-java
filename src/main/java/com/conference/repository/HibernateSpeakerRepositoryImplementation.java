package com.conference.repository;

import com.conference.model.Speaker;
import com.conference.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImplementation implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("John");
        speaker.setLastName("Smith");

        System.out.println(speaker.getFirstName() + " " + speaker.getLastName() + " will speak at: " + calendar.getTime());

        speakers.add(speaker);
        return speakers;
    }
}
