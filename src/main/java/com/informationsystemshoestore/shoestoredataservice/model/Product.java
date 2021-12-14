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
import java.util.ArrayList;
import java.util.List;

@Table
@Getter
@Setter
@Accessors(chain = true)
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
    private Integer amount;

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
    @Transient
    private List<Provider> providers = new ArrayList<>();

    /**
     * Продажа
     */
    @Transient
    private Sale sale;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
