/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Klinik;
import pojos.Pasien;
import util.HibernateUtil;

/**
 *
 * @author MR98X
 */
public class KlinikHelper {
    public KlinikHelper(){};
    public List<Klinik> getKlinik() {
        Session session = util.HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Klinik> list = null;
        Query q = session.createQuery("from Klinik k");
        list = q.list();
        tx.commit();
        session.close();
        return list;
    }

    public void tambahKlinik(String idKlinik, 
                              String nama, 
                              String spesialis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Klinik klinik = new Klinik(idKlinik, nama, spesialis);
        session.saveOrUpdate(klinik);
        transaction.commit();
        session.close();
    }
}
