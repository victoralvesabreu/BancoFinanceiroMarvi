/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Uf;
import database.Database;
import java.util.ArrayList;

/**
 *
 * @author tognere
 */
public class UfCRUD {
    public void inserir(Uf uf){
        Database.listaUf.add(uf);
    }
    
    public ArrayList<Uf> ler(){
        return Database.listaUf;
    }
    
    public Uf ler(String uf){
        for(Uf u: Database.listaUf){
            if (u.getCodigoUf().equals(uf)) {
                return u;
            }
        }
        return null;
    }
    
    public void remover(Uf uf){
        Database.listaUf.remove(uf);
    }
}
