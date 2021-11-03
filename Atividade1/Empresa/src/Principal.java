/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author raulm
 */

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private static String salario;
    private static String nome;
    private static String aumento;
    
    Empregado emp = new Empregado();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title_lbl = new javax.swing.JLabel();
        nome_lbl = new javax.swing.JLabel();
        salario_lbl = new javax.swing.JLabel();
        servico_lbl = new javax.swing.JLabel();
        umAno_rbtn = new javax.swing.JRadioButton();
        doisAnos_rbtn = new javax.swing.JRadioButton();
        cinco_rbtn = new javax.swing.JRadioButton();
        novoEp_btn = new javax.swing.JButton();
        insDados_btn = new javax.swing.JButton();
        impDados_btn = new javax.swing.JButton();
        nome_txt = new javax.swing.JTextField();
        salario_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title_lbl.setText("Calculadora de Salário");

        nome_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome_lbl.setText("Nome:");

        salario_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salario_lbl.setText("Salário:");

        servico_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        servico_lbl.setText("Tempo de Serviço:");

        buttonGroup1.add(umAno_rbtn);
        umAno_rbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        umAno_rbtn.setText("1 Ano");
        umAno_rbtn.setEnabled(false);
        umAno_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umAno_rbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(doisAnos_rbtn);
        doisAnos_rbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doisAnos_rbtn.setText("2 a 5 Anos");
        doisAnos_rbtn.setEnabled(false);
        doisAnos_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisAnos_rbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(cinco_rbtn);
        cinco_rbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cinco_rbtn.setText("Mais de 5 Anos");
        cinco_rbtn.setEnabled(false);
        cinco_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco_rbtnActionPerformed(evt);
            }
        });

        novoEp_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        novoEp_btn.setText("Novo Empregado");
        novoEp_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoEp_btnMouseClicked(evt);
            }
        });
        novoEp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoEp_btnActionPerformed(evt);
            }
        });

        insDados_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        insDados_btn.setText("Inserir Dados");
        insDados_btn.setEnabled(false);
        insDados_btn.setMaximumSize(new java.awt.Dimension(103, 33));
        insDados_btn.setMinimumSize(new java.awt.Dimension(103, 33));
        insDados_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insDados_btnActionPerformed(evt);
            }
        });

        impDados_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impDados_btn.setText("Imprimir Dados");
        impDados_btn.setEnabled(false);
        impDados_btn.setMaximumSize(new java.awt.Dimension(103, 33));
        impDados_btn.setMinimumSize(new java.awt.Dimension(103, 33));
        impDados_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impDados_btnActionPerformed(evt);
            }
        });

        nome_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nome_txt.setEnabled(false);
        nome_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_txtActionPerformed(evt);
            }
        });

        salario_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salario_txt.setEnabled(false);
        salario_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salario_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(servico_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(umAno_rbtn)
                        .addGap(18, 18, 18)
                        .addComponent(doisAnos_rbtn)
                        .addGap(18, 18, 18)
                        .addComponent(cinco_rbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(salario_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nome_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(title_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(novoEp_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insDados_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(impDados_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_lbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_lbl)
                    .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salario_lbl)
                    .addComponent(salario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(servico_lbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umAno_rbtn)
                    .addComponent(doisAnos_rbtn)
                    .addComponent(cinco_rbtn))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(impDados_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(insDados_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoEp_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salario_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salario_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salario_txtActionPerformed

    private void novoEp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoEp_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoEp_btnActionPerformed

    private void umAno_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umAno_rbtnActionPerformed
        // TODO add your handling code here:
        umAno_rbtn.setActionCommand("1.025");
        
    }//GEN-LAST:event_umAno_rbtnActionPerformed

    private void doisAnos_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisAnos_rbtnActionPerformed
        // TODO add your handling code here:
        doisAnos_rbtn.setActionCommand("1.05");
        
    }//GEN-LAST:event_doisAnos_rbtnActionPerformed

    private void cinco_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco_rbtnActionPerformed
        // TODO add your handling code here:
        cinco_rbtn.setActionCommand("1.075"); 
    }//GEN-LAST:event_cinco_rbtnActionPerformed

    private void nome_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_txtActionPerformed

    private void insDados_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insDados_btnActionPerformed
        // TODO add your handling code here:
        emp.setNome(nome_txt.getText());
        emp.setSalario(Double.valueOf(salario_txt.getText()));
        emp.setAumento(Double.valueOf(buttonGroup1.getSelection().getActionCommand()));
        nome_txt.setText("");
        salario_txt.setText("");
        buttonGroup1.clearSelection();
        insDados_btn.setEnabled(false);
        impDados_btn.setEnabled(true);
    }//GEN-LAST:event_insDados_btnActionPerformed

    private void impDados_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impDados_btnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Quer imprimir os dados?");
        JOptionPane.showMessageDialog(rootPane, emp.getNome(), "Nome", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(rootPane, emp.getSalario(), "Salário com Aumento", JOptionPane.PLAIN_MESSAGE);
        //nome_txt.setText(emp.getNome());
        double a =  emp.getAumento();
        //salario_lbl.setText("Salario com Aumento:");
        //salario_txt.setText(Double.toString(emp.getSalario()));
        if(a == 1.075){
            //cinco_rbtn.setSelected(true);
            JOptionPane.showMessageDialog(rootPane, "Mais de 5 Anos", "Tempo de serviço", JOptionPane.PLAIN_MESSAGE);
        }
        if(a == 1.025){
            //umAno_rbtn.setSelected(true);
            JOptionPane.showMessageDialog(rootPane, "1 Ano", "Tempo de serviço", JOptionPane.PLAIN_MESSAGE);
        }
        if(a == 1.05){
            //doisAnos_rbtn.setSelected(true);
            JOptionPane.showMessageDialog(rootPane, "2 a 5 Anos", "Tempo de serviço", JOptionPane.PLAIN_MESSAGE);
        }
        impDados_btn.setEnabled(false);
    }//GEN-LAST:event_impDados_btnActionPerformed

    private void novoEp_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoEp_btnMouseClicked
        // TODO add your handling code here:
        salario_lbl.setText("Salário:");
        nome_txt.setEnabled(true);
        salario_txt.setEnabled(true);
        umAno_rbtn.setEnabled(true);
        doisAnos_rbtn.setEnabled(true);
        cinco_rbtn.setEnabled(true);
        insDados_btn.setEnabled(true);
        nome_txt.setText("");
        salario_txt.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_novoEp_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cinco_rbtn;
    private javax.swing.JRadioButton doisAnos_rbtn;
    private javax.swing.JButton impDados_btn;
    private javax.swing.JButton insDados_btn;
    private javax.swing.JLabel nome_lbl;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JButton novoEp_btn;
    private javax.swing.JLabel salario_lbl;
    private javax.swing.JTextField salario_txt;
    private javax.swing.JLabel servico_lbl;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JRadioButton umAno_rbtn;
    // End of variables declaration//GEN-END:variables
}