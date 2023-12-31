package com.example;

public class HighQualityAudioAdapterFactory implements AudioAdapterFactory {

    @Override
    public AudioAdapter createAudioAdapter(int bitrate) {
        if (bitrate > 128) {
            return new HighQualityAudioAdapter();
        } else {
            throw new IllegalArgumentException("Unsupported bitrate: " + bitrate);
        }
    }
}