package com.informationsystemshoestore.shoestoredataservice.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
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
     * Дата продажи
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
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
