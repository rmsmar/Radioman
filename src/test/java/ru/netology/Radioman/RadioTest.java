package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(9);
        station.nextChannel();
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void prevChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(0);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }
    @Test
    public void setChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(2);
        assertEquals(2, station.getCurrentChannel());
    }

    @Test
    void increaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(1);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }
}


