package com.informationsystemshoestore.shoestoredataservice.payload.request;

import com.informationsystemshoestore.shoestoredataservice.payload.ProviderDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SaleDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SellerDto;
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
  Response Dto "Товары"
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
    private LocalDate receiptDate;

    /**
     * Цена за единицу
     */
    private Double unitPrice;

    /**
     * Поставщики
     */
    private List<ProviderDto> providers = new ArrayList<>();

    /**
     * Продавцы
     */
    private List<SellerDto> sellers = new ArrayList<>();

    /**
     * Продажа
     */
    private SaleDto sale;
}