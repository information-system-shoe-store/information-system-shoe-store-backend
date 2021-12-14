package com.informationsystemshoestore.shoestoredataservice.payload.request;

import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Accessors(chain = true)
/*
  Request Dto "Продажи"
 */
public class SaleRequest {

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
