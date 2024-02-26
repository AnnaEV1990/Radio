package ru.netology.Radio;

public class Radio {
    private int stationNumber;
    private int Volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {  // установка радиостанции
        stationNumber = newStationNumber;
    }

    public void setNextStationNumber(int newStationNumber) {  // установка радиостанции
        if (newStationNumber > 9) {
            return;
        }
        if (newStationNumber < 0) {
            return;
        }
        stationNumber = newStationNumber + 1;
    }

    public void setPrevtStationNumber(int newStationNumber) {  // установка радиостанции
        if (newStationNumber > 9) {
            return;
        }
        if (newStationNumber < 0) {
            return;
        }
        stationNumber = newStationNumber - 1;
    }


    public int getVolume() {
        return Volume;
    }

    public void setVolume(int newVolume) {  // установка радиостанции
        Volume = newVolume;
    }

    public void setNextVolume(int newVolume) {  // установка радиостанции
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        Volume = newVolume + 1;
    }

    public void setPrevVolume(int newVolume) {  // установка радиостанции
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        Volume = newVolume - 1;
    }

}







    