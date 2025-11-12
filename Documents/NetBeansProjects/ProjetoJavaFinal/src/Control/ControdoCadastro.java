/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Dao.Conexao;
import Dao.UsuariosDao;
import Model.Usuarios;
import View.Cadastrar;
import View.Login;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author AMD
 */
public class ControdoCadastro {
    private Cadastrar c;

    public ControdoCadastro(Cadastrar c) {
        this.c = c;
    }
    
    public void salvarCadastro(){
        String nome = c.getTxtNome().getText();
        String sobrenome = c.getTxtSobre().getText();
        String email = c.getTxtEmail().getText();
        String CPF = c.getTxtCpf().getText();
        String senha = c.getTxtSenha().getText();
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(email);
        System.out.println(CPF);
        System.out.println(senha);
        String genero = "";
        if(c.getRbuttonMas().isSelected()){
            genero = "Masculino";
        }
        else if(c.getRbuttonFem().isSelected()){
            genero = "Feminino";
        }
        else if(c.getRbuttonOutro().isSelected()){
            genero = "Prefiro não informar.";
        }
        
        Usuarios user = new Usuarios(nome, sobrenome, email, CPF, genero, senha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuariosDao usersDao = new UsuariosDao(conn);
            usersDao.Adicionar(user);
            JOptionPane.showMessageDialog(c, "Usuario Cadastrado!","Aviso", 
                                        JOptionPane.INFORMATION_MESSAGE);
             Login l;
             l = new Login();
             l.setVisible(true);
        }catch (SQLException ex) {
            ex.printStackTrace(); // Mostra o erro completo no console
            JOptionPane.showMessageDialog(c, 
                "Usuário não cadastrado!\nErro: " + ex.getMessage(),
                "Erro", 
        JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void AbrirLogin(){
        Login l;
        l = new Login();
        l.setVisible(true);
    }
    
    public void AbrirCadastroNovo(){
        c.setVisible(true);
    }
}
