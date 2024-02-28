package ru.netology.Radio;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) { // новая станция
        stationNumber = newStationNumber;
    }

    public void setStationNumberMax() { //установка мин станции
        stationNumber = 9;

    }

    public void increaseStationNumber() {  //увеличение станции
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void decreaseStationNumber() {        //уменьшение станции
        if (stationNumber < 9) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 0;
        }
    }

    public void increaseStationNumberMax() {
        if (stationNumber < 9) {
            return;

        } else {
            stationNumber = 0;

        }
    }

    public void increaseStationNumberMin() {
        if (stationNumber > 0) {
            return;

        } else {
            stationNumber = 0;

        }


    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) { // новая станция
        volume = newVolume;
    }

    public void setVolumeMax() { //установка мин станции
        volume = 100;

    }

    public void increaseVolume() {  //увеличение станции
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = 0;
        }
    }

    public void increaseVolumeMax() {
        if (volume < 100) {
            return;

        } else {
            volume = 0;

        }
    }

    public void increaseVolumeMin() {
        if (volume > 0) {
            return;

        } else {
            volume = 0;

        }
    }

    public void decreaseVolume() {        //уменьшение станции
        if (volume < 100) {
            volume = volume - 1;
        } else {
            volume = 0;
        }

    }
}























    