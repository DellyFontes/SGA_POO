/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eleicoesjava.View;

import java.awt.CardLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        configurarCardLayout();
//        configurarBotoes();
    }

    public void setMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public void mostrarTela(String nomeTela) {
        cardLayout.show(MAIN, nomeTela);
    }

    private void configurarCardLayout() {
        cardLayout = (CardLayout) MAIN.getLayout();

        // Criar e adicionar os painéis ao CardLayout
        JanelaEleitor janelaEleitor = new JanelaEleitor();
        tabelaEleitor tbEleitor = new tabelaEleitor();
        JanelaFuncionario janelaFuncionario = new JanelaFuncionario();
        // JanelaCandidato janelaCandidato = new JanelaCandidato();

        // JanelaPartido janelaPartido = new JanelaPartido();
        // Adicionar o painel de eleitores ao MAIN
        MAIN.add(janelaEleitor.getContentPanel(), "CardEleitores");
        MAIN.add(tbEleitor.getContentPanel(), "CardTbEleitor");
        MAIN.add(janelaFuncionario.getContentPanel(), "CardJanelaFuncionario");
        //  MAIN.add(janelaCandidato.getContentPanel(), "CardEleitores");

//        MAIN.add(JanelaPartido.getContentPanel(), "CardEleitores");
        janelaEleitor.setMenuPrincipal(this);
        janelaFuncionario.setMenuPrincipal(this);
        tbEleitor.setMenuPrincipal(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN = new javax.swing.JPanel();
        MENU_PRINCIPAL = new javax.swing.JPanel();
        btnCandidatos = new javax.swing.JButton();
        btnEleitores = new javax.swing.JButton();
        btnVotacoes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnPartidos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MAIN.setBackground(new java.awt.Color(170, 108, 58));
        MAIN.setMinimumSize(new java.awt.Dimension(927, 600));
        MAIN.setLayout(new java.awt.CardLayout());

        MENU_PRINCIPAL.setBackground(new java.awt.Color(170, 108, 58));
        MENU_PRINCIPAL.setMinimumSize(new java.awt.Dimension(927, 600));

        btnCandidatos.setBackground(new java.awt.Color(170, 108, 58));
        btnCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/candidatos.png"))); // NOI18N
        btnCandidatos.setBorderPainted(false);
        btnCandidatos.setContentAreaFilled(false);
        btnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosActionPerformed(evt);
            }
        });

        btnEleitores.setBackground(new java.awt.Color(170, 108, 58));
        btnEleitores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eleitores.png"))); // NOI18N
        btnEleitores.setToolTipText("");
        btnEleitores.setBorderPainted(false);
        btnEleitores.setContentAreaFilled(false);
        btnEleitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleitoresActionPerformed(evt);
            }
        });

        btnVotacoes.setBackground(new java.awt.Color(170, 108, 58));
        btnVotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/votar3.png"))); // NOI18N
        btnVotacoes.setBorderPainted(false);
        btnVotacoes.setContentAreaFilled(false);
        btnVotacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotacoesActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(170, 108, 58));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair2.png"))); // NOI18N
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(170, 108, 58));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        btnRelatorios.setBorderPainted(false);
        btnRelatorios.setContentAreaFilled(false);
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnPartidos.setBackground(new java.awt.Color(170, 108, 58));
        btnPartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/partido.png"))); // NOI18N
        btnPartidos.setBorderPainted(false);
        btnPartidos.setContentAreaFilled(false);
        btnPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MENU PRINCIPAL");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Candidatos");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eleitores");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Partidos");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Votações");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Relatorios");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Funcionarios");

        btnFuncionarios.setBackground(new java.awt.Color(170, 108, 58));
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        btnFuncionarios.setBorderPainted(false);
        btnFuncionarios.setContentAreaFilled(false);
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_PRINCIPALLayout = new javax.swing.GroupLayout(MENU_PRINCIPAL);
        MENU_PRINCIPAL.setLayout(MENU_PRINCIPALLayout);
        MENU_PRINCIPALLayout.setHorizontalGroup(
            MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_PRINCIPALLayout.createSequentialGroup()
                .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9))
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                            .addComponent(btnEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(btnPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                            .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel5)))
                            .addGap(124, 124, 124)
                            .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_PRINCIPALLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(14, 14, 14))
                                .addComponent(btnRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4))
                .addGap(74, 74, 74))
        );
        MENU_PRINCIPALLayout.setVerticalGroup(
            MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_PRINCIPALLayout.createSequentialGroup()
                .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4))
                            .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCandidatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MENU_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_PRINCIPALLayout.createSequentialGroup()
                                .addComponent(btnVotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_PRINCIPALLayout.createSequentialGroup()
                                .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(MENU_PRINCIPALLayout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addComponent(btnPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        MAIN.add(MENU_PRINCIPAL, "CardMain");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        // TODO add your handling code here:
        mostrarTela("CardCadastroEleitor");
        // new tabelaCandidatos().setVisible(true);
    }//GEN-LAST:event_btnCandidatosActionPerformed

    private void btnEleitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleitoresActionPerformed
        // TODO add your handling code here:
        mostrarTela("CardEleitores");
        //  new tabelaEleitor().setVisible(true);
    }//GEN-LAST:event_btnEleitoresActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnVotacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVotacoesActionPerformed

    private void btnPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidosActionPerformed
        new tabelaEleitor().setVisible(0 == 0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidosActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        // TODO add your handling code here:
        mostrarTela("CardJanelaFuncionario");
    }//GEN-LAST:event_btnFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public JPanel getContentPanel() {
        return MAIN; // Retorna o JPanel que contém o CardLayout
    }

    private CardLayout cardLayout;
    private MenuPrincipal menuPrincipal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN;
    private javax.swing.JPanel MENU_PRINCIPAL;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnEleitores;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnPartidos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVotacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
