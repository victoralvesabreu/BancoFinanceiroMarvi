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
public class Comodos {

    private int id;
    private static int nextId = 0;
    private String nome;
    private int quantidade;

    public Comodos() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "nome invalido");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 1) {
            this.quantidade = quantidade;
        }else{
            JOptionPane.showMessageDialog(null, "quantidade invalido");
        }
    }

}
