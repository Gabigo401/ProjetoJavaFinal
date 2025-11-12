/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.CarrinhoControle;
import Control.PedidoControle;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author unifgchoque
 */
public class TelaComidas extends javax.swing.JFrame {
    private String cpfAtual;
    /**
     * Creates new form TelaComidas
     * @param cpfUsuario
     */
    
    public TelaComidas(String cpfUsuario) {
        initComponents();
        tl = new PedidoControle(this);
        this.cpfAtual = cpfUsuario;
        
        System.out.println(cpfAtual);
    }

    public JLabel getLblBatataNome() {
        return lblBatataNome;
    }

    public JLabel getLblBatatapreço() {
        return lblBatatapreço;
    }

    public JLabel getLblCaipirinha() {
        return lblCaipirinha;
    }

    public JLabel getLblCaipirinhaPreço() {
        return lblCaipirinhaPreço;
    }

    public JLabel getLblCerveja() {
        return lblCerveja;
    }

    public JLabel getLblCervejaPreço() {
        return lblCervejaPreço;
    }

    public JLabel getLblCoca() {
        return lblCoca;
    }

    public JLabel getLblCocaPreço() {
        return lblCocaPreço;
    }

    public JLabel getLblCoxinhaNome() {
        return lblCoxinhaNome;
    }

    public JLabel getLblCoxinhaPreço() {
        return lblCoxinhaPreço;
    }

    public JLabel getLblFrangoNome() {
        return lblFrangoNome;
    }

    public JLabel getLblFrangoPreço() {
        return lblFrangoPreço;
    }

    public JLabel getLblHamburguerNome() {
        return lblHamburguerNome;
    }

    public JLabel getLblHamburguerPreço() {
        return lblHamburguerPreço;
    }

    public JLabel getLblKibeNome() {
        return lblKibeNome;
    }

    public JLabel getLblKibePreço() {
        return lblKibePreço;
    }

    public JLabel getLblPastelNome() {
        return lblPastelNome;
    }

    public JLabel getLblPastelPreço() {
        return lblPastelPreço;
    }

    public JLabel getLblPizzaNome() {
        return lblPizzaNome;
    }

    public JLabel getLblPizzaPreço() {
        return lblPizzaPreço;
    }

    public JLabel getLblSuco() {
        return lblSuco;
    }

    public JLabel getLblSucoPreço() {
        return lblSucoPreço;
    }

    public JLabel getLblTacoNome() {
        return lblTacoNome;
    }

    public JLabel getLblTacoPreço() {
        return lblTacoPreço;
    }

    public JCheckBox getCbCaipirinha() {
        return cbCaipirinha;
    }

    public void setCbCaipirinha(JCheckBox cbCaipirinha) {
        this.cbCaipirinha = cbCaipirinha;
    }

    public JCheckBox getCbCerveja() {
        return cbCerveja;
    }

    public void setCbCerveja(JCheckBox cbCerveja) {
        this.cbCerveja = cbCerveja;
    }

    public JCheckBox getCbCoca() {
        return cbCoca;
    }

    public void setCbCoca(JCheckBox cbCoca) {
        this.cbCoca = cbCoca;
    }

    public JCheckBox getCbSuco() {
        return cbSuco;
    }

    public void setCbSuco(JCheckBox cbSuco) {
        this.cbSuco = cbSuco;
    }

    public String getCpfAtual() {
        return cpfAtual;
    }

    public void setCpfAtual(String cpfAtual) {
        this.cpfAtual = cpfAtual;
    }

    
    public JCheckBox getCbBatata() {
        return cbBatata;
    }

    public void setCbBatata(JCheckBox cbBatata) {
        this.cbBatata = cbBatata;
    }

    public JCheckBox getCbCoxinha() {
        return cbCoxinha;
    }

    public void setCbCoxinha(JCheckBox cbCoxinha) {
        this.cbCoxinha = cbCoxinha;
    }

    public JCheckBox getCbFrango() {
        return cbFrango;
    }

    public void setCbFrango(JCheckBox cbFrango) {
        this.cbFrango = cbFrango;
    }

    public JCheckBox getCbHamburguer() {
        return cbHamburguer;
    }

    public void setCbHamburguer(JCheckBox cbHamburguer) {
        this.cbHamburguer = cbHamburguer;
    }

    public JCheckBox getCbKibe() {
        return cbKibe;
    }

    public void setCbKibe(JCheckBox cbKibe) {
        this.cbKibe = cbKibe;
    }

    public JCheckBox getCbPastel() {
        return cbPastel;
    }

    public void setCbPastel(JCheckBox cbPastel) {
        this.cbPastel = cbPastel;
    }

    public JCheckBox getCbPizza() {
        return cbPizza;
    }

    public void setCbPizza(JCheckBox cbPizza) {
        this.cbPizza = cbPizza;
    }

    public JCheckBox getCbTaco() {
        return cbTaco;
    }

    public void setCbTaco(JCheckBox cbTaco) {
        this.cbTaco = cbTaco;
    }

