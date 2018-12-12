/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.UserHelper;
import pojos.User;

/**
 *
 * @author basisa17
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserHelper helper = new UserHelper();
        User cari = helper.cariUser("puspa@usd.ac.id");
        System.out.println("Password: "+ cari.getPassword());
    }
    
}
