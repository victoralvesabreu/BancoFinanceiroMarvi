/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class VendaCRUD {

    public void create(Connection conn, Venda venda) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO venda(cliente, forma_pagamento, usuario, imovel, parcelas)"
                    + "VALUES(?,?,?,?,?);"
            );
            pstm.setString(1, venda.getCliente().getCpf());
            pstm.setInt(2, venda.getFormaDePagamento().getId());
            pstm.setInt(3, venda.getUsuario().getId());
            pstm.setInt(4, venda.getImovel().getId());
            pstm.setInt(5, venda.getParcelas());
            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public ArrayList<Venda> read(Connection conn) throws Exception {
        ArrayList<Venda> listaClientes = new ArrayList<>();
        ClienteCRUD cliente = new ClienteCRUD();
        FormaDePagamentoCRUD pagamento = new FormaDePagamentoCRUD();
        UsuarioCRUD usuario = new UsuarioCRUD();
        ImovelCRUD imovel = new ImovelCRUD();

        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, cliente, forma_pagamento, usuario, imovel, parcelas"
                    + "  FROM venda"
                    + "  ORDER BY id;"
            );

            ResultSet rset = pstm.executeQuery();
            while (rset.next()) {
                Venda venda = new Venda();
                venda.setId(rset.getInt("id"));
                venda.setCliente(cliente.read(conn, rset.getString("cliente")));
                venda.setFormaDePagamento(pagamento.read(conn, rset.getInt("forma_pagamento")));
                venda.setUsuario(usuario.read(conn, rset.getInt("usuario")));
                venda.setImovel(imovel.read(conn, rset.getInt("imovel")));
                venda.setParcelas(rset.getInt("parcelas"));

                listaClientes.add(venda);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaClientes;
        }
    }

    public Venda read(Connection conn, int id) throws Exception {
        Venda venda = null;
        ClienteCRUD cliente = new ClienteCRUD();
        FormaDePagamentoCRUD pagamento = new FormaDePagamentoCRUD();
        UsuarioCRUD usuario = new UsuarioCRUD();
        ImovelCRUD imovel = new ImovelCRUD();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, cliente, forma_pagamento, usuario, imovel, parcelas"
                    + "  FROM venda"
                    + "  WHERE id=?"
                    + " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();

            if (rset.next()) {
                venda = new Venda();
                venda.setId(rset.getInt("id"));
                venda.setCliente(cliente.read(conn, rset.getString("cliente")));
                venda.setFormaDePagamento(pagamento.read(conn, rset.getInt("forma_pagamento")));
                venda.setUsuario(usuario.read(conn, rset.getInt("usuario")));
                venda.setImovel(imovel.read(conn, rset.getInt("imovel")));
                venda.setParcelas(rset.getInt("parcelas"));
                return venda;

            } else {
                return venda;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return venda;
        }
    }

    public void update(Connection conn, Venda venda) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE venda"
                    + " SET cliente, forma_pagamento, usuario, imovel, parcelas"
                    + " WHERE id=?;"
            );
            pstm.setString(1, venda.getCliente().getCpf());
            pstm.setInt(2, venda.getFormaDePagamento().getId());
            pstm.setInt(3, venda.getUsuario().getId());
            pstm.setInt(4, venda.getImovel().getId());
            pstm.setInt(5, venda.getParcelas());
            pstm.setInt(9, venda.getId());

            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void delete(Connection conn, Venda venda) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM venda"
                    + "  WHERE id=?;"
            );
            pstm.setInt(1, venda.getId());
            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
