package com.informationsystemshoestore.shoestoredataservice.mapper;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProductRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProviderRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.request.SaleRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    Product dtoToProduct(ProductRequest dto);

    Provider dtoToProvider(ProviderRequest dto);

    Sale dtoToSale(SaleRequest dto);

}
