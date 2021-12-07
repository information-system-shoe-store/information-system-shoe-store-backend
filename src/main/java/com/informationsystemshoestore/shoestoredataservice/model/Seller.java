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
    @Transient
    private List<Product> products = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
