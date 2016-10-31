/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import domain.Cliente;
import domain.Comodo;
import domain.FormaDePagamento;
import domain.Imovel;
import domain.Uf;
import domain.Usuario;
import domain.Venda;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class Database {
    public static ArrayList<Cliente>          listaCliente          = new ArrayList<>();
    public static ArrayList<Usuario>          listaUsuario          = new ArrayList<>();
    public static ArrayList<Uf>               listaUf               = new ArrayList<>();
    public static ArrayList<Venda>            listaVenda            = new ArrayList<>();
    public static ArrayList<Imovel>           listaImovel           = new ArrayList<>();
    public static ArrayList<FormaDePagamento> listaFormaDepagamento = new ArrayList<>();
    public static ArrayList<Comodo>           listaComodo           = new ArrayList<>();
}
