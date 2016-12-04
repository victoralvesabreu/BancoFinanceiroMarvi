/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author victor alves abreu
 */
public class ClienteCRUD {

    public void create(Connection conn, Cliente cliente) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO cliente(nome,cpf, email, rua, numero, cep, bairro, uf)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?);"
            );
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getRua());
            pstm.setInt(5, cliente.getNumero());
            pstm.setString(6, cliente.getCep());
            pstm.setString(7, cliente.getBairro());
            pstm.setString(8, cliente.getUf().getCodigoUf());
            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public ArrayList<Cliente> read(Connection conn) throws Exception {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        UfCRUD uf = new UfCRUD();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome, cpf, email, rua, numero, cep, bairro, uf"
                    + "  FROM cliente"
                    + "  ORDER BY id;"
            );

            ResultSet rset = pstm.executeQuery();
            while (rset.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rset.getInt("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setRua(rset.getString("rua"));
                cliente.setEmail(rset.getString("email"));
                cliente.setNumero(rset.getInt("numero"));
                cliente.setCep(rset.getString("cep"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setUf(uf.read(conn, rset.getString("uf")));

                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaClientes;
        }
    }

    public Cliente read(Connection conn, int id) throws Exception {
        Cliente cliente = null;
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome, cpf, email, rua, numero, cep, bairro, uf"
                    + "  FROM cliente"
                    + "  WHERE id=?"
                    + " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();
            UfCRUD uf = new UfCRUD();
            if (rset.next()) {
                cliente = new Cliente();
                cliente.setId(rset.getInt("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setEmail(rset.getString("email"));
                cliente.setRua(rset.getString("rua"));
                cliente.setNumero(rset.getInt("numero"));
                cliente.setCep(rset.getString("cep"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setUf(uf.read(conn, rset.getString("uf")));
                return cliente;

            } else {
                return cliente;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return cliente;
        }
    }

    public ArrayList<Cliente> read(Connection conn, String filtro) throws Exception {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        UfCRUD uf = new UfCRUD();
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id, nome, cpf, email, rua, numero, cep, bairro, uf"
                    + "  FROM cliente"
                    + "  where nome LIKE ?"
                    + "  ORDER BY id;"
            );

            pstm.setString(1, filtro);
            ResultSet rset = pstm.executeQuery();

            while (rset.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rset.getInt("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setRua(rset.getString("rua"));
                cliente.setNumero(rset.getInt("numero"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setUf(uf.read(conn, rset.getString("codigo_uf")));

                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return listaClientes;
        }
    }

    public void update(Connection conn, Cliente cliente) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE cliente"
                    + " SET nome=?, cpf=?, email=?, rua=?, numero=?, cep=?, bairro=?, uf=?"
                    + " WHERE id=?;"
            );
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getRua());
            pstm.setInt(5, cliente.getNumero());
            pstm.setString(6, cliente.getCep());
            pstm.setString(7, cliente.getBairro());
            pstm.setString(8, cliente.getUf().getCodigoUf());
            pstm.setInt(9, cliente.getId());

            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void delete(Connection conn, int id) {
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM cliente"
                    + "  WHERE id=?;"
            );
            pstm.setInt(1, id);
            pstm.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
