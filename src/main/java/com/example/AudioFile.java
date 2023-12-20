package com.example;
class AudioFile {
    private String name;
    private String format;
    private int bitrate;

    public AudioFile(String name, String format, int bitrate) {
        this.name = name;
        this.format = format;
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", bitrate=" + bitrate +
                '}';
    }
}
