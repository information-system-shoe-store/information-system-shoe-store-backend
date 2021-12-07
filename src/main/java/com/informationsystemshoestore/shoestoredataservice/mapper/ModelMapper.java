package com.informationsystemshoestore.shoestoredataservice.mapper;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.model.Seller;
import com.informationsystemshoestore.shoestoredataservice.payload.ProviderDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SaleDto;
import com.informationsystemshoestore.shoestoredataservice.payload.SellerDto;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProductRequest;
import org.mapstruct.Mapper;
import org.reactivestreams.Publisher;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    Product dtoToProduct(ProductRequest dto);

    Provider dtoToProvider(ProviderDto dto);

    Sale dtoToSale(SaleDto dto);

    Seller dtoToSeller(SellerDto dto);

}
