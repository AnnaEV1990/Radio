package ru.netology.Radio;

public class Radio {
    private int stationNumber;
    private int Volume;

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
        return Volume;
    }

    public void setVolume(int newVolume) { // новая станция
        Volume = newVolume;
    }

    public void setVolumeMax() { //установка мин станции
        Volume = 100;

    }

    public void increaseVolume() {  //увеличение станции
        if (Volume < 100) {
            Volume = Volume + 1;
        } else {
            Volume = 0;
        }
    }

    public void increaseVolumeMax() {
        if (Volume < 100) {
            return;

        } else {
            Volume = 0;

        }
    }

    public void increaseVolumeMin() {
        if (Volume > 0) {
            return;

        } else {
            Volume = 0;

        }
    }

    public void decreaseVolume() {        //уменьшение станции
        if (Volume < 100) {
            Volume = Volume - 1;
        } else {
            Volume = 0;
        }

    }
}























    