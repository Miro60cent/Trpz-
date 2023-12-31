package com.example;

public class StandardAudioAdapterFactory implements AudioAdapterFactory {

    @Override
    public AudioAdapter createAudioAdapter(int bitrate) {
        if (bitrate <= 128) {
            return new StandardAudioAdapter();
        } else if (bitrate == 196) {
            return new HighQualityAudioAdapter();
        } else {
            throw new IllegalArgumentException("Unsupported bitrate: " + bitrate);
        }
    }
}
