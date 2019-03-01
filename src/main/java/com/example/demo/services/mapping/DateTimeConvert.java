/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.mapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author pc
 */
public class DateTimeConvert {
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    public String dateToString(Date d){
        return sdf.format(d);
    }
    public Date stringToDate(String a){
        try {
            return sdf.parse(a);
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeConvert.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
