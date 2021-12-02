package com.informationsystemshoestore.shoestoredataservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "seller", schema = "shoe_store_schema")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/*
  Таблица "Продавцы"
 */
public class Seller {
    /**
     * Код сотрудника
     */
    @Id
    private Long id;

    /**
     * Табельный номер
     */
    private String personalNumber;

    /**
     * ФИО
     */
    private String fullName;

    /**
     * Должность
     */
    private String position;

    /**
     * Товары
     */
    @ManyToMany
    @JoinTable(
            name = "sale_product",
            joinColumns = @JoinColumn(name = "seller_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<>();
}
