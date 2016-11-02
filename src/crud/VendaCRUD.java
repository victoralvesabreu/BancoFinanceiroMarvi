/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Venda;
import database.Database;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class VendaCRUD {
    public void inserir(Venda venda){
        Database.listaVenda.add(venda);
    }
    
    public ArrayList<Venda> ler(){
        return Database.listaVenda;
    }
    
    public Venda ler(int id){
        for(Venda v: Database.listaVenda){
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
    
    public void remover(Venda venda){
        Database.listaVenda.remove(venda);
    }
    
    public void alterar(int id, Venda venda){
        for(Venda v: Database.listaVenda){
            if(v.getId()== id){
                v.setCliente(venda.getCliente());
                v.setFormaDePagamento(venda.getFormaDePagamento());
                v.setUsuario(venda.getUsuario());
                v.setImovel(venda.getImovel());
                v.setParcelas(venda.getParcelas());
            }
        }
    }
}
