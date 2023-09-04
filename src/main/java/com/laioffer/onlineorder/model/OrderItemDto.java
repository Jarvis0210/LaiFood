package com.laioffer.onlineorder.model;


import com.laioffer.onlineorder.entity.MenuItemEntity;
import com.laioffer.onlineorder.entity.OrderItemEntity;


public record OrderItemDto(
        //假设现在需要显示一个cart的点的餐，内容，需要什么东西
        //DTO: data transfer object
        Long orderItemId,
        Long menuItemId,
        Long restaurantId,
        Double price,
        Integer quantity,
        String menuItemName,
        String menuItemDescription,
        String menuItemImageUrl
) {


    public OrderItemDto(OrderItemEntity orderItemEntity, MenuItemEntity menuItemEntity) {
        //菜单Entity和Menu的Entity合并起来，方便使用
        this(
                orderItemEntity.id(),
                orderItemEntity.menuItemId(),
                menuItemEntity.restaurantId(),
                orderItemEntity.price(),
                orderItemEntity.quantity(),
                menuItemEntity.name(),
                menuItemEntity.description(),
                menuItemEntity.imageUrl()
        );
    }
}
