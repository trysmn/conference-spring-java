package com.conference.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class SpeakerTest {
    @Test
    public void shouldHaveAFirstNameAndALastName() {
        String firstName = "Test";
        String lastName = "Speaker";
        Speaker speaker = new Speaker();
        speaker.setFirstName(firstName);
        speaker.setLastName(lastName);

        assertThat(speaker.getFirstName(), is(notNullValue()));
        assertThat(speaker.getLastName(), is(notNullValue()));
    }
}
