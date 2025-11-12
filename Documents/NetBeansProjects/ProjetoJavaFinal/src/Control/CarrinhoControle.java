/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Dao.CarrinhoDao;
import Dao.Conexao;
import Dao.NotaDao;
import Dao.PedidoDao;
import Model.Pedido;
import View.Carrinho;
import View.FinalizarPedidos;
import View.TelaComidas;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author AMD
 */
public class CarrinhoControle {
    private Carrinho cr;
    
     public void mostrarCarrinho(TelaComidas tl){
        String cpfAtual =  tl.getCpfAtual();
        
        Carrinho cr = new Carrinho(cpfAtual);
        cr.setVisible(true);
        
        MostrarPedidos(cpfAtual, cr);
    }
    public void MostrarPedidos(String cpfAtual, Carrinho car){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            CarrinhoDao dao = new CarrinhoDao(conn);
            ArrayList<Pedido> pedidos = dao.Mostrar(cpfAtual, "Em andamento");
            
            StringBuilder texto = new StringBuilder();
            for (Pedido p : pedidos) {
                texto.append("Pedido NR:  ")
                     .append(p.getId())
                     .append(" | ")
                     .append(p.getNome())
                     .append(" - R$ ")
                     .append(String.format("%.2f", p.getTotal()))
                     .append(" | Status: ")
                     .append(p.getStatus())
                     .append ("\n");
            }
            
            car.getTxtTela().setText(texto.toString());
            conn.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(car, "Erro ao carregar carrinho: " +
                                          e.getMessage());
        }
    }
    
    public void excluirPedidos(String cpfAtual, int idPedido, Carrinho car){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            CarrinhoDao dao = new CarrinhoDao(conn);
            
            int id = JOptionPane.showConfirmDialog(car, "Deseja excluir esse pedido" +
                     idPedido + "?", "Confirmando a exclusão", JOptionPane.YES_NO_OPTION);
            
            if(id == JOptionPane.YES_OPTION){
                dao.excluir(idPedido, cpfAtual);
                JOptionPane.showMessageDialog(car, "Pedido excluido");
                
                dao.Mostrar(cpfAtual, "Em andamento");
            }
            conn.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(car, "Erro ao excluir pedido:" +
                                          e.getMessage());
        }
    }
}
