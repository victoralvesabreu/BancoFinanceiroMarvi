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
public class Uf {

    private String codigoUf;
    private String nome;

    public String getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(String codigoUf) throws Exception{
        if (codigoUf.length() == 2) {
            this.codigoUf = codigoUf;
        } else {
            throw new Exception("Codigo Uf Invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("Nome uf invalido!");
        }
    }

}
