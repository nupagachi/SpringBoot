/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.responsitory.SinhVienResponesitory;
import com.example.demo.services.mapping.SinhVienMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class SinhVienService {
    @Autowired
    SinhVienResponesitory responesitory;
    
    @Autowired
    SinhVienMapper mapper;
    
    public List<SinhVienDTO> getAll(){
        return responesitory.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }
}
