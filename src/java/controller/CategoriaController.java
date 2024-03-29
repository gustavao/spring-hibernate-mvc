/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CategoriaDAO;
import model.pojo.Categoria;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 *
 * @author Gustavo Espindola
 */
public class CategoriaController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("categoria");
        try {
           List<Categoria> categorias = CategoriaDAO.listar();
           mv.addObject("categorias",categorias);  
           return mv;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
