package com.app.services;

import com.app.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShopServiceOld {

        private List<Shop> shops = new ArrayList<>(Arrays.asList(
                new Shop("KFC" ,Arrays.asList("Nam","Abhi")),
                new Shop("McDonalds" ,Arrays.asList("Katie","YoYo")),
                new Shop("Minos" ,Arrays.asList("Ghunna","Makdu"))
        ));



        public List<Shop> getAllShopDetails()
        {
            return shops;
        }



        public Shop getShopDetails(String shopName)
        {
            return shops.stream().filter(t -> t.getName().equals(shopName)).findFirst().get();
        }


        public void addShop(Shop shop)
        {
             shops.add(shop);
        }


    public void updateShop(String name, Shop shop) {

            for(int i=0; i< shops.size(); i++)
            {
                Shop s = shops.get(i);

                if(s.getName().equals(name))
                  shops.set(i,shop);
                 return;
            }
    }

    public void deleteShop(String name) {
            shops.removeIf(t ->t.getName().equals(name));
    }
}



