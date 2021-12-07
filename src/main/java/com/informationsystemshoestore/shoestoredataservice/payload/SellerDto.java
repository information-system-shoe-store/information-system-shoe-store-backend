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
  Dto "Продавцы"
 */
public class SellerDto {
    /**
     * Код сотрудника
     */
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
    private List<ProductResponse> products = new ArrayList<>();
}
