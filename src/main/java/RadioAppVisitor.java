package com.example;

import java.util.ArrayList;
import java.util.List;

public class RadioAppVisitor {
    public static void main(String[] args) {
        // Створення аудіофайлів
        AudioFile song1 = new AudioFile("Song1.mp3", "mp3", 128);
        AudioFile song2 = new AudioFile("Song2.wav", "wav", 196);

        // Створення плейлісту
        Playlist playlist = new Playlist(List.of(song1, song2), new ArrayList<>());

        // Ініціалізація і використання LoggerVisitor
        AudioFileVisitor loggerVisitor = new LoggerVisitor();
        for (AudioFile audioFile : playlist) {
            audioFile.accept(loggerVisitor);
        }

        // Ініціалізація AudioAdapterFactory
        AudioAdapterFactory audioAdapterFactory = new StandardAudioAdapterFactory();

        // Використання фасаду для спрощення взаємодії з сервером радіостанції
        RadioStationFacade radioStation = new RadioStationFacade(
                playlist.getAudioFiles(),
                new ArrayList<>(),
                audioAdapterFactory
        );

        // Відтворення аудіо на різних рівнях бітрейту
        radioStation.playAudio(64);
        radioStation.playAudio(128);
        radioStation.playAudio(196);

        // Використання адаптера для конвертації бітрейду
        BitrateAdapter standardToHighQualityAdapter = new StandardToHighQualityAdapter();
        standardToHighQualityAdapter.adaptBitrate(song1, 224);

        // Можна додати додаткову логіку тут...
    }
}
