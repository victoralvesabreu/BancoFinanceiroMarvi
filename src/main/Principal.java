/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.FrmLogin;
import views.FrmPrincipal;


/**
 *
 * @author victo
 */
public class Principal {
    public static void main(String []args){
        FrmLogin menu = new FrmLogin();
        //FrmPrincipal menu = new FrmPrincipal();
        menu.setVisible(true);
    }
}
