package com.informationsystemshoestore.shoestoredataservice.payload;

import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
/*
  Dto "Продажи"
 */
public class SaleDto {
    /**
     * Код продажи
     */
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
    private List<ProductResponse> products;
}
