/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import database.DatabaseFactory;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author victor alves abreu
 */
public class LoginValidation {
    public boolean equal(String email, String senha){
        Connection conn = DatabaseFactory.getDatabase("postgres").connect();
        Usuario usuario = new Usuario();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                      "SELECT *"
                    + "  FROM usuario"
                    + "  WHERE email = ?"
                    + "  AND senha = MD5(?)"
            );
            
            pstm.setString(1, email);
            pstm.setString(2, senha);
            
            ResultSet rset = pstm.executeQuery();
            if (rset.next()) {
                usuario.setId(rset.getInt("id"));
                usuario.setNome(rset.getString("nome"));
                usuario.setCpf(rset.getString("cpf"));
                usuario.setAcesso(rset.getString("acesso"));
                usuario.setCargo(rset.getString("cargo"));
                usuario.setSenha(rset.getString("senha"));
                usuario.setEmail(rset.getString("email"));
                Usuario.logado = usuario;
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
}
