package com.informationsystemshoestore.shoestoredataservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "product", schema = "shoe_store_schema")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/*
  Таблица "Товары"
 */
public class Product {
    /**
     * Код товара
     */
    @Id
    private Long id;

    /**
     * Наименование
     */
    private String name;

    /**
     * Производитель
     */
    private String manufacturer;

    /**
     * Количество
     */
    private String amount;

    /**
     * Дата поступления
     */
    private LocalDate receiptDate;

    /**
     * Цена за единицу
     */
    private Double unitPrice;

    /**
     * Поставщики
     */
    @ManyToMany(mappedBy = "products")
    private List<Provider> providers = new ArrayList<>();

    /**
     * Продавцы
     */
    @ManyToMany(mappedBy = "products")
    private List<Provider> sellers = new ArrayList<>();

    /**
     * Продажа
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sale_id")
    private Sale sale;
}
