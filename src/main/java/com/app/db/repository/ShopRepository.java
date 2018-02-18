package com.app.db.repository;

import com.app.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface ShopRepository extends JpaRepository<Shop, String> {

}
