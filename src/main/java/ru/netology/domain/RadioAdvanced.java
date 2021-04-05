package ru.netology.domain;

public class RadioAdvanced {
    private int maxSoundVolume;

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {

        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {

        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {

        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        int RadioStation = 0;


        if (currentRadioStation == maxRadioStation + 1) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation == minRadioStation - 1) {
            currentRadioStation = maxRadioStation;

        }

        this.currentRadioStation = currentRadioStation;
    }

    private int minSoundVolume;
    private int currentSoundVolume;
    private int currentRadioStation;

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {

        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {

        this.minRadioStation = minRadioStation;
    }

    private int maxRadioStation;
    private int minRadioStation;
}
