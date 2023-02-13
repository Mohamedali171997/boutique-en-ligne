package com.example.boutique.en.ligne.product;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;


@Entity
    public class Product  implements Serializable {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_customer", nullable = false)
    private Long idCustomer;



        @NotNull
       //@NotEmpty
        @Basic(optional = false)
        private String name;

        private Double price;

        private String pictureUrl;

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    public void setPrice( double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setName(String name)
    {
        this.name=name;
    }
public String getName()
{
    return name;
}
public String getpictureUrl()
{
    return  pictureUrl ;
}
public void setpictureUrl()
{
    this.pictureUrl = pictureUrl;
}

     public Product() {



        }


        // all arguments contructor
        // standard getters and setters
    }

