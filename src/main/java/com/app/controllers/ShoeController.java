package com.app.controllers;

import com.app.model.Shoe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShoeController {


    @RequestMapping(value="/shoedetails", method = RequestMethod.GET)
    public List<Shoe> getShoeDetails()
    {

        List<Shoe> list= new ArrayList<>();
        Shoe shoe1 = new Shoe("Reebok", "Black");
        Shoe shoe2 = new Shoe("Reebok1", "Black1");
        Shoe shoe3 = new Shoe("Reebok2", "Black2");
        list.add(shoe1);
        list.add(shoe2);
        list.add(shoe3);

        return list;


    }



}
