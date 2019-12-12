/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojo.Categoria;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Gustavo Espindola
 */
public class CategoriaDAO {
    
    public static List<Categoria> listar(){
    
        List<Categoria> categorias = null;
        try {
            Session session  = HibernateUtil.getSessionFactory().openSession(); //estamos abriendo la sesion declarada en model.util HibernateUtil.java
            String hql = "from categoria";
            Query query = session.createQuery(hql);
            categorias = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return categorias;
    }
    
}
