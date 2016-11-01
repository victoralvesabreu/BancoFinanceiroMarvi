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
public class Venda {

    private int id;
    private Cliente cliente;
    private FormaDePagamento formaDePagamento;
    private Usuario usuario;
    private Imovel imovel;
    private int parcelas;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            JOptionPane.showMessageDialog(null, "cliente invalido");
        }
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        if (formaDePagamento != null) {
            this.formaDePagamento = formaDePagamento;
        } else {
            JOptionPane.showMessageDialog(null, "forma de pagamento invalido");
        }
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        if (imovel != null) {
            this.imovel = imovel;
        } else {
            JOptionPane.showMessageDialog(null, "imovel invalido");
        }
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        if (parcelas > 0) {
            this.parcelas = parcelas;
        } else {
            JOptionPane.showMessageDialog(null, "parcelas invalido");
        }
    }

}
