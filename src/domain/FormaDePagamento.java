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
public class FormaDePagamento {

    private int id;
    private String tipo;
    

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            throw new Exception("Tipo Invalido!");
        }
    }
}