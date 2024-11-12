package com.example.User.Modules;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String price;
    private String stock;
    private LocalDate CreatedOn;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    @JsonBackReference(value = "category-product")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "cartItem_id",referencedColumnName = "id")
    @JsonBackReference(value = "cartItem-products")
    private CartItem cartItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public LocalDate getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        CreatedOn = createdOn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

}
