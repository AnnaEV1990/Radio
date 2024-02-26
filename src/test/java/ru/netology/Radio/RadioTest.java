package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(6);
        int expected = 6;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberMin() {
        Radio radio = new Radio();
        radio.setNextStationNumber(-5);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotStationNumberMax() {
        Radio radio = new Radio();
        radio.setNextStationNumber(15);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNumber() {
        Radio radio = new Radio();
        radio.setNextStationNumber(8);
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevtStationNumber() {
        Radio radio = new Radio();
        radio.setPrevtStationNumber(8);
        int expected = 7;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeMax() {
        Radio radio = new Radio();
        radio.setNextVolume(105);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMin0() {
        Radio radio = new Radio();
        radio.setPrevVolume(-5);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSetVolume() {
        Radio radio = new Radio();
        radio.setNextVolume(99);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSetVolume() {
        Radio radio = new Radio();
        radio.setPrevVolume(99);
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}






