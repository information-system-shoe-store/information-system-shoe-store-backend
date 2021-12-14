package com.informationsystemshoestore.shoestoredataservice.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Accessors(chain = true)
/*
  Request Dto "Товары"
 */
public class ProductRequest {

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate receiptDate;

    /**
     * Цена за единицу
     */
    private Double unitPrice;

    /**
     * Поставщики
     */
    private List<ProviderRequest> providers = new ArrayList<>();

    /**
     * Продажа
     */
    private SaleRequest sale;
}