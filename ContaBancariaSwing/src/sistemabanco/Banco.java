package sistemabanco;

import java.awt.Color;
import java.util.ArrayList;

public class Banco extends javax.swing.JFrame {
    String entrada1;
    String entrada2;
    String entrada3;
    String entrada4;
    ArrayList<Cliente> todosOsClientes = new ArrayList<Cliente>();
    ArrayList<ContaBancaria> todasAsContas = new ArrayList<ContaBancaria>();
    Cliente cliente;
    ContaBancaria conta;
    int i;
    int tamanhoArray;
    int opcao;
    boolean validaCondicao;
    
    public Banco() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastro.setText("Cadastrar Cliente");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        jButton2.setText("Criar Conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deposito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Saque");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Extrato");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar Conta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Verificar Conta Cliente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Procurar Conta");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Listar Contas");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Contas Bancarias");
        jLabel1.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jButton11.setText("Limpar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setText("Confirmar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(campo1)
                            .addComponent(campo3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastro))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        //CADASTRAR CLIENTE
        resetLabel();
        resetCampo();
        
        opcao = 1;
        
        jTextArea1.setText("");
        jLabel2.setText("Nome: ");
        jLabel3.setText("Telefone: ");
        jLabel4.setText("Email: ");
    }//GEN-LAST:event_cadastroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //CRIAR CONTA
        resetLabel();
        resetCampo();
        
        opcao = 2;
        
        jTextArea1.setText("");
        jLabel2.setText("Titular: ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //DEPOSITO
        resetLabel();
        resetCampo();
        
        opcao = 3;
        
        jTextArea1.setText("");
        jLabel2.setText("Conta: ");
        jLabel3.setText("Valor: ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //SAQUE
        resetLabel();
        resetCampo();
        
        opcao = 4;
        
        jTextArea1.setText("");
        jLabel2.setText("Conta: ");
        jLabel3.setText("Valor: ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //EXTRATO
        resetLabel();
        resetCampo();
        
        opcao = 5;
        
        jTextArea1.setText("");
        jLabel2.setText("Conta: ");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //CANCELAR CONTA
        resetLabel();
        resetCampo();
        
        opcao = 6;
        
        jTextArea1.setText("");
        jLabel2.setText("Conta: ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //LISTAR CONTAS
        resetLabel();
        resetCampo();
        jTextArea1.setText("");
        
        tamanhoArray = todasAsContas.size();
        if (tamanhoArray > 0) {
            for (i = 0; i < tamanhoArray; i++) {
                entrada1 = jTextArea1.getText();
                jTextArea1.setText(entrada1 + "Titular: " + todasAsContas.get(i).getNome()
                                + "\nConta: " + todasAsContas.get(i).getNumero()
                                + "\nSaldo: " + todasAsContas.get(i).getSaldo()
                                + "\nStatus: " + todasAsContas.get(i).getAtiva() + "\n\n");
            }
        }
        else {
            jTextArea1.setText("Nenhuma conta cadastrada\n");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //VERIFICAR CONTA CLIENTE
        resetLabel();
        resetCampo();
        
        opcao = 7;
        
        jTextArea1.setText("");
        jLabel2.setText("Nome: ");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //PROCURAR CONTA
        resetLabel();
        resetCampo();
        
        opcao = 8;
        
        jTextArea1.setText("");
        jLabel2.setText("Nome: ");
        jLabel3.setText("Conta: ");
                
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //CONFIRMAR
        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                cadastrarConta();
                break;
            case 3:
                deposito();
                break;
            case 4:
                saque();
                break;  
            case 5:
                extrato();
                break;    
            case 6:
                cancelarConta();
                break;
            case 7:
                verificarContaCliente();
                break;
            case 8:
                procurarConta();
                break;    
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //LIMPAR
        jTextArea1.setText("");
        resetLabel();
        resetCampo();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void resetLabel() {
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
    }
    
    private void resetCampo() {
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
    }
    
    private void cadastrarCliente() {
        entrada1 = campo1.getText();
        entrada2 = campo2.getText();
        entrada3 = campo3.getText();
        
        cliente = new Cliente();
        cliente.setNome(entrada1);
        cliente.setTelefone(entrada2);
        cliente.setEmail(entrada3);
        
        todosOsClientes.add(cliente);
        
        jTextArea1.setText("Cliente Cadastrado");
        resetLabel();
        resetCampo();
    }
    
    private void cadastrarConta() {
        entrada1 = campo1.getText();
        
        validaCondicao = false;
        tamanhoArray = todosOsClientes.size();   
        if (tamanhoArray > 0) {
            for (i = 0; i < tamanhoArray; i++) {
                if (entrada1.equals(todosOsClientes.get(i).getNome())) {
                    validaCondicao = true;
                    conta = new ContaBancaria((todasAsContas.size() + 1000), todosOsClientes.get(i));
                    todasAsContas.add(conta);
                    todosOsClientes.get(i).setConta(conta);
                    jTextArea1.setText("Conta Criada\n"
                                    + "Titular: " + todosOsClientes.get(i).getNome()
                                    + "\nConta: " + conta.getNumero()
                                    + "\nTelefone: " + todosOsClientes.get(i).getTelefone()
                                    + "\nEmail: " + todosOsClientes.get(i).getEmail()
                                    + "\nSaldo: " + conta.getSaldo()
                                    + "\nStatus: " + conta.getAtiva() + "\n");
                }
            }
            
            if (validaCondicao == false) {
                jTextArea1.setText("Nenhum cliente cadastrado com esse nome\n");
            }
        }
        else {
            jTextArea1.setText("Nenhum cliente cadastrado\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void deposito() {
        entrada1 = campo1.getText();
        entrada2 = campo2.getText();
        
        validaCondicao = false;
        tamanhoArray = todasAsContas.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (Integer.parseInt(entrada1) == todasAsContas.get(i).getNumero()) {
                validaCondicao = true;
                if (todasAsContas.get(i).getAtiva() != false) {
                    jTextArea1.setText("Titular: " + todasAsContas.get(i).getNome()
                                    + "\nNúmero da Conta: " + todasAsContas.get(i).getNumero()
                                    + "\nSaldo: " + todasAsContas.get(i).depositar(Double.parseDouble(entrada2)) + "\n");
                }
                else {
                    jTextArea1.setText("Conta desativada\n");
                }
            }
        }
        
        if (validaCondicao == false) {
            jTextArea1.setText("Conta não encontrada\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void saque() {
        entrada1 = campo1.getText();
        entrada2 = campo2.getText();
        
        validaCondicao = false;
        tamanhoArray = todasAsContas.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (Integer.parseInt(entrada1) == todasAsContas.get(i).getNumero()) {
                validaCondicao = true;
                if (todasAsContas.get(i).getAtiva() != false) {
                    if (todasAsContas.get(i).getSaldo() - (Double.parseDouble(entrada2)) >= 0) {
                        jTextArea1.setText("Titular: " + todasAsContas.get(i).getNome()
                                        + "\nNúmero da Conta: " + todasAsContas.get(i).getNumero()
                                        + "\nSaldo: " + todasAsContas.get(i).sacar(Double.parseDouble(entrada2)) + "\n");
                    }
                    else {
                        jTextArea1.setText("Saldo insuficiente\n");
                    }
                }
                else {
                    jTextArea1.setText("Conta desativada\n");
                }
            }
        }
        
        if (validaCondicao == false) {
            jTextArea1.setText("Conta não encontrada\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void extrato() {
        entrada1 = campo1.getText();
        
        validaCondicao = false;
        tamanhoArray = todasAsContas.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (Integer.parseInt(entrada1) == todasAsContas.get(i).getNumero()) {
                validaCondicao = true;
                if (todasAsContas.get(i).getAtiva() != false) {
                    jTextArea1.setText("Titular: " + todasAsContas.get(i).getNome()
                                        + "\nNúmero da Conta: " + todasAsContas.get(i).getNumero()
                                        + "\nSaldo: " + todasAsContas.get(i).getSaldo() + "\n");
                }
                else {
                    jTextArea1.setText("Conta desativada\n");
                }
            }
        }
        
        if (validaCondicao == false) {
            jTextArea1.setText("Conta não encontrada\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void cancelarConta() {
        entrada1 = campo1.getText();
        
        validaCondicao = false;
        tamanhoArray = todasAsContas.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (Integer.parseInt(entrada1) == todasAsContas.get(i).getNumero()) {
                if (todasAsContas.get(i).getAtiva() == true) {
                    validaCondicao = true;
                    todasAsContas.get(i).cancelarConta();
                    jTextArea1.setText("Conta " + todasAsContas.get(i).getNumero() + " desativada\n");
                }
            }
        }
        
        if (validaCondicao == false) {
            jTextArea1.setText("Conta não encontrada ou previamente desativada\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void verificarContaCliente() {
        entrada1 = campo1.getText();
        
        validaCondicao = false;
        tamanhoArray = todasAsContas.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (entrada1.equals(todasAsContas.get(i).getNome())) {
                validaCondicao = true;
                entrada2 = jTextArea1.getText();
                jTextArea1.setText(entrada2
                                + "Titular: " + todasAsContas.get(i).getNome()
                                + "\nNumero: " + todasAsContas.get(i).getNumero()
                                + "\nSaldo: " + todasAsContas.get(i).getSaldo()
                                + "\nStatus: " + todasAsContas.get(i).getAtiva() + "\n\n");
            }
        }
        
        if (validaCondicao == false) {
            jTextArea1.setText("Cliente inexistente ou sem contas\n");
        }
        
        resetLabel();
        resetCampo();
    }
    
    private void procurarConta() {
        entrada1 = campo1.getText();
        entrada2 = campo2.getText();
        
        validaCondicao = false;
        tamanhoArray = todosOsClientes.size();
        for (i = 0; i < tamanhoArray; i++) {
            if (entrada1.equals(todosOsClientes.get(i).getNome())) {
                validaCondicao = true;   
                conta = todosOsClientes.get(i).buscaConta(Integer.parseInt(entrada2));
                
                if (conta != null) {
                    jTextArea1.setText("Numero: " + conta.getNumero()
                                    + "\nSaldo: " + conta.getSaldo()
                                    + "\nStatus: " + conta.getAtiva() + "\n");
                }
                else {
                    jTextArea1.setText("O cliente " + todosOsClientes.get(i).getNome() + " não possui essa conta\n");
                }
            }
        }
        if (validaCondicao == false) {
            jTextArea1.setText("Nenhum cliente cadastrado com esse nome\n");
        }
        
        resetLabel();
        resetCampo();
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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastro;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
