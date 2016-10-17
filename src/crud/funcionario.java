/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author victor alves abreu
 */
public class funcionario extends Usuario {
    
    private static int IdNext = 0;
    private int id;
    private String cpf;
    private String cargo;

    public funcionario() {
        id = IdNext;
        IdNext++;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.isEmpty()) {
            this.cpf = cpf;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (!cargo.isEmpty()) {
            this.cargo = cargo;
        }
    }

}
