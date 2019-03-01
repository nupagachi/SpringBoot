/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.responsitory.SinhVienResponesitory;
import com.example.demo.services.SinhVienDTO;
import com.example.demo.services.SinhVienService;
import java.util.List;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc
 */
@RestController
@RequestMapping("/sinhvien123")
public class SinhVienCtrl {
    @Autowired
    SinhVienService service;
    
    @GetMapping("/")
    public List<SinhVienDTO> getAll(){
        return service.getAll();
    }
}
