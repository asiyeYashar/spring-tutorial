package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String itemName;
    private String code;
    @ManyToMany(mappedBy = "itemList")
    private List<Cart> carts;

    public Item(String itemName, String code) {
        this.itemName = itemName;
        this.code = code;
    }
}
