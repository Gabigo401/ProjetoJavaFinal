/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Dao.Conexao;
import Dao.UsuariosDao;
import Model.Usuarios;
import View.Login;
import View.TelaComidas;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author AMD
 */
public class ContrododoLogin {
    private Login l;

    public ContrododoLogin(Login l) {
        this.l = l;
    }
    
    public void loginUsuario(){
        Usuarios user = new Usuarios(null, null, null,
                                     l.getTxtCpfLogin().getText(),
                                     l.getTxtEntraSen().getText(), null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuariosDao users = new UsuariosDao(conn);
            ResultSet res = users.consultas(user);
            if(res.next()){
                JOptionPane.showMessageDialog(l, "Login efetuado", "Aviso", 
                                                JOptionPane.INFORMATION_MESSAGE);
                String cpfAtual = res.getString("cpf");
                String senha = res.getString("senha");
                TelaComidas tc;
                tc = new TelaComidas(cpfAtual);
                tc.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(l, "Login não efetuado", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(l, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
}
