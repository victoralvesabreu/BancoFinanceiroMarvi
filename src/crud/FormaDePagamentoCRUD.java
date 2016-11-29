/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.FormaDePagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Victor Alves Abreu
 */
public class FormaDePagamentoCRUD {
    public void create(Connection conn, FormaDePagamento pagamento){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO cliente(tipo)"+
                    "VALUES(?);"
            );
            pstm.setString(1, pagamento.getTipo());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public ArrayList<FormaDePagamento> read(Connection conn){
        ArrayList<FormaDePagamento> listaPagamento = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, tipo"+
                    "  FROM forma_pagamento"+
                    "  ORDER BY id;"
            );
            
            ResultSet rset = pstm.executeQuery();
            while(rset.next()){
                FormaDePagamento aux = new FormaDePagamento();
                aux.setId(rset.getInt("id"));
                aux.setTipo(rset.getString("tipo"));
                
                listaPagamento.add(aux);
            }
            return listaPagamento;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaPagamento;
        }
    }
    
    public FormaDePagamento read(Connection conn, int id){
        FormaDePagamento aux = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, tipo"+
                    "  FROM cliente"+
                    "  WHERE id=?"+
                    " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();
            UfCRUD uf = new UfCRUD();
            if (rset.next()) {
                aux = new FormaDePagamento();
                aux.setId(rset.getInt("id"));
                aux.setTipo(rset.getString("tipo"));
                return aux;
                
            }else{
                return aux;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return aux;
        }
    }
    
    public void update(Connection conn, FormaDePagamento pagamento){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE cliente"+
                    " SET tipo=?"+
                    " WHERE id=?;"
            );
            pstm.setString(1, pagamento.getTipo());
            pstm.setInt(2, pagamento.getId());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    
    public void delete(Connection conn, FormaDePagamento pagamento){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM forma_pagamento"+
                    "  WHERE id=?;"
            );
            pstm.setInt(1, pagamento.getId());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}
