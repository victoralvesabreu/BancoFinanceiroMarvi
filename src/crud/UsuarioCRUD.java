/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author victor alves abreu
 */
public class UsuarioCRUD {
    public void create(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO usuario(id, nome, email, senha, acesso, cpf, cargo)"+
                    "VALUES(?,?,?,?,?,?,?);"
            );
            pstm.setInt(1, usuario.getId());
            pstm.setString(2, usuario.getNome());
            pstm.setString(3, usuario.getEmail());
            pstm.setString(4, usuario.getSenha());
            pstm.setString(5, usuario.getAcesso());
            pstm.setString(6, usuario.getCpf());
            pstm.setString(7, usuario.getCargo());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public ArrayList<Usuario> read(Connection conn) throws Exception {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome, email, senha, acesso, cpf, cargo"+
                    "  FROM usuario"+
                    "  ORDER BY id;"
            );
            
            ResultSet rset = pstm.executeQuery();
            while(rset.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rset.getInt("id"));
                usuario.setNome(rset.getString("nome"));
                usuario.setEmail(rset.getString("email"));
                usuario.setSenha(rset.getString("senha"));
                usuario.setAcesso(rset.getString("acesso"));
                usuario.setCpf(rset.getString("cpf"));
                usuario.setCargo(rset.getString("cargo"));
                
                listaUsuarios.add(usuario);
            }
            return listaUsuarios;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaUsuarios;
        }
    }
    
    public Usuario read(Connection conn, int id) throws Exception{
        Usuario usuario = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome,email, senha, acesso, cpf, cargo"+
                    "  FROM usuario"+
                    "  WHERE id=?"+
                    " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();
            UfCRUD uf = new UfCRUD();
            if (rset.next()) {
                usuario = new Usuario();
                usuario.setId(rset.getInt("id"));
                usuario.setNome(rset.getString("nome"));
                usuario.setEmail(rset.getString("email"));
                usuario.setSenha(rset.getString("senha"));
                usuario.setAcesso(rset.getString("acesso"));
                usuario.setCpf(rset.getString("cpf"));
                usuario.setCargo(rset.getString("cargo"));
                return usuario;
                
            }else{
                return usuario;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return usuario;
        }
    }
    
    public void update(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE usuario"+
                    " SET nome=?, email=?,senha=?, acesso=? ,cpf=?, cargo=?"+
                    " WHERE id=?;"
            );
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.setString(4, usuario.getAcesso());            
            pstm.setString(5, usuario.getCpf());
            pstm.setString(6, usuario.getCargo());
            pstm.setInt(7, usuario.getId());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    
    public void delete(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM usuario"+
                    "  WHERE id=?;"
            );
            pstm.setInt(1, usuario.getId());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}
