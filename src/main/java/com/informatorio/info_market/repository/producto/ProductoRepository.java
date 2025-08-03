package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
    // Query  Methods

    // Filtro por minStock, minPrice y maxPrice
    List<Producto> findAllByStockIsGreaterThanAndPrecioIsBetween(int minStock, Double minPrice, Double maxPrice);
    // Filtro por maxPrice
    List<Producto> findAllByPrecioIsLessThan(Double precio);
    // Filtro por minStock
    List<Producto> findAllByStockIsGreaterThan(int minStock);
}
