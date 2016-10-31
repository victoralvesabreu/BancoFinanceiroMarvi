/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.FormaDePagamento;
import database.Database;
import java.util.ArrayList;

/**
 *
 * @author tognere
 */
public class FormaDePagamentoCRUD {
    public void inserir(FormaDePagamento pagamento){
        Database.listaFormaDepagamento.add(pagamento);
    }
    
    public ArrayList<FormaDePagamento> ler(){
        return Database.listaFormaDepagamento;
    }
    
    public FormaDePagamento ler(int id){
        for(FormaDePagamento f: Database.listaFormaDepagamento){
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
    
    public void remover(FormaDePagamento pagamento){
        Database.listaFormaDepagamento.remove(pagamento);
    }
}
