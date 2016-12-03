/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Uf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author tognere
 */
public class UfCRUD {
    public void create(Connection conn, Uf uf){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO uf(codigo_uf, nome)"+
                    "VALUES(?, ?);"
            );
            
            pstm.setString(1, uf.getCodigoUf());
            pstm.setString(2, uf.getNome());
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public ArrayList<Uf> read(Connection conn) throws Exception{
        ArrayList<Uf> listaUf = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT codigo_uf, nome"+
                    "  FROM cliente"+
                    "  ORDER BY id;"
            );
            
            ResultSet rset = pstm.executeQuery();
            while(rset.next()){
                Uf uf = new Uf();
                uf.setCodigoUf(rset.getString("codigo_uf"));
                uf.setNome(rset.getString("nome"));
                
                listaUf.add(uf);
            }
            return listaUf;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaUf;
        }
    }
    
    public Uf read(Connection conn, String codigoUf) throws Exception{
        Uf uf = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT codigo_uf, nome"+
                    "  FROM uf"+
                    "  WHERE codigo_uf=?"+
                    "LIMIT 1;"
            );
            
            pstm.setString(1, codigoUf);
            ResultSet rset = pstm.executeQuery();
            
            if (rset.next()) {
                uf = new Uf();
                uf.setCodigoUf(rset.getString("codigo_uf"));
                uf.setNome(rset.getString("nome"));
            }
            return uf;
            
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return uf;
        }
    }
    
    public void update(Connection conn, Uf uf){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE cliente"+
                    " SET tipo=?"+
                    " WHERE id=?;"
            );
            pstm.setString(1, uf.getNome());
            pstm.setString(2, uf.getCodigoUf());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    
    public void delete(Connection conn, Uf uf){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM uf"+
                    "  WHERE id=?;"
            );
            pstm.setString(1, uf.getCodigoUf());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}
