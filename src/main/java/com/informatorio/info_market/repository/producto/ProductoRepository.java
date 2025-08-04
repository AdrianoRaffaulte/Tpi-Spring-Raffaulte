package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;

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

    @Query("SELECT p.marca FROM Producto p ORDER BY p.precio DESC")
    List<String> findTop10MarcasByPrecioDesc(Pageable pageable);

    List<Producto> findTop10ByOrderByPrecioDesc(Pageable pageable);


}
