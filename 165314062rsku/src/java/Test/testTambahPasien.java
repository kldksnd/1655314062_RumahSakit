/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.PasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Pasien;


/**
 *
 * @author Vidoriba
 */
public class testTambahPasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        try{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = format.parse("19980931");
//        String tglLahir = "19980931";
//        Date date = format.parse(tglLahir);
        String nama = "vikikiki";
        String noRm = "654321";
        PasienHelper test = new PasienHelper();
        test.addNewPasien(noRm, nama, "Jogja Istimewa", noRm, date, "perempuan");
//        Pasien test = new Pasien(noRm, nama, "Jogja","noRm", date,"perempuan");
        
//        PasienHelper helper = new PasienHelper();
//        String alamat="jogja";
//        helper.addNewPasien(noRm, nama, alamat, noRm, date, tglLahir);
        
    }catch (Exception ex){
        Logger.getLogger(testTambahPasien.class.getName()).log(Level.SEVERE,null,ex);
    
}
    
}
    
}
