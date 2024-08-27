package com.acc.productservice.model.response;

import com.acc.productservice.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private Long id;
    private String name;
    private long price;
    private int quantity;
    private Category category;

}
