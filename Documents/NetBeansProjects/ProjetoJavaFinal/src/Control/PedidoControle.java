/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Dao.Conexao;
import Model.Pedido;
import Dao.PedidoDao;
import Model.Alimento;
import Model.Bebida;
import Model.Comida;
import View.Carrinho;
import View.TelaComidas;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author AMD
 */
public class PedidoControle {
    private TelaComidas tl;

    public PedidoControle(TelaComidas tl) {
        this.tl = tl;
    }
    
    
    public void addCarrinho(TelaComidas tela){
        String cpfUsuario = tela.getCpfAtual();
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            PedidoDao pedido = new PedidoDao(conn);
            Alimento alimento = null;
            
            if(tela.getCbPizza().isSelected()){
                alimento = new Comida("Pizza", 45.00);
            }
            if (tela.getCbHamburguer().isSelected()) {
                alimento = new Comida("Hamburguer", 30.00);
            }

            if (tela.getCbTaco().isSelected()) {
                alimento = new Comida("Taco", 25.00);
            }

            if (tela.getCbFrango().isSelected()) {
               alimento = new Comida("Frango", 25.00);
            }
            
            if(tela.getCbCoxinha().isSelected()){
                alimento = new Comida ("Coxinha", 8.00);
            }
            
            if(tela.getCbBatata().isSelected()){
                alimento = new Comida ("Batata frita", 10.00);
            }
            
            if(tela.getCbPastel().isSelected()){
                alimento = new Comida ("Pastel", 12.00 );
            }
            
            if(tela.getCbKibe().isSelected()){
                alimento = new Comida ("Kibe", 8.00);
            }
            
            if(tela.getCbSuco().isSelected()){
                alimento = new Bebida(false, "Suco de Laranja", 8.00);
            }
            
            if(tela.getCbCoca().isSelected()){
                alimento = new Bebida(false, "Coca-Cola", 9.00);
            }
            
            if(tela.getCbCerveja().isSelected()){
                alimento = new Bebida(true, "Cerveja", 12.00);
            }
            
            if(tela.getCbCaipirinha().isSelected()){
                alimento = new Bebida(true, "Caipirinha", 14.00);
            }
            
            double preçoFinal;
            
            if (alimento instanceof Bebida bebida) {
                preçoFinal = bebida.getPreço() + bebida.calcularImpostoAlcool();
            } else {
                preçoFinal = alimento.getPreço();
            }

            
            Pedido pd = new Pedido(cpfUsuario, preçoFinal, 0, "Em andamento", alimento.getNome());
            pedido.Adicionar(pd);
         
            JOptionPane.showMessageDialog(tela, "Pedido registrado com sucesso!",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar no carrinho: " + e.getMessage());
        }
    }
}
