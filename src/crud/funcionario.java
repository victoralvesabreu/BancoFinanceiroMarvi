/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author victo
 */
public class funcionario{
    private static int IdNext = 0;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private int cargo;

    public funcionario(){
        id = IdNext;
        IdNext++;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int idFuncionario) {
        this.id = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    
    
}
