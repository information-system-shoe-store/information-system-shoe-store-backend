package com.informationsystemshoestore.shoestoredataservice.mapper;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import com.informationsystemshoestore.shoestoredataservice.payload.response.ProviderResponse;
import com.informationsystemshoestore.shoestoredataservice.payload.response.SaleResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    ProductResponse productToDto(Product product);

    ProviderResponse providerToDto(Provider dto);

    SaleResponse saleToDto(Sale dto);

}
