package eleicoesjava.View;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class JanelaCandidato extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCandidato
     */
    public JanelaCandidato() {
        initComponents();
        configurarCorDigitacaoTextoTodosCampos();
        cardLayout = (CardLayout) MAIN.getLayout(); 
    }
        
private void configurarCorDigitacaoTextoTodosCampos() {
    configurarCorRecursivo(getContentPane());
}

private void configurarCorRecursivo(java.awt.Container container) {
    for (java.awt.Component c : container.getComponents()) {
        if (c instanceof javax.swing.JTextField txt) {

            javax.swing.Timer t = new javax.swing.Timer(800, e -> {
                txt.setForeground(Color.BLACK);
                txt.setFont(new Font("Segoe UI Semibold",Font.PLAIN,15));// volta à cor normal ao parar
            });
            t.setRepeats(false);

            txt.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                @Override
                public void insertUpdate(javax.swing.event.DocumentEvent e) { aoDigitar(); }
                @Override
                public void removeUpdate(javax.swing.event.DocumentEvent e) { aoDigitar(); }
                @Override
                public void changedUpdate(javax.swing.event.DocumentEvent e) { aoDigitar(); }

                private void aoDigitar() {
                    txt.setForeground(new Color(24,100,90)); // cor do texto enquanto digita
                    txt.setFont(new Font("Rockwell",Font.PLAIN,15));
                    t.restart();
                }
            });

        } else if (c instanceof java.awt.Container childContainer) {
            // percorre dentro dos paineis e layouts
            configurarCorRecursivo(childContainer);
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN = new javax.swing.JPanel();
        CadastroEleitor = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBI = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcSigla = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblBI = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MAIN.setBackground(new java.awt.Color(170, 108, 58));
        MAIN.setLayout(new java.awt.CardLayout());

        CadastroEleitor.setBackground(new java.awt.Color(170, 108, 58));

        btVoltar.setBackground(new java.awt.Color(204, 152, 108));
        btVoltar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 153));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 152, 108));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 153));
        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtBI.setBackground(new java.awt.Color(255, 255, 153));
        txtBI.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtBI.setForeground(new java.awt.Color(0, 0, 0));
        txtBI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBIMouseEntered(evt);
            }
        });
        txtBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBIActionPerformed(evt);
            }
        });
        txtBI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBIKeyTyped(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(255, 255, 153));
        txtNome.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeMouseEntered(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Partido(Sigla)");

        jcSigla.setBackground(new java.awt.Color(255, 255, 153));
        jcSigla.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jcSigla.setForeground(new java.awt.Color(0, 0, 0));
        jcSigla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcSigla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcSiglaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcSiglaMouseEntered(evt);
            }
        });
        jcSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSiglaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("B.I");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Cadastro de Candidato");

        jButton4.setBackground(new java.awt.Color(204, 152, 108));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 153));
        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblBI.setFont(new java.awt.Font("Cambria", 2, 17)); // NOI18N
        lblBI.setForeground(new java.awt.Color(102, 255, 0));

        lblNome.setFont(new java.awt.Font("Cambria", 2, 17)); // NOI18N
        lblNome.setForeground(new java.awt.Color(102, 255, 0));

        lblPartido.setFont(new java.awt.Font("Cambria", 2, 17)); // NOI18N
        lblPartido.setForeground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout CadastroEleitorLayout = new javax.swing.GroupLayout(CadastroEleitor);
        CadastroEleitor.setLayout(CadastroEleitorLayout);
        CadastroEleitorLayout.setHorizontalGroup(
            CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroEleitorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(338, 338, 338))
            .addGroup(CadastroEleitorLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroEleitorLayout.createSequentialGroup()
                        .addGroup(CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcSigla, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroEleitorLayout.createSequentialGroup()
                                .addGroup(CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(322, 322, 322))
                    .addGroup(CadastroEleitorLayout.createSequentialGroup()
                        .addGroup(CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lblPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(CadastroEleitorLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroEleitorLayout.setVerticalGroup(
            CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroEleitorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(76, 76, 76)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(CadastroEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        MAIN.add(CadastroEleitor, "CardCandidatos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        if (menuPrincipal != null) {
            menuPrincipal.mostrarTela("CardMain");
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//       tabelaCandidatos tela = new tabelaCandidatos();
//       tela.setVisible(true);dispose();
menuPrincipal.mostrarTela("CardTbCandidatos");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBIActionPerformed

    private void jcSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSiglaActionPerformed

    }//GEN-LAST:event_jcSiglaActionPerformed

    private void txtBIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBIKeyTyped
        // TODO add your handling code here:
                  char c = evt.getKeyChar();
    
    // Só permite letras e números
    if (!Character.isLetterOrDigit(c)) {
        // Cancela a digitação do caractere inválido
        evt.consume();
        
        // Exibe mensagem de aviso no JLabel
        lblBI.setForeground(Color.red);
        lblBI.setText("Caractere inválido! ");
        
        // Limpa o aviso depois de 2 segundos
        new javax.swing.Timer(2000, e -> lblBI.setText("")).start();
    }
    }//GEN-LAST:event_txtBIKeyTyped

    private void txtBIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBIMouseEntered
        // TODO add your handling code here:
        lblBI.setText("BI do  candidato");
                new javax.swing.Timer(2000, e -> lblBI.setText("")).start();

    }//GEN-LAST:event_txtBIMouseEntered

    private void txtNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseEntered
        // TODO add your handling code here:
        lblNome.setText("Nome do Candidato");
                        new javax.swing.Timer(2000, e -> lblNome.setText("")).start();

    }//GEN-LAST:event_txtNomeMouseEntered

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
              // TODO add your handling code here:
         char c = evt.getKeyChar();
    
    // Só permite letras e espaços
    if (!Character.isLetter(c) && c != ' ') {
        // Cancela a digitação do caractere inválido
        evt.consume();
        
        // Exibe mensagem de aviso no JLabel
        lblNome.setForeground(Color.red);
        lblNome.setText("Caractere inválido! .");
        
        // Limpa o aviso depois de 2 segundos
        new javax.swing.Timer(2000, e -> lblNome.setText("")).start();
    }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void jcSiglaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcSiglaMouseClicked
        // TODO add your handling code here:
        lblPartido.setText("Escolha o partido representante");
                new javax.swing.Timer(3000, e -> lblPartido.setText("")).start();

    }//GEN-LAST:event_jcSiglaMouseClicked

    private void jcSiglaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcSiglaMouseEntered
        // TODO add your handling code here:
         lblPartido.setText("Escolha o partido representante");
                new javax.swing.Timer(3000, e -> lblPartido.setText("")).start();

    }//GEN-LAST:event_jcSiglaMouseEntered

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
            UIManager.setLookAndFeel( new FlatArcOrangeIJTheme());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Look and feel nao encontrado","Look and fell",1);
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCandidato().setVisible(true);
            }
        });
    }

    
     public JPanel getContentPanel() {
        return MAIN; // Retorna o JPanel que contém o CardLayout
    }
        
        public void setMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }
        
        public void setJanelaEleitor(JanelaCandidato janelaCandidato) {
        this.janelaCandidato = janelaCandidato;
    }


     public void mostrarTela(String nomeTela) {
        cardLayout.show(MAIN, nomeTela);
    }

        private CardLayout cardLayout;
     private   MenuPrincipal menuPrincipal;
     JanelaCandidato janelaCandidato;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroEleitor;
    private javax.swing.JPanel MAIN;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcSigla;
    private javax.swing.JLabel lblBI;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JTextField txtBI;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
