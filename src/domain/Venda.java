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
    private static int nextId = 0;
    private Cliente cliente;
    private FormaDePagamento formaDePagamento;
    private Funcionario funcionario;
    private Imovel imovel;
    private int parcelas;

    public Venda() {
        id = nextId;
        nextId++;

        cliente = new Cliente();
        formaDePagamento = new FormaDePagamento();
        funcionario = new Funcionario();
        imovel = new Imovel();
    }

    public int getId() {
        return id;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }else{
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            this.funcionario = funcionario;
        } else {
            JOptionPane.showMessageDialog(null, "funcionario invalido");
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
