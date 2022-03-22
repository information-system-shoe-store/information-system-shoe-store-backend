package com.informationsystemshoestore.shoestoredataservice.payload.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Accessors(chain = true)
/*
  Response Dto "Продажи"
 */
public class SaleResponse {
    /**
     * Код продажи
     */
    private Long id;

    /**
     * Дата продажи
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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
