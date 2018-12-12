/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.antrianHelper;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Vidoriba
 */
public class testTambahAntri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("20181220");
            antrianHelper antri = new antrianHelper();
            antri.addNewAntrian(date, "33106", "Viki", "paingan", "umum");
        }catch (Exception e){
            Logger.getLogger(testTambahAntri.class.getName()).log(Level.SEVERE, null,e);
        
    }
    }

}
