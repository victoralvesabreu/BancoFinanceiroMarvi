/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Usuario;
import database.Database;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class UsuarioCRUD {
    public void inserir(Usuario usuario){
        Database.listaUsuario.add(usuario);
    }
    
    public ArrayList<Usuario> ler(){
        return Database.listaUsuario;
    }
    
    public Usuario ler(int id){
        for(Usuario u: Database.listaUsuario){
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    
    public void remover(Usuario usuario){
        Database.listaUsuario.remove(usuario);
    }
}
