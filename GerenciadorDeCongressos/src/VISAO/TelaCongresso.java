/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VISAO;

import PRINCIPAL.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaCongresso extends javax.swing.JFrame {

    private static void DISPOSE_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int id = 0;
    public static TelaCongresso instancia;
    
    /**
     * Creates new form TelaCongresso
     */
    protected TelaCongresso() {
        initComponents();
    }
    
    public static TelaCongresso getInstancia() {
        if (instancia == null)
            instancia = new TelaCongresso();
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumParticipantes = new javax.swing.JLabel();
        txtNumParticipantes = new javax.swing.JTextField();
        lblImgBuscar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblEdicaoCongresso = new javax.swing.JLabel();
        txtEdicaoCongresso = new javax.swing.JTextField();
        lblFimCongresso = new javax.swing.JLabel();
        txtFimCongresso = new javax.swing.JFormattedTextField();
        lblPrazoAvaliacao = new javax.swing.JLabel();
        txtPrazoAvaliacao = new javax.swing.JFormattedTextField();
        txtPrazoSubmissao = new javax.swing.JFormattedTextField();
        lblPrazoSubmissao = new javax.swing.JLabel();
        lblInicioCongresso = new javax.swing.JLabel();
        txtInicioCongresso = new javax.swing.JFormattedTextField();
        txtValorInscricao = new javax.swing.JFormattedTextField();
        lblValorInscricao = new javax.swing.JLabel();
        txtPrazoInscricao = new javax.swing.JFormattedTextField();
        lblPrazoInscricao = new javax.swing.JLabel();
        txtEnderecoCongresso = new javax.swing.JTextField();
        lblEnderecoCongresso = new javax.swing.JLabel();
        txtTemaCongresso = new javax.swing.JTextField();
        lblTemaCongresso = new javax.swing.JLabel();
        txtNomeCongresso = new javax.swing.JTextField();
        lblNomeCongresso = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCNPJCongresso = new javax.swing.JLabel();
        txtCNPJCongresso = new javax.swing.JTextField();
        lblAreaCongresso = new javax.swing.JLabel();
        cbAreaCongresso = new javax.swing.JComboBox();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Sistema de Gerenciamento de Congressos");
        setMinimumSize(new java.awt.Dimension(670, 470));
        getContentPane().setLayout(null);

        lblNumParticipantes.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblNumParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblNumParticipantes.setText("Nº de Participantes:");
        getContentPane().add(lblNumParticipantes);
        lblNumParticipantes.setBounds(430, 160, 140, 17);

        txtNumParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumParticipantesActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumParticipantes);
        txtNumParticipantes.setBounds(570, 150, 50, 28);

        lblImgBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblImgBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblImgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/lupa32.png"))); // NOI18N
        lblImgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblImgBuscar);
        lblImgBuscar.setBounds(570, 0, 40, 40);

        lblBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 10)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(570, 40, 40, 13);

        lblEdicaoCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEdicaoCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblEdicaoCongresso.setText("Edição:");
        getContentPane().add(lblEdicaoCongresso);
        lblEdicaoCongresso.setBounds(470, 120, 60, 17);

        txtEdicaoCongresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicaoCongressoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEdicaoCongresso);
        txtEdicaoCongresso.setBounds(530, 110, 90, 28);

        lblFimCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblFimCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblFimCongresso.setText("Fim do Congresso:");
        getContentPane().add(lblFimCongresso);
        lblFimCongresso.setBounds(310, 320, 140, 17);

        txtFimCongresso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtFimCongresso);
        txtFimCongresso.setBounds(470, 310, 100, 28);

        lblPrazoAvaliacao.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblPrazoAvaliacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPrazoAvaliacao.setText("Prazo de Avaliação:");
        getContentPane().add(lblPrazoAvaliacao);
        lblPrazoAvaliacao.setBounds(20, 320, 150, 17);

        txtPrazoAvaliacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtPrazoAvaliacao);
        txtPrazoAvaliacao.setBounds(180, 310, 100, 28);

        txtPrazoSubmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtPrazoSubmissao);
        txtPrazoSubmissao.setBounds(180, 270, 100, 28);

        lblPrazoSubmissao.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblPrazoSubmissao.setForeground(new java.awt.Color(255, 255, 255));
        lblPrazoSubmissao.setText("Prazo de Submissão:");
        getContentPane().add(lblPrazoSubmissao);
        lblPrazoSubmissao.setBounds(20, 280, 160, 17);

        lblInicioCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblInicioCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioCongresso.setText("Início do Congresso:");
        getContentPane().add(lblInicioCongresso);
        lblInicioCongresso.setBounds(310, 280, 150, 17);

        txtInicioCongresso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtInicioCongresso);
        txtInicioCongresso.setBounds(470, 270, 100, 28);

        txtValorInscricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        getContentPane().add(txtValorInscricao);
        txtValorInscricao.setBounds(470, 230, 100, 28);

        lblValorInscricao.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblValorInscricao.setForeground(new java.awt.Color(255, 255, 255));
        lblValorInscricao.setText("Valor da Inscrição:");
        getContentPane().add(lblValorInscricao);
        lblValorInscricao.setBounds(310, 240, 140, 17);

        txtPrazoInscricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtPrazoInscricao);
        txtPrazoInscricao.setBounds(180, 230, 100, 28);

        lblPrazoInscricao.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblPrazoInscricao.setForeground(new java.awt.Color(255, 255, 255));
        lblPrazoInscricao.setText("Prazo de Inscrição:");
        getContentPane().add(lblPrazoInscricao);
        lblPrazoInscricao.setBounds(20, 240, 140, 17);

        txtEnderecoCongresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoCongressoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnderecoCongresso);
        txtEnderecoCongresso.setBounds(100, 190, 520, 28);

        lblEnderecoCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEnderecoCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoCongresso.setText("Endereço:");
        getContentPane().add(lblEnderecoCongresso);
        lblEnderecoCongresso.setBounds(20, 200, 80, 17);

        txtTemaCongresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemaCongressoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTemaCongresso);
        txtTemaCongresso.setBounds(100, 110, 360, 28);

        lblTemaCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblTemaCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblTemaCongresso.setText("Tema:");
        getContentPane().add(lblTemaCongresso);
        lblTemaCongresso.setBounds(20, 120, 50, 17);

        txtNomeCongresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCongressoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeCongresso);
        txtNomeCongresso.setBounds(100, 70, 360, 28);

        lblNomeCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblNomeCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCongresso.setText("Nome:");
        getContentPane().add(lblNomeCongresso);
        lblNomeCongresso.setBounds(20, 80, 50, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(280, 370, 100, 30);

        btnEditar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(390, 370, 100, 30);

        btnCadastrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(500, 370, 120, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Sistema de Gerenciamento de Congressos");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 510, 29);

        lblCNPJCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblCNPJCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJCongresso.setText("CNPJ:");
        getContentPane().add(lblCNPJCongresso);
        lblCNPJCongresso.setBounds(480, 80, 50, 17);

        txtCNPJCongresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJCongressoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCNPJCongresso);
        txtCNPJCongresso.setBounds(530, 70, 90, 28);

        lblAreaCongresso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblAreaCongresso.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaCongresso.setText("Área:");
        getContentPane().add(lblAreaCongresso);
        lblAreaCongresso.setBounds(20, 160, 50, 17);

        cbAreaCongresso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Foundations of Computer Science", "Software:Theory and Practice", "Education", "Information Technology ", "Communication Systems", "System Modeling and Optimization", "Information Systems", "ICT and Society", "Computer Systems Technology", "Security and Privacy Protection in Information Processing Systems", "Artificial Intelligence", "Human-Computer Interaction", "Entertainment Computing" }));
        getContentPane().add(cbAreaCongresso);
        cbAreaCongresso.setBounds(100, 150, 320, 28);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 690, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCongressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCongressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCongressoActionPerformed

    private void txtTemaCongressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemaCongressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemaCongressoActionPerformed

    private void txtEnderecoCongressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoCongressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoCongressoActionPerformed

    private void txtEdicaoCongressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdicaoCongressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdicaoCongressoActionPerformed

    private void txtCNPJCongressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJCongressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJCongressoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limparDados(){
        txtNomeCongresso.setText("");
        txtCNPJCongresso.setText("");
        txtTemaCongresso.setText("");
        txtEdicaoCongresso.setText("");
        //area
        txtNumParticipantes.setText("");
        txtEnderecoCongresso.setText("");
        txtNomeCongresso.setText("");
        txtPrazoInscricao.setText("");
        txtPrazoSubmissao.setText("");
        txtPrazoAvaliacao.setText("");
        txtValorInscricao.setText("");
        txtInicioCongresso.setText("");
        txtFimCongresso.setText("");
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        Conexao cx = Conexao.getInstancia();
        
        //JOptionPane.showMessageDialog(null, this.getId());
        
        try {
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO CONGRESSO "
                    + "(NOME, CNPJ, TEMA, EDICAO, AREA, NUMPARTICIPANTES, ENDERECO, DATAPRAZOINSCRICAO, "
                    + "DATAPRAZOSUBARTIGO, DATAPRAZOAVALIACAO, VALORINSCRICAO, DATAREALIZACAO, DATATERMINO) "
                    + "VALUES "
                    + "('" + txtNomeCongresso.getText() + "', "
                    + "'" + txtCNPJCongresso.getText() + "', "
                    + "'" + txtTemaCongresso.getText() + "', "
                    + "'" + txtEdicaoCongresso.getText() + "', "
                    + "'" + cbAreaCongresso.getSelectedItem() + "', "
                    + txtNumParticipantes.getText() + ", "
                    + "'" + txtEnderecoCongresso.getText() + "', "
                    + "'" + txtPrazoInscricao.getText() + "', "
                    + "'" + txtPrazoSubmissao.getText() + "', "
                    + "'" + txtPrazoAvaliacao.getText() + "', "
                    + "'" + txtValorInscricao.getText() + "', "
                    + "'" + txtInicioCongresso.getText() + "', "
                    + "'" + txtFimCongresso.getText()+ "')");
            cx.desconectar();
            
            JOptionPane.showMessageDialog(null, "Congresso cadastrado com sucesso!");
            
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        TelaBuscar Buscar = TelaBuscar.getInstancia();
        Buscar.setDefinirTela(1);
        Buscar.setVisible(true);
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        TelaBuscar Buscar = TelaBuscar.getInstancia();
        Buscar.setDefinirTela(1);
        Buscar.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtNumParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumParticipantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumParticipantesActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Conexao cx = Conexao.getInstancia();
        
        //JOptionPane.showMessageDialog(null, this.getId());
        
        try {
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE CONGRESSO SET "
                    + "NOME = '" + txtNomeCongresso.getText() + "', "
                    + "CNPJ = '" + txtCNPJCongresso.getText() + "', "
                    + "TEMA = '" + txtTemaCongresso.getText() + "', "
                    + "EDICAO = '" + txtEdicaoCongresso.getText() + "', "
                    + "AREA = '" + cbAreaCongresso.getSelectedItem() + "', "
                    + "NUMPARTICIPANTES = '" + txtNumParticipantes.getText() + "', "
                    + "ENDERECO = '" + txtEnderecoCongresso.getText() + "', "
                    + "DATAPRAZOINSCRICAO = '" + txtPrazoInscricao.getText() + "', "
                    + "DATAPRAZOSUBARTIGO = '" + txtPrazoSubmissao.getText() + "', "
                    + "DATAPRAZOAVALIACAO = '" + txtPrazoAvaliacao.getText() + "', "
                    + "VALORINSCRICAO = '" + txtValorInscricao.getText() + "', "
                    + "DATAREALIZACAO = '" + txtInicioCongresso.getText() + "', "
                    + "DATATERMINO = '" + txtFimCongresso.getText()+ "' "
                    + "WHERE IDCONGRESSO = " + getId());
            cx.desconectar();
            
            JOptionPane.showMessageDialog(null, "Congresso editado com sucesso!");
            
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    void preencheTela(int aux){
        if (aux == 1){
            
            Conexao cx = Conexao.getInstancia();
        
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM CONGRESSO WHERE IDCONGRESSO = " + getId());
                if (resultado.next()){
                    txtNomeCongresso.setText(resultado.getString("NOME"));
                    txtCNPJCongresso.setText(resultado.getString("CNPJ"));
                    txtTemaCongresso.setText(resultado.getString("TEMA"));
                    txtEdicaoCongresso.setText(resultado.getString("EDICAO"));
                    cbAreaCongresso.setSelectedItem(resultado.getString("AREA"));
                    txtNumParticipantes.setText(resultado.getString("NUMPARTICIPANTES"));
                    txtEnderecoCongresso.setText(resultado.getString("ENDERECO"));
                    txtPrazoInscricao.setText(resultado.getString("DATAPRAZOINSCRICAO"));
                    txtPrazoSubmissao.setText(resultado.getString("DATAPRAZOSUBARTIGO"));
                    txtPrazoAvaliacao.setText(resultado.getString("DATAPRAZOAVALIACAO"));
                    txtValorInscricao.setText(resultado.getString("VALORINSCRICAO"));
                    txtInicioCongresso.setText(resultado.getString("DATAREALIZACAO"));
                    txtFimCongresso.setText(resultado.getString("DATATERMINO"));
                }
                cx.desconectar();
            } catch (SQLException e){
                    JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
            }
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCongresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCongresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCongresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCongresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCongresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cbAreaCongresso;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblAreaCongresso;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCNPJCongresso;
    private javax.swing.JLabel lblEdicaoCongresso;
    private javax.swing.JLabel lblEnderecoCongresso;
    private javax.swing.JLabel lblFimCongresso;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblInicioCongresso;
    private javax.swing.JLabel lblNomeCongresso;
    private javax.swing.JLabel lblNumParticipantes;
    private javax.swing.JLabel lblPrazoAvaliacao;
    private javax.swing.JLabel lblPrazoInscricao;
    private javax.swing.JLabel lblPrazoSubmissao;
    private javax.swing.JLabel lblTemaCongresso;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValorInscricao;
    private javax.swing.JTextField txtCNPJCongresso;
    private javax.swing.JTextField txtEdicaoCongresso;
    private javax.swing.JTextField txtEnderecoCongresso;
    private javax.swing.JFormattedTextField txtFimCongresso;
    private javax.swing.JFormattedTextField txtInicioCongresso;
    private javax.swing.JTextField txtNomeCongresso;
    private javax.swing.JTextField txtNumParticipantes;
    private javax.swing.JFormattedTextField txtPrazoAvaliacao;
    private javax.swing.JFormattedTextField txtPrazoInscricao;
    private javax.swing.JFormattedTextField txtPrazoSubmissao;
    private javax.swing.JTextField txtTemaCongresso;
    private javax.swing.JFormattedTextField txtValorInscricao;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}