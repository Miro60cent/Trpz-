package com.example;

import java.util.Iterator;
import java.util.List;

public class PlaylistFolderIterator implements Iterator<AudioFile> {
    private List<AudioFile> audioFiles;
    private List<Playlist> playlists;
    private int currentFileIndex;
    private int currentPlaylistIndex;
    private Iterator<AudioFile> currentPlaylistIterator;

    public PlaylistFolderIterator(List<AudioFile> audioFiles, List<Playlist> playlists) {
        this.audioFiles = audioFiles;
        this.playlists = playlists;
        this.currentFileIndex = 0;
        this.currentPlaylistIndex = 0;
        this.currentPlaylistIterator = audioFiles.iterator();
    }

    @Override
    public boolean hasNext() {
        if (currentFileIndex < audioFiles.size() || currentPlaylistIterator.hasNext()) {
            return true;
        } else if (currentPlaylistIndex < playlists.size()) {
            currentPlaylistIterator = playlists.get(currentPlaylistIndex).iterator();
            currentPlaylistIndex++;
            return hasNext();
        }
        return false;
    }

    @Override
    public AudioFile next() {
        if (currentFileIndex < audioFiles.size()) {
            return audioFiles.get(currentFileIndex++);
        } else if (currentPlaylistIterator.hasNext()) {
            return currentPlaylistIterator.next();
        }
        return null;
    }
}
