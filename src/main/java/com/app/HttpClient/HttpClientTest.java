package com.app.HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class HttpClientTest {


    public static CloseableHttpResponse testPOSTConnection(String postJson) throws IOException {

        CloseableHttpClient client = HttpClientBuilder.create().build();

        try
        {
            HttpPost postRequest = new HttpPost("http://localhost:8086/shopdetails");
            HttpEntity entity = new StringEntity(postJson);
            System.out.println("PostJSON is :" + postJson);
            postRequest.setEntity(entity);
            postRequest.addHeader("Content-Type", "application/json");
            CloseableHttpResponse response = client.execute(postRequest);

            System.out.println("Response is : " + response);

            return response;

        }
        catch (IOException e)
        {

            e.printStackTrace();
        }


        return null;
    }
}
