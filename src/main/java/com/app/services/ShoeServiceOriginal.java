package com.app.services;

import com.app.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShoeServiceOriginal {

    public List<Shop> getShopInfo()
    {
        List<Shop> list= new ArrayList<>();
        Shop shop1 = new Shop();
        shop1.setName("KFC");
        shop1.setEmployees(Arrays.asList("Namrata", "Abhi"));

        Shop shop2 = new Shop();
        shop2.setName("MCDonalds");
        shop2.setEmployees(Arrays.asList("Ghunna", "Makdu"));


        Shop shop3 = new Shop();
        shop3.setName("Starbucks");
        shop3.setEmployees(Arrays.asList("Katie", "Yuyudhan"));

        list.add(shop1);
        list.add(shop2);
        list.add(shop3);

        return list;

    }

    public List<Shop> getAllShopDetails()
    {
        List<Shop> list = getShopInfo();
        return  list;
    }

    public  Shop getShopDetails(String name)
    {
        return getShopInfo().stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }


    public void addShop(Shop shop)
    {

        List<Shop> list = getShopInfo();
        list.add(shop);
    }


}
