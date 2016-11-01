/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author victor alves abreu
 */
public class FormaDePagamento {

    private int id;
    private String tipo;
    
    public static int nextId = 0;

    public FormaDePagamento() {
        this.id = nextId;
        FormaDePagamento.nextId++;
        this.tipo = "";
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            JOptionPane.showMessageDialog(null, "tipo invalido");
        }
    }
}