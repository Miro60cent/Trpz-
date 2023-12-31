package com.example;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class RadioStationClient {
    private String host;
    private int port;

    public RadioStationClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to the radio station server");

            // Тут можна додати логіку для прослуховування аудіо
        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;
        RadioStationClient client = new RadioStationClient(host, port);
        client.connect();
    }
}
