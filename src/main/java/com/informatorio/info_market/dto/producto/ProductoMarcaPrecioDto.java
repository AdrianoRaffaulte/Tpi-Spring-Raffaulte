package com.informatorio.info_market.dto.producto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductoMarcaPrecioDto {
    private String marca;
    private String nombre;
    private Double precio;
}
