package com.app.Test;

import com.app.HttpClient.HttpClientTest;
import com.app.constants.Constants;
import  com.app.HttpClient.httpURLConnectionTest;
import com.app.model.Shop;
import com.app.services.ShoeServiceOriginal;
import com.app.springdemo.SpringdemoApplication;
import com.app.util.BaseTest;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class restAPITest extends BaseTest {



   @Test
    public void testShopAPI() throws IOException {
        httpURLConnectionTest test = new httpURLConnectionTest();
        HttpURLConnection responseData = test.sendGetRequest();
        int actualResponseCode = responseData.getResponseCode();

        Object content = responseData.getContent();
        InputStream inputStream = responseData.getInputStream();

        System.out.println("Content is " + content);

        // System.out.println("Response message received is : " + responseMessage);


        System.out.println("Actual Response code is :" + actualResponseCode);

        assertEquals(actualResponseCode, Constants.expResponseCode);

    }


    @Test
    public void testPostRequest() throws IOException {

       // List<Shop> shopInfo= new ArrayList<>();
        Shop shop1 = new Shop();
        shop1.setName("Britannia");
        shop1.setEmployees(Arrays.asList("Lucy", "Mary"));
       // shopInfo.add(shop1);

        String postJson = new Gson().toJson(shop1);

        HttpResponse actualResponse = HttpClientTest.testPOSTConnection(postJson);
        // To get the entity from httpResponse
        /*HttpEntity httpEntity = actualResponse.getEntity();
        String responseList = EntityUtils.toString(httpEntity,"UtF-8");
        System.out.println(responseList);*/
        int statusCode = actualResponse.getStatusLine().getStatusCode();

        System.out.println("Response code of the API :" + statusCode);

        Assert.assertEquals(statusCode,Constants.expResponseCode);


    }


}
