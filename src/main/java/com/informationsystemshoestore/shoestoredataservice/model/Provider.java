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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table
@Getter
@Setter
@Accessors(chain = true)
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
    private String phone;

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
    @Transient
    private List<Product> products = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
