/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

/**
 *
 * @author pc
 */
public class SinhVienDTO {
    private int ma;
    private String ten;
    private String ngaySinh;
    private String email;

    public SinhVienDTO() {
    }

    public SinhVienDTO(int ma, String ten, String ngaySinh, String email) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
