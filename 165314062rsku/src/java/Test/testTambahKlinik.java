/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.KlinikHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Klinik;

/**
 *
 * @author Vidoriba
 */
public class testTambahKlinik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String idKlinik = "654321";
        Klinik test = new Klinik(idKlinik, "Umum", "Penyakit umum");
        
        KlinikHelper helper = new KlinikHelper();
        String alamat="jogja";
        helper.tambahKlinik(idKlinik, "Umum", "Penyakit umum");
        
    }catch (Exception ex){
        Logger.getLogger(testTambahKlinik.class.getName()).log(Level.SEVERE,null,ex);
    
}
    }
    
}
