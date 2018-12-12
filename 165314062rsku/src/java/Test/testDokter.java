/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.DokterHelper;
import java.util.List;
import pojos.Dokter;

/**
 *
 * @author Vidoriba
 */
public class testDokter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DokterHelper d = new DokterHelper();
        List<Dokter> list = d.getDokter();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getSpesialis());
        }
        
    }
    
}
