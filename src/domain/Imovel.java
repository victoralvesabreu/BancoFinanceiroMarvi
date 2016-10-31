/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author victor alves abreu
 */
public class Imovel {

    private int id;
    private float metrosQuad;
    private String descricao;
    private float preco;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private Uf     uf;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public ArrayList<Comodo> getComodo() {
        return comodo;
    }

    public void setComodo(ArrayList<Comodo> comodo) {
        this.comodo = comodo;
    }
    private ArrayList<Comodo> comodo;

    public ArrayList<Comodo> getComodos() {
        return comodo;
    }

    public void setComodos(Comodo comodo) {
        if (comodo == null) {
            this.comodo.add(comodo);
        }else{
            JOptionPane.showMessageDialog(null, "Comodo invalido");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMetrosQuad() {
        return metrosQuad;
    }

    public void setMetrosQuad(float metrosQuad) {
        if (metrosQuad > 0) {
            this.metrosQuad = metrosQuad;
        } else {
            JOptionPane.showMessageDialog(null, "valor invalido para metros quadrados");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (!descricao.isEmpty()) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, "descricao invalido");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            JOptionPane.showMessageDialog(null, "preço invalido");
        }
    }
}