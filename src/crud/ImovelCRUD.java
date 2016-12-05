/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Imovel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author tognere
 */
public class ImovelCRUD {
    public void create(Connection conn, Imovel imovel){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO imovel(nome,metros_quad,descricao ,preco, rua, numero, cep, bairro, uf)"+
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?,?);"
            );
            pstm.setString(1, imovel.getNome());
            pstm.setString(2, Float.toString(imovel.getMetrosQuad()));
            pstm.setString(3, imovel.getDescricao());
            pstm.setString(4, Float.toString(imovel.getPreco()));
            pstm.setString(5, imovel.getRua());
            pstm.setInt(6, imovel.getNumero());
            pstm.setString(7, imovel.getCep());
            pstm.setString(8, imovel.getBairro());
            pstm.setString(9, imovel.getUf().getCodigoUf());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public ArrayList<Imovel> read(Connection conn) throws Exception{
        ArrayList<Imovel> listaImovel = new ArrayList<>();
        UfCRUD uf = new UfCRUD();
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome, metros_quad,descricao ,preco, rua, numero, cep, bairro, uf"+
                    "  FROM imovel"+
                    "  ORDER BY id;"
            );
            
            ResultSet rset = pstm.executeQuery();
            while(rset.next()){
                Imovel imovel = new Imovel();
                imovel.setId(rset.getInt("id"));
                imovel.setNome(rset.getString("nome"));
                imovel.setMetrosQuad(rset.getFloat("metros_quad"));
                imovel.setDescricao(rset.getString("descricao"));
                imovel.setPreco(rset.getFloat("preco"));
                imovel.setRua(rset.getString("rua"));
                imovel.setNumero(rset.getInt("numero"));
                imovel.setCep(rset.getString("cep"));
                imovel.setBairro(rset.getString("bairro"));
                imovel.setUf(uf.read(conn, rset.getString("uf")));
                
                listaImovel.add(imovel);
            }
            return listaImovel;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaImovel;
        }
    }
    
    public Imovel read(Connection conn, int id) throws Exception{
        Imovel imovel = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome,metros_quad, preco, descricao, rua, numero, cep, bairro, uf"+
                    "  FROM imovel"+
                    "  WHERE id=?"+
                    " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();
            UfCRUD uf = new UfCRUD();
            if (rset.next()) {
                imovel = new Imovel();
                imovel.setId(rset.getInt("id"));
                imovel.setNome(rset.getString("nome"));
                imovel.setMetrosQuad(rset.getFloat("metros_quad"));
                imovel.setPreco(rset.getFloat("preco"));
                imovel.setDescricao(rset.getString("descricao"));
                imovel.setRua(rset.getString("rua"));
                imovel.setNumero(rset.getInt("numero"));
                imovel.setBairro(rset.getString("bairro"));
                imovel.setUf(uf.read(conn, rset.getString("uf")));
                return imovel;
                
            }else{
                return imovel;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return imovel;
        }
    }
    
    public ArrayList<Imovel> read(String filtro, Connection conn) throws Exception {
        ArrayList<Imovel> listaClientes = new ArrayList<>();
        UfCRUD uf = new UfCRUD();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome,metros_quad, preco, descricao, rua, numero, cep, bairro, uf"
                    + "  FROM imovel"
                    + "  where nome LIKE ?"
                    + "  ORDER BY nome;"
            );

            pstm.setString(1, filtro);
            ResultSet rset = pstm.executeQuery();

            while (rset.next()) {
                Imovel imovel = new Imovel();
                imovel.setId(rset.getInt("id"));
                imovel.setNome(rset.getString("nome"));
                imovel.setMetrosQuad(rset.getFloat("metros_quad"));
                imovel.setPreco(rset.getFloat("preco"));
                imovel.setDescricao(rset.getString("descricao"));
                imovel.setRua(rset.getString("rua"));
                imovel.setNumero(rset.getInt("numero"));
                imovel.setBairro(rset.getString("bairro"));
                imovel.setUf(uf.read(conn, rset.getString("uf")));

                listaClientes.add(imovel);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaClientes;
        }
    }
    
    public void update(Connection conn, Imovel imovel){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE imovel"+
                    " SET nome=?, metros_quad=?, preco=?,descricao=? ,rua=?, numero=?, cep=?, bairro=?, uf=?"+
                    " WHERE id=?;"
            );
            pstm.setString(1, imovel.getNome());
            pstm.setString(2, Float.toString(imovel.getMetrosQuad()));
            pstm.setString(3, Float.toString(imovel.getPreco()));
            pstm.setString(4, imovel.getDescricao());
            pstm.setString(5, imovel.getRua());
            pstm.setInt(6, imovel.getNumero());
            pstm.setString(7, imovel.getCep());
            pstm.setString(8, imovel.getBairro());
            pstm.setString(9, imovel.getUf().getCodigoUf());
            pstm.setInt(10, imovel.getId());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    
    public void delete(Connection conn, int id){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM imovel"+
                    "  WHERE id=?;"
            );
            pstm.setInt(1,id);
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}
