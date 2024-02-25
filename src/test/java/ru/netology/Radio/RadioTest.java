package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        int expected = 5;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldStationNumberMax() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotStationNumberMax() {
        Radio radio = new Radio();
        radio.setStationNumber(15);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int expected = 50;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNotVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(105);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMin0() {
        Radio radio = new Radio();
        radio.setVolume(-5);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}





