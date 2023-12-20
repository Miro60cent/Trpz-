package com.example;

public class StandardAudioAdapter implements AudioAdapter {
    @Override
    public byte[] adapt(AudioFile audioFile) {
        System.out.println("Adapting standard audio format: " + audioFile.getName() +
                " with bitrate: " + audioFile.getBitrate() + " kb/s");
        // Логіка конвертації формату для стандартного аудіофайлу
        return new byte[]{/* конвертований аудіофайл */};
    }
}
