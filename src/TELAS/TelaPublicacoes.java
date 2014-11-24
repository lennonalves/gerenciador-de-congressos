/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import RN.PublicacoesRN;
import VO.BuscaVO;
import VO.PublicacoesVO;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaPublicacoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaPublicacoes
     */
    
    public static TelaPublicacoes instancia;
    
    protected TelaPublicacoes() {
        initComponents();
    }

    public static TelaPublicacoes getInstancia() {
        if (instancia == null)
            instancia = new TelaPublicacoes();
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

        txtEditora = new javax.swing.JTextField();
        btnEditora = new javax.swing.JButton();
        btnTituloArtigo = new javax.swing.JButton();
        txtTituloArtigo = new javax.swing.JTextField();
        lblEditora = new javax.swing.JLabel();
        lblTituloArtigo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPublicar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Gerenciamento de Publicações");
        setMinimumSize(new java.awt.Dimension(663, 255));
        getContentPane().setLayout(null);

        txtEditora.setEnabled(false);
        getContentPane().add(txtEditora);
        txtEditora.setBounds(170, 110, 400, 28);

        btnEditora.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        btnEditora.setText("...");
        btnEditora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditora);
        btnEditora.setBounds(580, 110, 40, 30);

        btnTituloArtigo.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        btnTituloArtigo.setText("...");
        btnTituloArtigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTituloArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTituloArtigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTituloArtigo);
        btnTituloArtigo.setBounds(580, 70, 40, 30);

        txtTituloArtigo.setEnabled(false);
        getContentPane().add(txtTituloArtigo);
        txtTituloArtigo.setBounds(170, 70, 400, 28);

        lblEditora.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblEditora.setText("Editora:");
        getContentPane().add(lblEditora);
        lblEditora.setBounds(20, 110, 70, 20);

        lblTituloArtigo.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblTituloArtigo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloArtigo.setText("Título do Artigo:");
        getContentPane().add(lblTituloArtigo);
        lblTituloArtigo.setBounds(20, 70, 110, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(400, 160, 100, 30);

        btnPublicar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnPublicar.setText("PUBLICAR");
        btnPublicar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPublicar);
        btnPublicar.setBounds(520, 160, 100, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Gerenciamento de Publicações");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void preencheTela(int aux){
        
        if (aux == 1){
            
            PublicacoesVO pvo = PublicacoesVO.getInstancia();
            pvo.setTitulo(txtTituloArtigo.getText());
            pvo.setEditora(txtEditora.getText());
            
            PublicacoesRN prn = PublicacoesRN.getInstancia();
            prn.atualizaTitulo(pvo);
            
            txtTituloArtigo.setText(pvo.getTitulo());
            txtEditora.setText(pvo.getEditora());
            
        }
        
        if (aux == 2){
            
            PublicacoesVO pvo = PublicacoesVO.getInstancia();
            pvo.setTitulo(txtTituloArtigo.getText());
            pvo.setEditora(txtEditora.getText());
            
            PublicacoesRN prn = PublicacoesRN.getInstancia();
            prn.atualizaEditora(pvo);
            
            txtTituloArtigo.setText(pvo.getTitulo());
            txtEditora.setText(pvo.getEditora());
            
        }
    }
    
    private void btnTituloArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTituloArtigoActionPerformed
        // TODO add your handling code here:
        
        PublicacoesVO pvo = PublicacoesVO.getInstancia();
        pvo.setTitulo(txtTituloArtigo.getText());
        pvo.setEditora(txtEditora.getText());
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(9);
        
        this.setVisible(false);
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
        
    }//GEN-LAST:event_btnTituloArtigoActionPerformed

    private void btnEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraActionPerformed
        // TODO add your handling code here:
        
        PublicacoesVO pvo = PublicacoesVO.getInstancia();
        pvo.setTitulo(txtTituloArtigo.getText());
        pvo.setEditora(txtEditora.getText());
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(10);
        
        this.setVisible(false);
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
        
    }//GEN-LAST:event_btnEditoraActionPerformed

    void limparDados() {
        txtEditora.setText("");
        txtTituloArtigo.setText("");
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        // TODO add your handling code here:
        
        PublicacoesVO pvo = PublicacoesVO.getInstancia();
        pvo.setTitulo(txtTituloArtigo.getText());
        pvo.setEditora(txtEditora.getText());
        
        PublicacoesRN prn = PublicacoesRN.getInstancia();
        JOptionPane.showMessageDialog(null, prn.publicar(pvo));
        
        limparDados();
        
    }//GEN-LAST:event_btnPublicarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPublicacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPublicacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPublicacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPublicacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPublicacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditora;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JButton btnTituloArtigo;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTituloArtigo;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtTituloArtigo;
    // End of variables declaration//GEN-END:variables

}