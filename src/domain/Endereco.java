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
public class Endereco {
    protected String rua;
    protected int numero;
    protected String cep;
    protected String bairro;
    protected Uf uf;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if (!rua.isEmpty()) {
            this.rua = rua;
        } else {
            throw new Exception("rua invalido");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if (!(numero == 0)) {
            this.numero = numero;
        } else {
            throw new Exception("numero invalido!");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws Exception {
        if(!cep.isEmpty()){
            this.cep = cep;
        } else {
            throw new Exception("cep invalido!");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if(!bairro.isEmpty()){
            this.bairro = bairro;
        } else {
            throw new Exception("bairro invalido!");
        }
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) throws Exception {
        if(!(uf == null)){
            this.uf = uf;
        } else {
            throw new Exception("uf invalido!");
        }
    }
}
