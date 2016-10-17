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
public class Uf {

    private String codigoUf;
    private String nome;

    public String getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(String codigoUf) {
        if (!codigoUf.isEmpty()) {
            this.codigoUf = codigoUf;
        } else {
            JOptionPane.showMessageDialog(null, "codigo uf invalido");
        }
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

}
