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

    public void setUsuario(Usuario usuario) throws Exception {
        if (!(usuario == null)) {
            this.usuario = usuario;
        } else {
            throw new Exception("usuario invalido!");
        }
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

    public void setCliente(Cliente cliente) throws Exception {
        if (cliente != null) {
            this.cliente = cliente;
        } /*else {
            throw new Exception("cliente invalido!");
        }*/
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) throws Exception {
        if (formaDePagamento != null) {
            this.formaDePagamento = formaDePagamento;
        } else {
            throw new Exception("forma de pagamento invalida!");
        }
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) throws Exception {
        if (imovel != null) {
            this.imovel = imovel;
        } else {
            throw new Exception("Imovel invalido!");
        }
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) throws Exception {
        if (parcelas > 0) {
            this.parcelas = parcelas;
        } else {
            throw new Exception("parcelas invalida!");
        }
    }

}
