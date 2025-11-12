/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author AMD
 */
public class UsuariosDao {
    private Connection conn;
    
    public UsuariosDao(Connection conn) {
        this.conn = conn;
    }
    
    public void Adicionar(Usuarios usuarios) throws SQLException{
        String sql = "INSERT INTO usuario (nome, sobrenome, email, cpf, genero, senha) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getNome());
        statement.setString(2, usuarios.getSobrenome());
        statement.setString(3, usuarios.getEmail());
        statement.setString(4, usuarios.getCPF());
        statement.setString(5, usuarios.getSenha());
        statement.setString(6, usuarios.getGenero());
        statement.executeUpdate();
        statement.close();
    }
    
    public ResultSet consultas(Usuarios usuarios) throws SQLException{
        String sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuarios.getCPF());
        statement.setString(2, usuarios.getSenha());
        return statement.executeQuery();
    }
}
