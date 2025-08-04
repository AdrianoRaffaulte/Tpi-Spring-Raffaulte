// package com.informatorio.info_market.mapper.producto.impl;

// import com.informatorio.info_market.domain.Producto;
// import com.informatorio.info_market.dto.producto.ProductoCreateDto;
// import com.informatorio.info_market.dto.producto.ProductoDto;
// import com.informatorio.info_market.mapper.categoria.CategoriaMapper;
// import com.informatorio.info_market.mapper.producto.ProductoMapper;
// import lombok.AllArgsConstructor;
// import org.springframework.stereotype.Component;

// @Component
// @AllArgsConstructor
// public class ProductoMapperImpl implements ProductoMapper {

//     private CategoriaMapper categoriaMapper;

//     @Override
//     public ProductoDto productoToProductoDto(Producto producto) {
//         ProductoDto productoDto = new ProductoDto();
//         productoDto.setId(producto.getId());
//         productoDto.setNombre(producto.getNombre());
//         productoDto.setDescripcion(producto.getDescripcion());
//         productoDto.setStock( producto.getStock() );
//         productoDto.setPrecio(producto.getPrecio());

//         productoDto.setCategorias(
//                 producto.getCategorias().stream()
//                         .map(categoria -> categoriaMapper.categoriaToCategoriaDto(categoria))
//                         .toList()
//         );

//         return productoDto;
//     }
//     @Override
//     public ProductoDto toDto(Producto producto) {
//         if (producto == null) {
//             return null;
//         }

//         return ProductoDto.builder()
//                 .id(producto.getId())
//                 .nombre(producto.getNombre())
//                 .descripcion(producto.getDescripcion())
//                 .precio(producto.getPrecio())
//                 .marca(producto.getMarca()) // <-- importante
//                 .stock(producto.getStock())
//                 .categorias(null) // si aún no está mapeado
//                 .build();
//     }

//     @Override
//     public Producto toEntity(ProductoCreateDto createDto) {
//         if (createDto == null) {
//             return null;
//         }

//         Producto producto = new Producto();
//         producto.setNombre(createDto.getNombre());
//         producto.setDescripcion(createDto.getDescripcion());
//         producto.setPrecio(createDto.getPrecio());
//         producto.setMarca(createDto.getMarca()); // <-- importante
//         producto.setStock(createDto.getStock());
//         // categoría se puede setear luego si corresponde

//         return producto;
//     }


// }