    public JButton getBtAdd() {
        return btAdd;
    }

    public void setBtAdd(JButton btAdd) {
        this.btAdd = btAdd;
    }

    public JButton getBtCarrinho() {
        return btCarrinho;
    }

    public void setBtCarrinho(JButton btCarrinho) {
        this.btCarrinho = btCarrinho;
    }

    public JButton getBtBuscar() {
        return btBuscar;
    }

    public void setBtBuscar(JButton btBuscar) {
        this.btBuscar = btBuscar;
    }

    public JTextField getTxtBusca() {
        return txtBusca;
    }

    public void setTxtBusca(JTextField txtBusca) {
        this.txtBusca = txtBusca;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblItens = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btCarrinho = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblPizzaNome = new javax.swing.JLabel();
        cbPizza = new javax.swing.JCheckBox();
        lblPizzaPreço = new javax.swing.JLabel();
        lblHamburguerNome = new javax.swing.JLabel();
        lblHamburguerPreço = new javax.swing.JLabel();
        cbHamburguer = new javax.swing.JCheckBox();
        lblTacoNome = new javax.swing.JLabel();
        lblTacoPreço = new javax.swing.JLabel();
        cbTaco = new javax.swing.JCheckBox();
        lblFrangoNome = new javax.swing.JLabel();
        lblFrangoPreço = new javax.swing.JLabel();
        cbFrango = new javax.swing.JCheckBox();
        lblBatataNome = new javax.swing.JLabel();
        lblBatatapreço = new javax.swing.JLabel();
        cbBatata = new javax.swing.JCheckBox();
        lblCoxinhaNome = new javax.swing.JLabel();
        lblCoxinhaPreço = new javax.swing.JLabel();
        cbCoxinha = new javax.swing.JCheckBox();
        lblPastelNome = new javax.swing.JLabel();
        lblPastelPreço = new javax.swing.JLabel();
        cbPastel = new javax.swing.JCheckBox();
        lblKibeNome = new javax.swing.JLabel();
        lblKibePreço = new javax.swing.JLabel();
        cbKibe = new javax.swing.JCheckBox();
        lblSuco = new javax.swing.JLabel();
        lblSucoPreço = new javax.swing.JLabel();
        lblCoca = new javax.swing.JLabel();
        lblCocaPreço = new javax.swing.JLabel();
        lblCerveja = new javax.swing.JLabel();
        lblCervejaPreço = new javax.swing.JLabel();
        lblCaipirinha = new javax.swing.JLabel();
        lblCaipirinhaPreço = new javax.swing.JLabel();
        cbSuco = new javax.swing.JCheckBox();
        cbCoca = new javax.swing.JCheckBox();
        cbCerveja = new javax.swing.JCheckBox();
        cbCaipirinha = new javax.swing.JCheckBox();
        txtBusca = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.marbour.eu/wp-content/uploads/fei-color.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        lblItens.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblItens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItens.setText("Comidas e Bebidas");

        btAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAdd.setText("Adicionar ao carrinho");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCarrinho.setText("Ver Carrinho");
        btCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarrinhoActionPerformed(evt);
            }
        });

        lblPizzaNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPizzaNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPizzaNome.setText(" Pizza");

        cbPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbPizza.setText("Adicionar");
        cbPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPizzaActionPerformed(evt);
            }
        });

        lblPizzaPreço.setText("R$ 45.00");

        lblHamburguerNome.setText("Hamburguer");

        lblHamburguerPreço.setText("R$ 30.00");

        cbHamburguer.setText("Adicionar");

        lblTacoNome.setText("Taco");

        lblTacoPreço.setText("R$ 25.00");

        cbTaco.setText("Adicionar");

        lblFrangoNome.setText("Frango");

        lblFrangoPreço.setText("R$ 25.00");

        cbFrango.setText("Adicionar");

        lblBatataNome.setText("Batata Fritas");

        lblBatatapreço.setText("R$ 10.00");

        cbBatata.setText("Adicionar");

        lblCoxinhaNome.setText("Coxinha");

        lblCoxinhaPreço.setText("R$ 8.00");

        cbCoxinha.setText("Adicionar");

        lblPastelNome.setText("Pastel");

        lblPastelPreço.setText("R$ 12.00");

        cbPastel.setText("Adicionar");

        lblKibeNome.setText("Kibe");

        lblKibePreço.setText("R$ 8.00");

        cbKibe.setText("Adicionar");

        lblSuco.setText("Suco");

        lblSucoPreço.setText("R$ 8.00");

        lblCoca.setText("Coca-Cola");

        lblCocaPreço.setText("R$ 9.00");

        lblCerveja.setText("Cerveja");

        lblCervejaPreço.setText("R$ 12.00");

        lblCaipirinha.setText("Caipirinha");

        lblCaipirinhaPreço.setText("R$ 14.00");

        cbSuco.setText("Adicionar");

        cbCoca.setText("Adicionar");

        cbCerveja.setText("Adicionar");

        cbCaipirinha.setText("Adicionar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbPizza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbHamburguer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPizzaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPizzaPreço))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblHamburguerPreço))
                            .addComponent(lblHamburguerNome))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTacoNome)
                            .addComponent(lblTacoPreço))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFrangoPreço, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFrangoNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTaco)
                                    .addComponent(cbPastel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCervejaPreço)
                                            .addComponent(lblCerveja))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbFrango)
                                            .addComponent(cbKibe))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblCaipirinhaPreço))
                                            .addComponent(lblCaipirinha))
                                        .addGap(17, 17, 17))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbCerveja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCaipirinha)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBatataNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblBatatapreço)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCoxinhaPreço)
                    .addComponent(lblCoxinhaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPastelPreço)
                    .addComponent(lblPastelNome))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKibeNome)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKibePreço)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbBatata))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSucoPreço)
                                    .addComponent(lblSuco))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cbCoxinha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCocaPreço))
                                    .addComponent(lblCoca)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbSuco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCoca)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPizzaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHamburguerNome)
                    .addComponent(lblTacoNome)
                    .addComponent(lblFrangoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPizzaPreço)
                    .addComponent(lblHamburguerPreço)
                    .addComponent(lblTacoPreço)
                    .addComponent(lblFrangoPreço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPizza)
                    .addComponent(cbHamburguer)
                    .addComponent(cbTaco)
                    .addComponent(cbFrango))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBatataNome)
                    .addComponent(lblCoxinhaNome)
                    .addComponent(lblPastelNome)
                    .addComponent(lblKibeNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBatatapreço)
                    .addComponent(lblCoxinhaPreço)
                    .addComponent(lblPastelPreço)
                    .addComponent(lblKibePreço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBatata)
                    .addComponent(cbCoxinha)
                    .addComponent(cbPastel)
                    .addComponent(cbKibe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuco)
                    .addComponent(lblCoca)
                    .addComponent(lblCerveja)
                    .addComponent(lblCaipirinha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucoPreço)
                    .addComponent(lblCocaPreço)
                    .addComponent(lblCervejaPreço)
                    .addComponent(lblCaipirinhaPreço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSuco)
                    .addComponent(cbCoca)
                    .addComponent(cbCerveja)
                    .addComponent(cbCaipirinha))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblItens, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd))
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblItens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addGap(212, 212, 212))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btAdd)
                .addGap(18, 18, 18)
                .addComponent(btCarrinho)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        PedidoControle controle = new PedidoControle(this);
        controle.addCarrinho(this);
    }//GEN-LAST:event_btAddActionPerformed

    private void btCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarrinhoActionPerformed
        // TODO add your handling code here:
        CarrinhoControle controle = new CarrinhoControle();
        controle.mostrarCarrinho(this);
    }//GEN-LAST:event_btCarrinhoActionPerformed

    private void cbPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPizzaActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        tl.BuscarComidas(this);
    }//GEN-LAST:event_btBuscarActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaComidas().setVisible(true);
