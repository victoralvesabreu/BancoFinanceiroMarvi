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
    private Endereco endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        } else {
            JOptionPane.showMessageDialog(null, "Endereço invalido");
        }
    }

}
