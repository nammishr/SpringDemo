package com.app.controllers;

import com.app.model.Shop;
import com.app.services.ShopService;
import com.app.services.ShopServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {


  @Autowired
  private ShopService shopService;
  //private ShopServiceOld shopService;



  @RequestMapping(value = "/shopdetails", method = RequestMethod.GET, produces = "application/json")
  public List<Shop> getAllShopDetails()
  {

    return shopService.getAllShopDetails();
  }


  @RequestMapping("/shopdetails/{name}")
  public  Shop getShopDetails(@PathVariable String name)
  {
    return shopService.getShopDetails(name);
  }


  @RequestMapping(value = "/shopdetails", method = RequestMethod.POST)
  public void addShop(@RequestBody Shop shop)
  {
    shopService.addShop(shop);
  }


  @RequestMapping(value = "/shopdetails/{name}", method = RequestMethod.PUT)
  public void updateShop(@PathVariable String name, @RequestBody Shop shop)
  {
       shopService.updateShop(name, shop);

  }

  @RequestMapping(value="/shopdetails/{name}", method = RequestMethod.DELETE)
  public void deleteShop(@PathVariable String name)
  {
     shopService.deleteShop(name);
  }



}
