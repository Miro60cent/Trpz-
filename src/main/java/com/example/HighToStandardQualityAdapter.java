package com.example;

public class HighToStandardQualityAdapter implements BitrateAdapter {
    @Override
    public byte[] adaptBitrate(AudioFile audioFile, int targetBitrate) {
        System.out.println("Adapting bitrate from " + audioFile.getBitrate() + " to " + targetBitrate + " kb/s");
        // Логіка конвертації бітрейду для високоякісного аудіофайлу до стандартного
        return new byte[]{/* конвертований аудіофайл */};
    }
}
