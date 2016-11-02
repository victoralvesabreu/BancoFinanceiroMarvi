/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Imovel;
import database.Database;
import java.util.ArrayList;

/**
 *
 * @author tognere
 */
public class ImovelCRUD {
    public void inserir(Imovel imovel){
        Database.listaImovel.add(imovel);
    }
    
    public ArrayList<Imovel> ler(){
        return Database.listaImovel;
    }
    
    public Imovel ler(int id){
        for(Imovel i: Database.listaImovel){
            if (i.getId() == id) {
                return i;   
            }
        }
        return null;
    }
    
    public void remover(Imovel imovel){
        Database.listaImovel.remove(imovel);
    }
    
    public void alterar(int id, Imovel imovel){
        for(Imovel i: Database.listaImovel){
            if(i.getId()== id){
                i.setNome(imovel.getNome());
                i.setMetrosQuad(imovel.getMetrosQuad());
                i.setPreco(imovel.getPreco());
                i.setDescricao(imovel.getDescricao());
                i.setRua(imovel.getRua());
                i.setNumero(imovel.getNumero());
                i.setCep(imovel.getCep());
                i.setBairro(imovel.getBairro());
                //uf
            }
        }
    }
}
