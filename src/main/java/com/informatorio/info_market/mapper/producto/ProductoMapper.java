package com.informatorio.info_market.mapper.producto;

import com.informatorio.info_market.domain.Categoria;
import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(source = "marca", target = "marca")
    @Mapping(source = "categorias", target = "categorias", qualifiedByName = "mapIdsToCategorias")
    Producto toEntity(ProductoCreateDto productoCreateDto);

    @Mapping(source = "marca", target = "marca")
    ProductoDto toDto(Producto producto);

    @Named("mapIdsToCategorias")
    default List<Categoria> mapIdsToCategorias(List<Long> ids) {
        if (ids == null) return null;
        return ids.stream().map(id -> {
            Categoria c = new Categoria();
            c.setId(id);
            return c;
        }).collect(Collectors.toList());
    }
}
