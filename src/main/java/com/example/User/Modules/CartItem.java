package com.example.User.Modules;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
    private LocalDate CreatedOn;
    @ManyToOne
    @JoinColumn(name = "cart",referencedColumnName = "id")
    @JsonBackReference(value = "cart-cartItem")
    private Cart cart;

    @OneToMany(mappedBy = "cartItem",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "cartItem-products")
    private List<Products> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        CreatedOn = createdOn;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
