/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.mapping;

import com.example.demo.entity.Sinhvien;
import com.example.demo.services.SinhVienDTO;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class SinhVienMapper implements IMapping<SinhVienDTO, Sinhvien>{
        DateTimeConvert convert=new DateTimeConvert();
    @Override
    public SinhVienDTO toDTO(Sinhvien e) {
        SinhVienDTO dTO=new SinhVienDTO();
        dTO.setMa(e.getMa());
        dTO.setTen(e.getTen());
        dTO.setEmail(e.getEmail());
        dTO.setNgaySinh(convert.dateToString(e.getNgaysinh()));
        return dTO;
    }

    @Override
    public Sinhvien toEntity(SinhVienDTO d) {
        Sinhvien sinhvien=new Sinhvien();
        sinhvien.setMa(d.getMa());
        sinhvien.setTen(d.getTen());
        sinhvien.setEmail(d.getEmail());
        sinhvien.setNgaysinh(convert.stringToDate(d.getNgaySinh()));
        return sinhvien;
    
}
}