//            }
//        });
//    }
    private PedidoControle tl;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCarrinho;
    private javax.swing.JCheckBox cbBatata;
    private javax.swing.JCheckBox cbCaipirinha;
    private javax.swing.JCheckBox cbCerveja;
    private javax.swing.JCheckBox cbCoca;
    private javax.swing.JCheckBox cbCoxinha;
    private javax.swing.JCheckBox cbFrango;
    private javax.swing.JCheckBox cbHamburguer;
    private javax.swing.JCheckBox cbKibe;
    private javax.swing.JCheckBox cbPastel;
    private javax.swing.JCheckBox cbPizza;
    private javax.swing.JCheckBox cbSuco;
    private javax.swing.JCheckBox cbTaco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBatataNome;
    private javax.swing.JLabel lblBatatapreço;
    private javax.swing.JLabel lblCaipirinha;
    private javax.swing.JLabel lblCaipirinhaPreço;
    private javax.swing.JLabel lblCerveja;
    private javax.swing.JLabel lblCervejaPreço;
    private javax.swing.JLabel lblCoca;
    private javax.swing.JLabel lblCocaPreço;
    private javax.swing.JLabel lblCoxinhaNome;
    private javax.swing.JLabel lblCoxinhaPreço;
    private javax.swing.JLabel lblFrangoNome;
    private javax.swing.JLabel lblFrangoPreço;
    private javax.swing.JLabel lblHamburguerNome;
    private javax.swing.JLabel lblHamburguerPreço;
    private javax.swing.JLabel lblItens;
    private javax.swing.JLabel lblKibeNome;
    private javax.swing.JLabel lblKibePreço;
    private javax.swing.JLabel lblPastelNome;
    private javax.swing.JLabel lblPastelPreço;
    private javax.swing.JLabel lblPizzaNome;
    private javax.swing.JLabel lblPizzaPreço;
    private javax.swing.JLabel lblSuco;
    private javax.swing.JLabel lblSucoPreço;
    private javax.swing.JLabel lblTacoNome;
    private javax.swing.JLabel lblTacoPreço;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
