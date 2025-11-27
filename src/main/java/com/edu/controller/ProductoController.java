package com.edu.controller;

import com.edu.dto.ProductoRequestDTO;
import com.edu.dto.ProductoResponseDTO;
import com.edu.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoResponseDTO> addProducto(@RequestBody ProductoRequestDTO productoRequestDTO) {
        ProductoResponseDTO respuesta = productoService.save(productoRequestDTO);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }

}
