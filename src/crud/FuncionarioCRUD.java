/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Funcionario;
import database.Database;
import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class FuncionarioCRUD {
    public void inserir(Funcionario funcionario){
        Database.listaUsuario.add((Usuario)funcionario);
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
