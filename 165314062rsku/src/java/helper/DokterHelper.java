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
import pojos.Dokter;
import pojos.Klinik;
import util.HibernateUtil;

public class DokterHelper {
    public DokterHelper(){};
    public List<Dokter> getDokter() {
        Session session = util.HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Dokter> list = null;
        Query q = session.createQuery("from Dokter d");
        list = q.list();
        tx.commit();
        session.close();
        return list;
    }
    public void tambahDokter(
                             String nama, 
                             String spesialis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Dokter dokter = new Dokter(nama, spesialis);
        session.saveOrUpdate(dokter);
        transaction.commit();
        session.close();
    }
}
