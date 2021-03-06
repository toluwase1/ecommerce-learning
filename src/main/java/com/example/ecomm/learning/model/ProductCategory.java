package com.example.ecomm.learning.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class ProductCategory extends BaseModel{
    private String categoryName;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

}
