package com.example.User.Modules;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate CreatedOn;

   @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @JsonBackReference(value = "user-order")
    private User user;

   @ManyToMany
    @JoinTable(
            name = "Orders_Cart",
            joinColumns = @JoinColumn(name = "Orders_id"),
            inverseJoinColumns = @JoinColumn(name = "Cart_id")
    )
    @JsonIgnoreProperties("Orders")
    private Set<Cart> cart;

   @ManyToMany
    @JoinTable(
            name = "Orders_Address",
            joinColumns = @JoinColumn( name = "Orders_id"),
            inverseJoinColumns = @JoinColumn(name = "Address_id")
    )
    @JsonIgnoreProperties("Orders")
    private Set<Address> address;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Cart> getCart() {
        return cart;
    }

    public void setCart(Set<Cart> cart) {
        this.cart = cart;
    }

    public Set<Address> getAddresse() {
        return address;
    }

    public void setAddresse(Set<Address> addresse) {
        this.address = addresse;
    }
}
