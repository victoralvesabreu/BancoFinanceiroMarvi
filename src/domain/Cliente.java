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
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private Uf     uf;
    
    public static int nextId = 0;
    
    //metodo construtor
    public Cliente(){
        this.id     = nextId;
        Cliente.nextId++;
        this.nome   = "";
        this.cpf    = "";
        this.email  = "";
        this.rua    = "";
        this.numero = "";
        this.cep    = "";
        this.bairro = "";
        this.uf     = new Uf();
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
        if(!nome.isEmpty()) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {      
        if(!cpf.isEmpty()){
            this.cpf = cpf;
        } else {
            JOptionPane.showMessageDialog(null, "Cpf inválido!!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        } else {
            JOptionPane.showMessageDialog(null, "Email inválido!");
        }
    }

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
}