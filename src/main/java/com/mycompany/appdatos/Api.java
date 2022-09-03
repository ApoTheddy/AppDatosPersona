package com.mycompany.appdatos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JOptionPane;

public class Api {

    private HttpURLConnection connection;
    private final String urlDni = "https://www.softwarelion.xyz/api/reniec/reniec-dni";
    private final String urlNombres = "https://www.softwarelion.xyz/api/reniec/reniec-nombres";

    private final String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoyMzg1LCJjb3JyZW8iOiJhcG90aGVkZHlAaG90bWFpbC5jb20iLCJpYXQiOjE2NjIwNjc5OTN9.eI4OeBe9XRmdgjj6UX7m1fYJ-YiSWdv6RIn2VSlSNZ8";
    private final ObjectMapper mapper = new ObjectMapper();

    public UserDniModel getDataUserByDni(String dni) {
        try {
            URL url = new URL(this.urlDni);

            String body = "dni=" + dni;
            byte[] datapost = body.getBytes(StandardCharsets.UTF_8);

            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", token);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            try ( var os = new DataOutputStream(connection.getOutputStream())) {
                os.write(datapost);

                try ( var in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    UserDniModel userModel = convertToJson(in.readLine(), new TypeReference<UserDniModel>() {
                    });
                    return userModel;
                }
            }
        } catch (IOException ioEx) {
            JOptionPane.showMessageDialog(null, ioEx.getMessage());
        }
        return null;
    }

    public UserNombresModel getDataUserByNombres(String paterno, String materno, String nombres) {
        try {
            URL url = new URL(this.urlNombres);

            String body = "paterno=" + paterno + "&materno=" + materno + "&nombres=" + nombres;
            byte[] datapost = body.getBytes(StandardCharsets.UTF_8);

            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", token);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            try ( var os = new DataOutputStream(connection.getOutputStream())) {
                os.write(datapost);
                os.close();
                
                try ( var in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    UserNombresModel personas = convertToJson(in.readLine(), new TypeReference<UserNombresModel>() {
                    });

                    in.close();
                    return personas;
                }
            }
            
        } catch (IOException ioEx) {
            JOptionPane.showMessageDialog(null, ioEx.getMessage());
        }
        return null;
    }

    public <T> T convertToJson(String json, TypeReference<T> reference) {
        try {
            return this.mapper.readValue(json, reference);
        } catch (JsonProcessingException jsonEx) {
            JOptionPane.showMessageDialog(null, jsonEx.getMessage());
        }
        return null;
    }

}
