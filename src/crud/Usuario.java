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
public class Usuario {

    private static int nextId = 0;
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Usuario() {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (!senha.isEmpty()) {
            this.senha = senha;
        } else {
            JOptionPane.showMessageDialog(null, "senha invalido");
        }
    }

}
