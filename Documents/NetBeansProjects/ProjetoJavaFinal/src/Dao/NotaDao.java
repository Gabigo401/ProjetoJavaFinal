/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author AMD
 */
public class NotaDao {
    private Connection conn;
    
    public NotaDao(Connection conn){
        this.conn  = conn;
    }
    
    public void finalizar(String cpfAtual, int nota) throws SQLException{
        String sql = "UPDATE pedidos SET status = 'Finalizado', avaliacao = ? " +
                 "WHERE cpf_usuario = ? AND status = 'Em andamento'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, nota);
        statement.setString(2, cpfAtual);

        statement.executeUpdate();
        statement.close();
    }
}
