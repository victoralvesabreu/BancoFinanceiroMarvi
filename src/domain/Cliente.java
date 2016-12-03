/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author victor alves abreu
 */
public class Cliente extends Endereco {

    private int id;
    private String nome;
    private String cpf;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("o campo nome não pode ficar vazio");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            throw new Exception("Cpf invalido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (!email.isEmpty()) {
            this.email = email;
        } else {
            throw new Exception("email invalido");
        }
    }

}
