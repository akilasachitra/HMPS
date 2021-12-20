package com.hmps.hmps.system;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * This is the class mainly responsible for sending client data to the server
 */
public class RequestSendManager {

    private static volatile RequestSendManager instance;

    private RequestSendManager() {
    }

    public static RequestSendManager getInstance() {
        if (instance == null) {
            synchronized (RequestSendManager.class) {
                if (instance == null) {
                    instance = new RequestSendManager();
                }
            }
        }
        return instance;
    }

    public void send(Object dtoObject) throws IOException {
        if (dtoObject == null) {
            System.out.println("Invalid object!");
            return;
        }

        // need host and port, to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 7771);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create an object output stream from the output stream and send an object through it
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        System.out.println("Sending messages to the ServerSocket");
        objectOutputStream.writeObject(dtoObject);

        System.out.println("Closing socket and terminating program");
        socket.close();
    }

}
