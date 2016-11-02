/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.Database;
import domain.Cliente;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class ClienteCRUD {

    public void inserir(Cliente cliente) {
        Database.listaCliente.add(cliente);
    }

    public ArrayList<Cliente> ler() {
        return Database.listaCliente;
    }

    public Cliente ler(int id) {
        for (Cliente c : Database.listaCliente) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void remover(Cliente cliente) {
        Database.listaCliente.remove(cliente);
    }
    
    public void alterar(int id, Cliente cliente){
        for(Cliente c: Database.listaCliente){
            if(c.getId()== id){
                c.setNome(cliente.getNome());
                c.setCpf(cliente.getCpf());
                c.setEmail(cliente.getEmail());
                c.setRua(cliente.getRua());
                c.setNumero(cliente.getNumero());
                c.setCep(cliente.getCep());
                c.setBairro(cliente.getBairro());
                //uf
            }
        }
    }
}
