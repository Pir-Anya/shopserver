package DAO;

import shop.category;
import shop.goods;
import util.HibernateUtil;
//import hibernate.cfx.xml;

import java.sql.SQLException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import util.HibernateUtil;
import javax.swing.*;
import org.hibernate.Session;
import org.hibernate.Query;


public class ShopDAOImpl  implements ShopDAO{
    public void addGood(goods good) throws SQLException {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(good);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }
    //  public void updateBus(Long bus_id, Bus bus) throws SQLException;
    // public Bus getBusById(Long bus_id) throws SQLException;
    public Collection getAllGoods() throws SQLException{
        Session session = null;
        List list_goods = new ArrayList<goods>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list_goods = session.createCriteria(goods.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return list_goods;
    };
    // public void deleteBus(Bus bus) throws SQLException;
    public Collection getGoodsByCategory(category cat) throws SQLException{
        Session session = null;
        List list_goods = new ArrayList<goods>();
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            int cat_id = cat.getId();
            Query query = session.createQuery("from goods where category_id = :cat_id").setLong("cat_id", cat_id);
            list_goods = (List<goods>) query.list();
            session.getTransaction().commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return goods;
    };
}
