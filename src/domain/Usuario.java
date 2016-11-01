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
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String Acesso;
    
    private String cpf;
    private String cargo;
    
    public Usuario(String Acesso){
        this.Acesso = Acesso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            JOptionPane.showMessageDialog(null, "email invalido");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() == 6) {
            this.senha = senha;
        } else {
            JOptionPane.showMessageDialog(null, "senha invalido");
        }
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            JOptionPane.showMessageDialog(null, "cargo invalido");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (!cargo.isEmpty()) {
            this.cargo = cargo;
        } else {
            JOptionPane.showMessageDialog(null, "cargo invalido");
        }
    }

}
