/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import javax.swing.JOptionPane;

/**
 *
 * @author victor alves abreu
 */
public class Endereco {

    private int id;
    private static int nextId = 0;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private Uf uf;

    public Endereco() {
        id = nextId;
        nextId++;
        uf = new Uf();
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (!rua.isEmpty()) {
            this.rua = rua;
        } else {
            JOptionPane.showMessageDialog(null, "rua invalido");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!numero.isEmpty()) {
            this.numero = numero;
        } else {
            JOptionPane.showMessageDialog(null, "numero invalido");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (!cep.isEmpty()) {
            this.cep = cep;
        } else {
            JOptionPane.showMessageDialog(null, "cep invalido");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (!bairro.isEmpty()) {
            this.bairro = bairro;
        } else {
            JOptionPane.showMessageDialog(null, "bairro invalido");
        }
    }

}
