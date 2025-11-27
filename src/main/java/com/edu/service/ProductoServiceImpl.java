package com.edu.service;

import com.edu.dto.ProductoRequestDTO;
import com.edu.dto.ProductoResponseDTO;
import com.edu.entity.Producto;
import com.edu.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;



    @Override
    public ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO) {
        Producto producto = new Producto();
        producto.setNombre(productoRequestDTO.getNombre());
        producto.setDescripcion(productoRequestDTO.getDescripcion());
        producto.setPrecio(productoRequestDTO.getPrecio());
        producto.setStock(productoRequestDTO.getStock());

        Producto productoSaved = productoRepository.save(producto);

        ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();
        productoResponseDTO.setId(productoSaved.getId());
        productoResponseDTO.setNombre(productoSaved.getNombre());
        productoResponseDTO.setPrecio(productoSaved.getPrecio());

        return productoResponseDTO;
    }
}
