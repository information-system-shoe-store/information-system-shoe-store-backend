package com.informationsystemshoestore.shoestoredataservice.payload;

import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

/*
  Dto "Поставщики"
 */
public class ProviderDto {
    /**
     * Код поставщика
     */
    private Long id;

    /**
     * Название
     */
    private String name;

    /**
     * Телефон
     */
    private Integer phone;

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
    private List<ProductResponse> products = new ArrayList<>();
}
