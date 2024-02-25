package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();
        radio.stationNumber = 5;
        int expected = 5;
        int actual = radio.stationNumber;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldStationNumberMax() {
        Radio radio = new Radio();
        radio.stationNumberMax();
         int expected = 9;
        int actual = radio.stationNumber;
        Assertions.assertEquals(expected,actual);
    }

}
