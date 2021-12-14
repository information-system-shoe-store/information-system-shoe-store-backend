package com.informationsystemshoestore.shoestoredataservice.payload.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProviderRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.request.SaleRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Accessors(chain = true)
/*
  Response Dto "Товары"
 */
public class ProductResponse {
    /**
     * Код товара
     */
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
    private String amount;

    /**
     * Дата поступления
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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
