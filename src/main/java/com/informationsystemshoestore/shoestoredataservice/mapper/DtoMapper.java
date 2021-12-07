package com.informationsystemshoestore.shoestoredataservice.mapper;

import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import com.informationsystemshoestore.shoestoredataservice.payload.ProviderDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SaleDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SellerDto;
import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.model.Seller;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    ProductResponse productToDto(Product product);

    ProviderDto providerToDto(Provider dto);

    SaleDto saleToDto(Sale dto);

    SellerDto sellerToDto(Seller dto);

}
