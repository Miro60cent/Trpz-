package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RadioStationServer {
    private int port;

    public RadioStationServer(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Radio Station Server is running on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 8080; // Порт сервера
        RadioStationServer server = new RadioStationServer(port);
        server.start();
    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // Тут можна додати логіку обробки клієнта, таку як відправлення аудіоданих
        System.out.println("Client connected: " + socket.getInetAddress());
    }
}
