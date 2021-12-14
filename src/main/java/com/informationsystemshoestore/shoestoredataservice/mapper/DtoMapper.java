package com.informationsystemshoestore.shoestoredataservice.mapper;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProviderRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.request.SaleRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    ProductResponse productToDto(Product product);

    ProviderRequest providerToDto(Provider dto);

    SaleRequest saleToDto(Sale dto);

}
