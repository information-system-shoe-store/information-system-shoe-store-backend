package com.informationsystemshoestore.shoestoredataservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Table(name = "sale", schema = "shoe_store_schema")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/*
  Таблица "Продажи"
 */
public class Sale {
    /**
     * Код продажи
     */
    @Id
    private Long id;

    /**
     * Дата продажи
     */
    private LocalDate saleDate;

    /**
     * Цена
     */
    private Double price;

    /**
     * Количество проданного
     */
    private Integer amountSold;

    /**
     * Товары
     */
    @OneToMany(mappedBy = "sale")
    private List<Product> products;
}
