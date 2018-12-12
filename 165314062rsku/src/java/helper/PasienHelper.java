/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Location;
import pojos.Pasien;
import util.HibernateUtil;

/**
 *
 * @author admin
 */
public class PasienHelper {

    public PasienHelper() {
    }

    ;
    
    public List<Pasien> getPasien() {
        Session session = util.HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Pasien> hasil = null;
        Query q = session.createQuery("from Pasien p");
        hasil = q.list();
        tx.commit();
        session.close();
        return hasil;
    }

    public void addNewPasien(String noRm, 
                             String nama, 
                             String alamat, 
                             String nik, 
                             Date tanggalLahir, 
                             String kelamin) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pasien pasien = new Pasien(noRm, nama, alamat, nik, tanggalLahir, kelamin);
        session.saveOrUpdate(pasien);
        transaction.commit();
        session.close();
    }
    
    public Pasien cariUser(String noRm) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Pasien u where u.noRm=:noRm";
        Query q = session.createQuery(query);
        q.setParameter("noRm", noRm);
        List<Pasien> list = q.list();
        tx.commit();
        session.close();
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

//    public static String toJson() {
//        PasienHelper helper = new PasienHelper();
//        List<Pasien> list = helper.getPasien();
//        String result = "[";
//        for (int i = 0; i < list.size(); i++) {
//            if (i < (list.size() - 1)) {
//                result += list.get(i).toJson() + ", \n";
//            } else {
//                result += list.get(i).toJson();
//            }
//        }
//        result += "]";
//        return result;
//    }
}
