package com.laioffer.onlineorder.entity;
//carry 数据的class用record

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("carts")
public record CartEntity(
        @Id Long id,
        Long customerId,
        Double totalPrice
) {
}
