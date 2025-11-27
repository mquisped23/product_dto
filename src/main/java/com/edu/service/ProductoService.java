package com.edu.service;

import com.edu.dto.ProductoRequestDTO;
import com.edu.dto.ProductoResponseDTO;

public interface ProductoService {
    ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO);
}
