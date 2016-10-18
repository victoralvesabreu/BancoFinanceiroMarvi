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
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Cliente() {
        endereco = new Endereco();
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

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            JOptionPane.showMessageDialog(null, "cpf invalido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.isEmpty()) {
            this.email = email;
        } else {
            JOptionPane.showMessageDialog(null, "email invalido");
        }
    }

}
