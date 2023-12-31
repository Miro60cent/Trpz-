package com.example;

public class LoggerVisitor implements AudioFileVisitor {
    @Override
    public void visit(AudioFile audioFile) {
        System.out.println("Logging audio file: " + audioFile.getName() + ", Format: " + audioFile.format + ", Bitrate: " + audioFile.getBitrate());
    }
}
