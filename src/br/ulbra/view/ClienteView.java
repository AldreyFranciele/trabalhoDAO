/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.controller.ClienteController;
import br.ulbra.model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno.saolucas
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    public ClienteView() {
        initComponents();
        controller =new ClienteController();
        this.setLocationRelativeTo(null);
        initTableModel();
        atualizarTabela();
        setBotoes(0);
    
        
    }
    

    public void setBotoes(int op) {
        switch (op) {
            case 1:
                btnSalvar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
             break;
            default:
                btnSalvar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

        }
    }

    
    
    
private void initTableModel(){
    javax.swing.table.DefaultTableModel model=new
        javax.swing.table.DefaultTableModel (
        new Object [][]{},
        new String []{"id","nome","email","telefone"}){
        @Override
                    public boolean isCellEditable(int row, int col){
                        return false;
                    }
                    };
    tblCliente.setModel(model);
                         
                }
private ClienteController controller;
private void atualizarTabela(){
    try{
        DefaultTableModel modelTbl=(DefaultTableModel) tblCliente.getModel();
        modelTbl.setRowCount(0);
        List<Cliente> Lista=controller.listar();
        for(Cliente c:Lista){
            modelTbl.addRow(new Object[]{c.getId(),
                c.getNome(),c.getEmail(),c.getTelefone()});
        }} catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"ERRO AO LISTAR:"+ex.getMessage()); 
                
            }
        }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        tblTabela = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("CADASTRO DE CLIENTE");

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("NOME:");

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("CODIGO:");

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("EMAIL:");

        txtTelefone.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("TELEFONE:");

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 255, 0));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(204, 255, 51));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tblCliente.setBackground(new java.awt.Color(204, 204, 204));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTabela.setViewportView(tblCliente);

        btnListar.setBackground(new java.awt.Color(0, 204, 204));
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tblTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(42, 42, 42)
                        .addComponent(btnAlterar)
                        .addGap(32, 32, 32)
                        .addComponent(btnExcluir)
                        .addGap(31, 31, 31)
                        .addComponent(btnLimpar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(228, 228, 228)
                            .addComponent(jLabel8))
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnAlterar))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListar)
                    .addComponent(tblTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText().trim();
            String email = txtEmail.getText().trim();
            String tel = txtTelefone.getText().trim();
            Cliente c = new Cliente(id, nome, email, tel);
            controller.atualizar(c);
            javax.swing.JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
            atualizarTabela();
            limparCampos();
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para atualizar");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + ex.getMessage());
        }   
    
                    

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            try {
            String nome = txtNome.getText().trim();
            String email = txtEmail.getText().trim();
            String tel = txtTelefone.getText().trim();
            if (nome.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nome é obrigatório");
                return;
            }
            Cliente c = new Cliente(0, nome, email, tel);
            controller.salvar(c);
            javax.swing.JOptionPane.showMessageDialog(this, "Salvo cliente (ID=" + c.getId() + ")");
            atualizarTabela();
            limparCampos();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar: " + ex.getMessage());

        

    }          
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       try {
            int id = Integer.parseInt(txtId.getText());
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Remover cliente ID " + id + "?", "Confirma", javax.swing.JOptionPane.YES_NO_OPTION);
            if (confirm != javax.swing.JOptionPane.YES_OPTION) {
                return;
            }
            controller.remover(id);
            javax.swing.JOptionPane.showMessageDialog(this, "Removido");
            atualizarTabela();
            limparCampos();
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para remover");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao remover: " + ex.getMessage());
        }

    
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
      
            
        atualizarTabela();
        setBotoes(0);
    }                  


private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {                                        
        int row = tblCliente.getSelectedRow();
        if (row>= 0) {
            txtId.setText(tblCliente.getValueAt(row, 0).toString());
            txtNome.setText(tblCliente.getValueAt(row, 1).toString());
            txtEmail.setText(tblCliente.getValueAt(row, 2) != null ? tblCliente.getValueAt(row, 2).toString() : "");
            txtTelefone.setText(tblCliente.getValueAt(row, 3) != null ? tblCliente.getValueAt(row, 3).toString() : "");
        }
        setBotoes(1);
    
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    public void limparCampos(){
        txtId.setText("null");
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tblCliente;
    private javax.swing.JScrollPane tblTabela;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
