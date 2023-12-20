package com.example;

public interface BitrateAdapter {
    byte[] adaptBitrate(AudioFile audioFile, int targetBitrate);
}
