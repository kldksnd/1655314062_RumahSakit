/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.DokterHelper;
import pojos.Dokter;

/**
 *
 * @author Vidoriba
 */
public class testTambahDokter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try{
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//        String tglLahir = "19741231";
//        Date date = format.parse(tglLahir);
//        String nama = "Budi";
        
        Integer id = 654321;
        Dokter test = new Dokter( "Baba", "Jantung");
        
        DokterHelper helper = new DokterHelper();
        helper.tambahDokter( "Baba", "Jantung");
        
//    }catch (Exception ex){
//        Logger.getLogger(testTambahPasien.class.getName()).log(Level.SEVERE,null,ex);
//    
//}
    
}
    }
    

