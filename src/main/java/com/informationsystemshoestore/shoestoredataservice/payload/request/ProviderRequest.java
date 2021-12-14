package com.informationsystemshoestore.shoestoredataservice.payload.request;

import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Accessors(chain = true)
/*
  Request Dto "Поставщики"
 */
public class ProviderRequest {

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
    private List<ProductResponse> products = new ArrayList<>();
}
