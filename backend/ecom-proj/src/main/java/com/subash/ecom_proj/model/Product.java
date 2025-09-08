package com.subash.ecom_proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int StockQuantity;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageDate;




//    public Product( String name, String description, String brand, BigDecimal price, String category, Date releaseDate, boolean available, int quantity) {
//        this.name = name;
//        this.description = description;
//        this.brand = brand;
//        this.price = price;
//        this.category = category;
//        this.releaseDate = releaseDate;
//        this.available = available;
//        this.quantity = quantity;
//    }


}
