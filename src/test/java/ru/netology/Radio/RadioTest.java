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
    public void shouldStationNumberMax() {
        Radio radio = new Radio();
        radio.setStationNumberMax();
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNext() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(8);
        radio.increaseStationNumber();
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNext1() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(10);
        radio.increaseStationNumber();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNextMin1() {   //уменьшили станцию ??
        Radio radio = new Radio();
        radio.setStationNumber(8);
        radio.decreaseStationNumber();
        int expected = 7;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNextMin() {   //уменьшили станцию ??
        Radio radio = new Radio();
        radio.setStationNumber(15);
        radio.decreaseStationNumber();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNextMax() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(101);
        radio.increaseStationNumberMax();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNextMax1() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(8);
        radio.increaseStationNumberMax();
        int expected = 8;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberMin0() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(-2);
        radio.increaseStationNumberMin();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberMin1() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.increaseStationNumberMin();
        int expected = 5;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int expected = 50;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setVolumeMax();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNext() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNext1() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(110);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMax() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.increaseVolumeMax();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMax1() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(85);
        radio.increaseVolumeMax();
        int expected = 85;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMin0() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(-5);
        radio.increaseVolumeMin();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMin01() {  //увеличили станцию
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.increaseVolumeMin();
        int expected = 4;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMin() {   //уменьшили станцию ???
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoluemNextMin1() {   //уменьшили станцию ???
        Radio radio = new Radio();
        radio.setVolume(110);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}