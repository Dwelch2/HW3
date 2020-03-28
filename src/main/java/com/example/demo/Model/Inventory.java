package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    public int id;
    @Column(name = "description")
    public String Description;
    @Column(name = "price")
    public int Price;
    @Column(name = "Color")
    public String Color;


    public Inventory(String Description, int Price, String Color) {
        this.Description = Description;
        this.Price = Price;
        this.Color = Color;
    }
    public Inventory()
    {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice(){return Price;}
    public void setLastName(int Price){this.Price = Price;}

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
