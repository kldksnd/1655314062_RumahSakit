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
import pojos.Antrian;
import util.HibernateUtil;

/**
 *
 * @author willy
 */
public class antrianHelper {

    public List<Antrian> getAllAntrian() {
        List<Antrian> result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Antrian p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    
    public void addNewAntrian(
            Date tanggal,
            String noRm, 
            String nama, 
            String alamat, 
            String namaKlinik) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        Antrian antrian = new Antrian(tanggal, noRm, nama, alamat, namaKlinik);
        session.saveOrUpdate(antrian);
        transaction.commit();
        session.close();
    }
}
