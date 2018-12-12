/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import com.google.gson.Gson;
import helper.PasienHelper;
import java.util.List;
import pojos.Pasien;

/**
 *
 * @author Vidoriba
 */
public class testPasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PasienHelper pasien = new PasienHelper();
        List<Pasien> list = pasien.getPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json+"\n");
        
        
    }
    
}
