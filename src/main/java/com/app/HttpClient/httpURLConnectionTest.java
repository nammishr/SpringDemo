package com.app.HttpClient;

import com.app.constants.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpURLConnectionTest {



    // Making GET call

    public HttpURLConnection sendGetRequest() throws IOException {

        URL apiURL = new URL(Constants.APIBaseURL);

        HttpURLConnection conn = (HttpURLConnection) apiURL.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type","application/json");

        int responseCode = conn.getResponseCode();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while((inputLine = in.readLine()) != null)
        {
            response.append(inputLine);


        }
        in.close();

        return conn;


    }



}
