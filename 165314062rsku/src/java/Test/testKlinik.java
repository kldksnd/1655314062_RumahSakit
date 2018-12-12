/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.KlinikHelper;
import java.util.List;
import pojos.Klinik;

/**
 *
 * @author Vidoriba
 */
public class testKlinik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KlinikHelper k = new KlinikHelper();
        List<Klinik> list =k.getKlinik();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getIdKlinik());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getSpesialis());
        }
    }
    
}
