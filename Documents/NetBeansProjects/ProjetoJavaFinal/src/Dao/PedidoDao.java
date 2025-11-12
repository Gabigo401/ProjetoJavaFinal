/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import Model.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author AMD
 */
public class PedidoDao {
    private Connection conn;

    public PedidoDao(Connection conn){
        this.conn = conn;
    }
   
   public void Adicionar(Pedido pedido) throws SQLException {
        String sql = "INSERT INTO pedidos (cpf_usuario, total, avaliacao, status, nome) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pedido.getCpfUsuario());
        statement.setDouble(2, pedido.getTotal());
        statement.setInt(3, pedido.getNota());
        statement.setString(4, pedido.getStatus());
        statement.setString(5, pedido.getNome());

        statement.executeUpdate();
        statement.close();
   }
}
