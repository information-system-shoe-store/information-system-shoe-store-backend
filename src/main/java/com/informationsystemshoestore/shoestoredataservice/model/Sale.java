package com.informationsystemshoestore.shoestoredataservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table
@Getter
@Setter
@Accessors(chain = true)
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
    @Transient
    private List<Product> products;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
