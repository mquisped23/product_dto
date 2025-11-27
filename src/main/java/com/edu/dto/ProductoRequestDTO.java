package com.edu.dto;

import lombok.Data;

@Data
public class ProductoRequestDTO {
    private String nombre;
    private String descripcion;
    private Integer precio;
    private Integer stock;
}
