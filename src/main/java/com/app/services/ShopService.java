package com.app.services;

import com.app.db.repository.ShopRepository;
import com.app.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

   @Resource
    private ShopRepository shopRepository;

    public List<Shop> getAllShopDetails()
    {
       List<Shop> shops = new ArrayList<>();
       shopRepository.findAll().forEach(shops::add);
       return shops;
    }



    public Shop getShopDetails(String shopName) {
        return shopRepository.findOne(shopName);
    }


    public void addShop(Shop shop)
    {
        shopRepository.save(shop);

    }


    public void updateShop(String name, Shop shop)
    {
       shopRepository.save(shop);

    }

    public void deleteShop(String name)
       {
          shopRepository.delete(name);

       }


}
