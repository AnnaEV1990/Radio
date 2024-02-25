package ru.netology.Radio;

public class Radio {
    public int stationNumber;

    public void stationNumberMax() {
        stationNumber = 9;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            newStationNumber = newStationNumber + 1;
            {
                return;
            }
        }
        stationNumber = newStationNumber;
    }

    public int Volume;

    public void VolumeMax() {
        Volume = 100;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        if (newVolume < 100) {
            newVolume = newVolume + 1;
            {
                return;
            }
        }
        Volume = newVolume;
    }
}





    