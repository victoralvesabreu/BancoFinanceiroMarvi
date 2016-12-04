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
public class Usuario {

    public static Usuario logado;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String Acesso;
    private String cpf;
    private String cargo;

    public String getAcesso() {
        return Acesso;
    }

    public void setAcesso(String Acesso) throws Exception {
        if (!Acesso.isEmpty()) {
            this.Acesso = Acesso;
        } else {
            throw new Exception("o campo acesso precisa ser preenchido!");
        }
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

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("Nome Invalido!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new Exception("email invalido!");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (!senha.isEmpty()) {
            this.senha = senha;
        }else{
            throw new IllegalArgumentException("Senha Invalida");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
        } else {
            throw new Exception("Cpf Invalido!");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws Exception {
        if (!cargo.isEmpty()) {
            this.cargo = cargo;
        } else {
            throw new Exception("Cargo invalido!");
        }
    }

}
