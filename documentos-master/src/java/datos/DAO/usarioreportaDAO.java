/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.DAO;

import datos.configuracion.Conexion;
import datos.entidades.Funcionario;
import datos.entidades.UsuarioReporta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRAYAM
 */
public class usarioreportaDAO implements DAOInterface<Funcionario>{

        public boolean save(UsuarioReporta entity) {
        String sql="";
         boolean exito = false;
        
           
        
        
       
        try {
            Connection c = Conexion.getConexion();
            PreparedStatement statement=null;
            if(this.findById(entity.getDocumento_usuario_reporta())==null) 
            {    
             statement=
                    c.prepareStatement("insert into funcionario values(?,?,?,?,?,?,?)");
            
            statement.setString(1, entity.getDocumento_usuario_reporta());
            statement.setString(2, entity.getNombre());
            statement.setString(3, entity.getApellido1());
            statement.setString(4, entity.getApellido2());
            statement.setString(5, entity.getDireccion());
            statement.setString(6, entity.getTelefono());
            statement.setString(5, entity.getCorreo());
            }
            else
            {
                 statement=
                    c.prepareStatement("update  funcionario set documento_usuario_reporta=?, nombres=?,apellido1=?,apellido2=?,direccion=? telefono=?, correo=?");
                  statement.setString(1, entity.getDocumento_usuario_reporta());
            statement.setString(2, entity.getNombre());
            statement.setString(3, entity.getApellido1());
            statement.setString(4, entity.getApellido2());
            statement.setString(5, entity.getDireccion());
            statement.setString(6, entity.getTelefono());
            statement.setString(5, entity.getCorreo());
            }    
            
            exito = statement.execute();
            
            exito=true;
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            exito=false;
        }
        
        
        return exito;
    }

    @Override
    public void delete(Funcionario entity) {
            
        try {
            Connection c = Conexion.getConexion();
            PreparedStatement statement=
                    c.prepareStatement("delete from funcionario where numero_documento=?");
            
            statement.setString(1, entity.getNumeroDocumento());
           
            
            statement.execute();
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        
        
    }

   
                    public UsuarioReporta findById(Object id) {
            UsuarioReporta entity=null;
        try {
            Connection c = Conexion.getConexion();
            PreparedStatement statement=
                    c.prepareStatement(
                    "select , nombres,apellido1,apellido2, clave from funcionario where numero_documento=?"
                    );
            statement.setString(1, (String)id);
            
            ResultSet results =   statement.executeQuery();
            if(results.next())
            {
                entity = new UsuarioReporta();
                 entity.setDocumento_usuario_reporta(results.getString(1));
                 entity.setNombre(results.getString(2));
                 entity.setApellido1(results.getString(3));
                 entity.setApellido2(results.getString(4));
                 entity.setDireccion(results.getString(5));
                 entity.setTelefono(results.getString(6));
                 entity.setCorreo(results.getString(7));
            }    
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        return entity;
    }

    @Override
    public ArrayList<Funcionario> findAll() {
        ArrayList<Funcionario> entities = new ArrayList<Funcionario>();
        
            try {
            Connection c = Conexion.getConexion();
            PreparedStatement statement=
                    c.prepareStatement(
                    "select numero_documento, nombres,apellido1,apellido2, clave from funcionario"
                    );
            
            
            ResultSet results =   statement.executeQuery();
            while(results.next())
            {
                 Funcionario entity = new Funcionario();
                 entity.setNumeroDocumento(results.getString(1));
                 entity.setNombres(results.getString(2));
                 entity.setApellido1(results.getString(3));
                 entity.setApellido2(results.getString(4));
                 entity.setClave(results.getString(5));
                 entities.add(entity);
            }    
            
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        return entities;
        
    }

    @Override
    public boolean save(Funcionario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
