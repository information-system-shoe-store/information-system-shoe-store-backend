package com.informationsystemshoestore.shoestoredataservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "provider", schema = "shoe_store_schema")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/*
  Таблица "Поставщики"
 */
public class Provider {
    /**
     * Код поставщика
     */
    @Id
    private Long id;

    /**
     * Название
     */
    private String name;

    /**
     * Телефон
     */
    private Integer phone;

    /**
     * Адрес
     */
    private String address;

    /**
     * Контактное лицо
     */
    private String contactPerson;

    /**
     * Товары
     */
    @ManyToMany
    @JoinTable(
            name = "supply_product",
            joinColumns = @JoinColumn(name = "provider_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<>();
}
