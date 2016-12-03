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
public class Imovel extends Endereco{

    private int id;
    private String nome;
    private float metrosQuad;
    private float preco;
    private String descricao;
    

    public Imovel() {
        this.uf = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }else{
            throw new Exception("nome invalido!");
        }
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMetrosQuad() {
        return metrosQuad;
    }

    public void setMetrosQuad(float metrosQuad) throws Exception {
        if (metrosQuad > 0) {
            this.metrosQuad = metrosQuad;
        } else {
            throw new Exception("Metros quadrados invalido!");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        if (!descricao.isEmpty()) {
            this.descricao = descricao;
        } else {
            throw new Exception("descricao invalida!");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) throws Exception {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new Exception("Preco Invalido");
        }
    }
}
