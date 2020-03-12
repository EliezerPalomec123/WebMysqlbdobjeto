/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsis.edu.model;

import com.unsis.edu.entity.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labtw14
 */
public class UsuarioModelimpl implements IUsuarioModel{
    private SessionFactory sf=null;
    private Session s=null;
    @Override
    public void crearUsuario(Usuario usuario) {
        try{
            sf =new Configuration().configure().buildSessionFactory();
            //sf=new Configuration().configure().builSessionFactory();
            s=  sf.getCurrentSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
        }catch(HibernateException e){
            System.out.println("Error al crear el Registro: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        IUsuarioModel iusuario=new UsuarioModelimpl();
        Usuario usuario=new Usuario("Juan","Juan@gmail.com");
        iusuario.crearUsuario(usuario);
    }
    
}
