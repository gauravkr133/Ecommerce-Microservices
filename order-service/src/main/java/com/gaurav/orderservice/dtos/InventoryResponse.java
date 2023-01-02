package com.gaurav.orderservice.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;
    private boolean isInStock;

}
