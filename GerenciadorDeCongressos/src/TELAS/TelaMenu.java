 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import javax.swing.JOptionPane;
import VO.ProxyMenu;

/**
 *
 * @author lennon
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    
    private String funcao;
    public static TelaMenu instancia;
    
    protected TelaMenu() {
        initComponents();
    }
    
    public static TelaMenu getInstancia() {
        if (instancia == null)
            instancia = new TelaMenu();
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

        lblTitle = new javax.swing.JLabel();
        lblSlogan = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnPatrocinadores = new javax.swing.JButton();
        btnConvites = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnJulgar = new javax.swing.JButton();
        btnPublicacoes = new javax.swing.JButton();
        btnSessoes = new javax.swing.JButton();
        btnArtigos = new javax.swing.JButton();
        btnEditoras = new javax.swing.JButton();
        btnPessoas = new javax.swing.JButton();
        btnCongressos = new javax.swing.JButton();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IFIP Congressos //Menu de Opções");
        setMinimumSize(new java.awt.Dimension(680, 410));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("IFIP Congressos.");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 20, 210, 29);

        lblSlogan.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        lblSlogan.setForeground(new java.awt.Color(255, 102, 0));
        lblSlogan.setText("Publicando conhecimento!");
        getContentPane().add(lblSlogan);
        lblSlogan.setBounds(240, 20, 240, 28);

        btnUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/user32.png"))); // NOI18N
        btnUser.setText("Gerenciar Usuários");
        btnUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser);
        btnUser.setBounds(330, 280, 200, 40);

        btnSair.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/outro32.png"))); // NOI18N
        btnSair.setText("Alterar Usuário");
        btnSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(490, 20, 150, 20);

        btnPatrocinadores.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnPatrocinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/cartao32.png"))); // NOI18N
        btnPatrocinadores.setText("Gerenciar Patrocinadores");
        btnPatrocinadores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPatrocinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatrocinadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatrocinadores);
        btnPatrocinadores.setBounds(20, 210, 200, 40);

        btnConvites.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnConvites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/email32.png"))); // NOI18N
        btnConvites.setText("Enviar Convites");
        btnConvites.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnConvites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvitesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvites);
        btnConvites.setBounds(120, 280, 200, 40);

        btnFinanceiro.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/dinheiro32.png"))); // NOI18N
        btnFinanceiro.setText("Controle Financeiro");
        btnFinanceiro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(440, 210, 200, 40);

        btnJulgar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnJulgar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/julgar32.png"))); // NOI18N
        btnJulgar.setText("Julgar Artigos");
        btnJulgar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnJulgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJulgarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJulgar);
        btnJulgar.setBounds(230, 140, 200, 40);

        btnPublicacoes.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnPublicacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/jornal32.png"))); // NOI18N
        btnPublicacoes.setText("Gerenciar Publicações");
        btnPublicacoes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPublicacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicacoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPublicacoes);
        btnPublicacoes.setBounds(230, 210, 200, 40);

        btnSessoes.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnSessoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/sessoes32.png"))); // NOI18N
        btnSessoes.setText("Gerenciar Sessões");
        btnSessoes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSessoes);
        btnSessoes.setBounds(440, 140, 200, 40);

        btnArtigos.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnArtigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/artigo32.png"))); // NOI18N
        btnArtigos.setText("Submissão de Artigos");
        btnArtigos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnArtigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtigosActionPerformed(evt);
            }
        });
        getContentPane().add(btnArtigos);
        btnArtigos.setBounds(20, 140, 200, 40);

        btnEditoras.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/editora32.png"))); // NOI18N
        btnEditoras.setText("Gerenciar Editoras");
        btnEditoras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditoras);
        btnEditoras.setBounds(230, 70, 200, 40);

        btnPessoas.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/user32.png"))); // NOI18N
        btnPessoas.setText("Gerenciar Pessoas");
        btnPessoas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPessoas);
        btnPessoas.setBounds(440, 70, 200, 40);

        btnCongressos.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCongressos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/congressos32.png"))); // NOI18N
        btnCongressos.setText("Gerenciar Congressos");
        btnCongressos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCongressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongressosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCongressos);
        btnCongressos.setBounds(20, 70, 200, 40);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongressosActionPerformed
        // TODO add your handling code here:
        TelaCongresso Congresso = TelaCongresso.getInstancia();
        Congresso.setVisible(true);
    }//GEN-LAST:event_btnCongressosActionPerformed

    private void btnPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoasActionPerformed
        // TODO add your handling code here:
        TelaPessoas Pessoas = TelaPessoas.getInstancia();
        Pessoas.setVisible(true);
    }//GEN-LAST:event_btnPessoasActionPerformed

    private void btnEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorasActionPerformed
        // TODO add your handling code here:
        TelaEditoras Editoras = TelaEditoras.getInstancia();
        Editoras.setVisible(true);
    }//GEN-LAST:event_btnEditorasActionPerformed

    private void btnArtigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtigosActionPerformed
        // TODO add your handling code here:
        TelaSubmeterArtigo Artigos = TelaSubmeterArtigo.getInstancia();
        Artigos.setVisible(true);
    }//GEN-LAST:event_btnArtigosActionPerformed

    private void btnSessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessoesActionPerformed
        // TODO add your handling code here:
        TelaSessoes Sessoes = TelaSessoes.getInstancia();
        Sessoes.setVisible(true);
    }//GEN-LAST:event_btnSessoesActionPerformed

    private void btnPublicacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicacoesActionPerformed
        // TODO add your handling code here:
        TelaPublicacoes Publicacoes = TelaPublicacoes.getInstancia();
        Publicacoes.setVisible(true);
    }//GEN-LAST:event_btnPublicacoesActionPerformed

    private void btnJulgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJulgarActionPerformed
        // TODO add your handling code here:
        TelaJulgarArtigo JulgarArtigo = TelaJulgarArtigo.getInstancia();
        JulgarArtigo.setVisible(true);
    }//GEN-LAST:event_btnJulgarActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        // TODO add your handling code here:
        TelaControleFinanceiro Financas = TelaControleFinanceiro.getInstancia();
        Financas.setVisible(true);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnConvitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvitesActionPerformed
        // TODO add your handling code here:
        TelaEnviarConvites Convites = TelaEnviarConvites.getInstancia();
        Convites.setVisible(true);
    }//GEN-LAST:event_btnConvitesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Até logo!");
        this.setVisible(false);
        TelaLogin Login = TelaLogin.getInstancia();
        Login.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPatrocinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatrocinadoresActionPerformed
        // TODO add your handling code here:
        TelaPatrocinadores Patrocinadores = TelaPatrocinadores.getInstancia();
        Patrocinadores.setVisible(true);
    }//GEN-LAST:event_btnPatrocinadoresActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        TelaUsuarios Usuarios = TelaUsuarios.getInstancia();
        Usuarios.setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
//        TelaMenuProxy tela = TelaMenuProxy.getInstancia();
//        System.out.println("fora: " + getFuncao());
//        tela.qualPermissao(getFuncao());
        
        if (getFuncao().equals("Comite de Programa")){
            btnCongressos.setEnabled(true);
            btnEditoras.setEnabled(true);
            btnPessoas.setEnabled(true);
            btnArtigos.setEnabled(true);
            btnJulgar.setEnabled(true);
            btnSessoes.setEnabled(true);
            btnPatrocinadores.setEnabled(false);
            btnPublicacoes.setEnabled(true);
            btnFinanceiro.setEnabled(false);
            btnConvites.setEnabled(false);
            btnUser.setEnabled(false);
            btnSair.setEnabled(true);
        }
        else if (getFuncao().equals("Comite Organizador")){
            btnCongressos.setEnabled(false);
            btnEditoras.setEnabled(false);
            btnPessoas.setEnabled(true);
            btnArtigos.setEnabled(false);
            btnJulgar.setEnabled(false);
            btnSessoes.setEnabled(false);
            btnPatrocinadores.setEnabled(true);
            btnPublicacoes.setEnabled(false);
            btnFinanceiro.setEnabled(true);
            btnConvites.setEnabled(true);
            btnUser.setEnabled(false);
            btnSair.setEnabled(true);
        }
        else if (getFuncao().equals("admin")){
            btnCongressos.setEnabled(true);
            btnEditoras.setEnabled(true);
            btnPessoas.setEnabled(true);
            btnArtigos.setEnabled(true);
            btnJulgar.setEnabled(true);
            btnSessoes.setEnabled(true);
            btnPatrocinadores.setEnabled(true);
            btnPublicacoes.setEnabled(true);
            btnFinanceiro.setEnabled(true);
            btnConvites.setEnabled(true);
            btnUser.setEnabled(true);
            btnSair.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated
    
    public void setBtnArtigos(boolean set){
    	this.btnArtigos.setEnabled(set);
    }
    
	public void setBtnCongressos(boolean set) {
		this.btnCongressos.setEnabled(set);
	}
	public javax.swing.JButton getBtnConvites() {
		return btnConvites;
	}
	public void setBtnConvites(boolean set) {
		this.btnConvites.setEnabled(set);
	}
	public javax.swing.JButton getBtnEditoras(boolean set) {
		return btnEditoras;
	}
	public void setBtnEditoras(boolean set) {
		this.btnEditoras.setEnabled(set);
	}
	public javax.swing.JButton getBtnFinanceiro() {
		return btnFinanceiro;
	}
	public void setBtnFinanceiro(boolean set) {
		this.btnFinanceiro.setEnabled(set);
	}
	public javax.swing.JButton getBtnJulgar() {
		return btnJulgar;
	}
	public void setBtnJulgar(boolean set) {
		this.btnJulgar.setEnabled(set);
	}
	public javax.swing.JButton getBtnPatrocinadores() {
		return btnPatrocinadores;
	}
	public void setBtnPatrocinadores(boolean set) {
		this.btnPatrocinadores.setEnabled(set);
	}
	public javax.swing.JButton getBtnPessoas() {
		return btnPessoas;
	}
	public void setBtnPessoas(boolean set) {
		this.btnPessoas.setEnabled(set);
	}
	public javax.swing.JButton getBtnPublicacoes() {
		return btnPublicacoes;
	}
	public void setBtnPublicacoes(boolean set) {
		this.btnPublicacoes.setEnabled(set);
	}
	public javax.swing.JButton getBtnSair() {
		return btnSair;
	}
	public void setBtnSair(boolean set) {
		this.btnSair.setEnabled(set);
	}
	public javax.swing.JButton getBtnSessoes() {
		return btnSessoes;
	}
	public void setBtnSessoes(boolean set) {
		this.btnSessoes.setEnabled(set);
	}
	public javax.swing.JButton getBtnUser() {
		return btnUser;
	}
	public void setBtnUser(boolean set) {
		this.btnUser.setEnabled(set);
	}
	public javax.swing.JLabel getImgFundo() {
		return imgFundo;
	}
	public void setImgFundo(javax.swing.JLabel imgFundo) {
		this.imgFundo = imgFundo;
	}
	public javax.swing.JLabel getLblSlogan() {
		return lblSlogan;
	}
	public void setLblSlogan(javax.swing.JLabel lblSlogan) {
		this.lblSlogan = lblSlogan;
	}
	public javax.swing.JLabel getLblTitle() {
		return lblTitle;
	}
	public void setLblTitle(javax.swing.JLabel lblTitle) {
		this.lblTitle = lblTitle;
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtigos;
    private javax.swing.JButton btnCongressos;
    private javax.swing.JButton btnConvites;
    private javax.swing.JButton btnEditoras;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnJulgar;
    private javax.swing.JButton btnPatrocinadores;
    private javax.swing.JButton btnPessoas;
    private javax.swing.JButton btnPublicacoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSessoes;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblSlogan;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}