package com.example;

import java.util.List;

public class RadioStationFacadeGit {
    private List<AudioFile> audioFiles;
    private List<Playlist> playlists;
    private AudioAdapterFactory audioAdapterFactory;

    public RadioStationFacadeGit(List<AudioFile> audioFiles, List<Playlist> playlists, AudioAdapterFactory audioAdapterFactory) {
        this.audioFiles = audioFiles;
        this.playlists = playlists;
        this.audioAdapterFactory = audioAdapterFactory;
    }

    public void playAudio(int bitrate) {
        AudioAdapter audioAdapter = audioAdapterFactory.createAudioAdapter(bitrate);
        for (AudioFile audioFile : audioFiles) {
            audioAdapter.adapt(audioFile);
            // Логіка мовлення аудіофайлів на радіостанцію
        }
    }


}
