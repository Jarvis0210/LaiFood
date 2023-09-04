package com.laioffer.onlineorder.repository;


import com.laioffer.onlineorder.entity.RestaurantEntity;
import org.springframework.data.repository.ListCrudRepository;


public interface RestaurantRepository extends ListCrudRepository<RestaurantEntity, Long> {
    //没有需要customize的API，所以是空的
}
