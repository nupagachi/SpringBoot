/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.mapping;

/**
 *
 * @author pc
 */
public interface IMapping<D,E> {
    D toDTO(E e);
    E toEntity(D d);
}
