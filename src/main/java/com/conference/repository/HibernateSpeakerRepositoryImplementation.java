package com.conference.repository;

import com.conference.model.Speaker;
import com.conference.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImplementation implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{T(java.lang.Math).random() * 100}")
    private double seedNumber;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("John");
        speaker.setLastName("Smith");
        speaker.setSeedNumber(seedNumber);

        System.out.println(speaker.getFirstName() + " " + speaker.getLastName() + " will speak at: " + calendar.getTime());

        speakers.add(speaker);
        return speakers;
    }
}
