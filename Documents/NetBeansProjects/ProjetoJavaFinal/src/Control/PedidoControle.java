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
    
    public void BuscarComidas(TelaComidas tela){
        String termo = tela.getTxtBusca().getText();
        termo = termo.toLowerCase();
        
        boolean pizzaVisivel = "pizza".contains(termo);
        tela.getCbPizza().setVisible(pizzaVisivel);
        tela.getLblPizzaNome().setVisible(pizzaVisivel);
        tela.getLblPizzaPreço().setVisible(pizzaVisivel);
        
        boolean hamburguerVisivel = "hamburguer".contains(termo);
        tela.getCbHamburguer().setVisible(hamburguerVisivel);
        tela.getLblHamburguerNome().setVisible(hamburguerVisivel);
        tela.getLblHamburguerPreço().setVisible(hamburguerVisivel);
        
        boolean tacoVisivel = "taco".contains(termo);
        tela.getCbTaco().setVisible(tacoVisivel);
        tela.getLblTacoNome().setVisible(tacoVisivel);
        tela.getLblTacoPreço().setVisible(tacoVisivel);
        
        boolean frangoVisivel = "frango".contains(termo);
        tela.getCbFrango().setVisible(frangoVisivel);
        tela.getLblFrangoNome().setVisible(frangoVisivel);
        tela.getLblFrangoPreço().setVisible(frangoVisivel);
        
        boolean batataVisivel = "batata-frita".contains(termo);
        tela.getCbBatata().setVisible(batataVisivel);
        tela.getLblBatataNome().setVisible(batataVisivel);
        tela.getLblBatatapreço().setVisible(batataVisivel);
        
        boolean coxinhaVisivel = "coxinha".contains(termo);
        tela.getCbCoxinha().setVisible(coxinhaVisivel);
        tela.getLblCoxinhaNome().setVisible(coxinhaVisivel);
        tela.getLblCoxinhaPreço().setVisible(coxinhaVisivel);
        
        boolean pastelVisible = "pastel".contains(termo);
        tela.getCbPastel().setVisible(pastelVisible);
        tela.getLblPastelNome().setVisible(pastelVisible);
        tela.getLblPastelPreço().setVisible(pastelVisible);
        
        boolean kibeVisivel = "kibe".contains(termo);
        tela.getCbKibe().setVisible(kibeVisivel);
        tela.getLblKibeNome().setVisible(kibeVisivel);
        tela.getLblKibePreço().setVisible(kibeVisivel);
        
        boolean sucoVisivel = "suco".contains(termo);
        tela.getCbSuco().setVisible(sucoVisivel);
        tela.getLblSuco().setVisible(sucoVisivel);
        tela.getLblSucoPreço().setVisible(sucoVisivel);
        
        boolean cocaVisivel = "coca-cola".contains(termo);
        tela.getCbCoca().setVisible(cocaVisivel);
        tela.getLblCoca().setVisible(cocaVisivel);
        tela.getLblCocaPreço().setVisible(cocaVisivel);
        
        boolean cervejaVisivel = "cerveja".contains(termo);
        tela.getCbCerveja().setVisible(cervejaVisivel);
        tela.getLblCerveja().setVisible(cervejaVisivel);
        tela.getLblCervejaPreço().setVisible(cervejaVisivel);
        
        boolean caipirinhaVisivel = "caipirinha".contains(termo);
        tela.getCbCaipirinha().setVisible(caipirinhaVisivel);
        tela.getLblCaipirinha().setVisible(caipirinhaVisivel);
        tela.getLblCaipirinhaPreço().setVisible(caipirinhaVisivel);
    }
}
