/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import helper.UserHelper;
import com.google.gson.Gson;

/**
 *
 * @author basisa17
 */
public class test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserHelper helper = new UserHelper();
        System.out.println(new Gson().toJson(helper.login("puspa@usd.ac.id", "123456789")));
//        System.out.println("Login = "+helper.login("puspa@usd.ac.id", "123456789"));
        
    }
    
}
