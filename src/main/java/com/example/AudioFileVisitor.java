package com.example;

public class AudioFile {
    private String name;
    private String format;
    private int bitrate;

    public AudioFile(String name, String format, int bitrate) {
        this.name = name;
        this.format = format;
        this.bitrate = bitrate;
    }



    public void accept(AudioFileVisitor visitor) {
        visitor.visit(this);
    }
}