/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AMD
 */
public class CarrinhoDao {
    private Connection conn;
    
    public CarrinhoDao(Connection conn){
        this.conn  = conn;
    }
    
    public ArrayList<Pedido> Mostrar(String cpfAtual, String status) throws SQLException{
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        String sql = "SELECT * FROM pedidos WHERE cpf_usuario = ? AND status ="
                + " 'Em andamento'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpfAtual);
        ResultSet rs = statement.executeQuery();
        
        while(rs.next()){
            Pedido pd = new Pedido(rs.getString("cpf_usuario"),
                                   rs.getDouble("total"), rs.getInt("avaliacao"),
                                   rs.getString("status"), rs.getString("nome"));
            pd.setId(rs.getInt("id"));
            pedidos.add(pd);
        }
        rs.close();
        statement.close();
        return pedidos;
    }
}
