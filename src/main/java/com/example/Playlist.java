package com.example;

import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<AudioFile> {
    private List<AudioFile> audioFiles;
    private List<Playlist> playlists;

    public Playlist(List<AudioFile> audioFiles, List<Playlist> playlists) {
        this.audioFiles = audioFiles;
        this.playlists = playlists;
    }

    @Override
    public Iterator<AudioFile> iterator() {
        return new PlaylistFolderIterator(audioFiles, playlists);
    }

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }
}
