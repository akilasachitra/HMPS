package com.hmps.hmps.system;

import com.hmps.hmps.dtos.PatientDTO;
import com.hmps.hmps.hardcodedtypes.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * This is the class mainly responsible for sending client data to the server
 */
public class RequestSendManager {

    public static void main(String[] args) throws IOException {
        new RequestSendManager().send();
    }

    public void send() throws IOException {
        // need host and port, to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 7771);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create an object output stream from the output stream and send an object through it
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        //dummy data

        PatientDTO dto = new PatientDTO();
        dto.setId(1000);
        dto.setCode("5644468");
        dto.setFirstName("Jane");
        dto.setLastName("Wanton");
        dto.setSurName("Surge");
        dto.setContact(null);
        dto.setPersonImageID(12345);
        dto.setHisCode("IOLSR23242342");
        dto.setBirthDate(new Date());
        dto.setGender(Gender.FEMALE);
        dto.setBloodGroup(BloodGroup.O_POSITIVE);
        dto.setMaritalStatus(MaritalStatus.SEPARATED);
        dto.setCountry(Country.UNITED_KINGDOM);
        dto.setNationality(10);
        dto.setLanguage(Language.ENGLISH);

        // TODO CRYPTO

        System.out.println("Sending messages to the ServerSocket");
        objectOutputStream.writeObject(dto);

        System.out.println("Closing socket and terminating program");
        socket.close();
    }

}
