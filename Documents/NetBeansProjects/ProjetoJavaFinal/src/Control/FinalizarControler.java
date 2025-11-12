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
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AMD
 */
public class FinalizarControler {
    public void FinalizarPedidos(String cpfAtual, Carrinho car){
        Conexao conexao = new Conexao();
        try{
            String notFin = car.getTxtNota().getText();
            
            int nota = Integer.parseInt(notFin);
            
            Connection conn = conexao.getConnection();
            CarrinhoDao dao = new CarrinhoDao(conn);
            NotaDao nt = new NotaDao(conn);
            
            nt.finalizar(cpfAtual, nota);
            JOptionPane.showMessageDialog(car, "Pedido Finalizado.", "Sucesso",
                                          JOptionPane.INFORMATION_MESSAGE);
            dao.Mostrar(cpfAtual, "Finalizado");
            
            
            FinalizarPedidos fim = new FinalizarPedidos(cpfAtual);
            fim.setVisible(true);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(car, 
            "Erro ao finalizar pedido: " + e.getMessage());
        }
    }
    
    public void MostrarPedidosFinal(String cpfAtual, FinalizarPedidos fim){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            CarrinhoDao dao = new CarrinhoDao(conn);
            NotaDao nt = new NotaDao(conn);
            
            ArrayList<Pedido> pedidos = nt.MostrarFinais(cpfAtual, "Finalizado");
            
            StringBuilder text = new StringBuilder();
            for(Pedido p : pedidos){
                text.append("Pedido NR:  ")
                     .append(p.getId())
                     .append(" | ")
                     .append(p.getNome())
                     .append(" - R$ ")
                     .append(String.format("%.2f", p.getTotal()))
                     .append(" | Status: ")
                     .append(p.getStatus())
                     .append(" | Nota: ")
                     .append(p.getNota())
                     .append ("\n");
            }
            
            fim.getTxtFinalizados().setText(text.toString());
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, 
            "Erro ao mostrar pedidos finalizados" + e.getMessage());
        }
    }
}
