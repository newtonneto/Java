package contabancaria;

public class BancoUI extends javax.swing.JFrame {
    Agencia[] todasAsAgencias = new Agencia[5];
    Agencia agencia;
    Cliente cliente;
    ContaBancaria conta;
    int opcaoOperador;
    int opcaoCliente;
    int tamanhoArrayAgencias = 0;
    int tamanhoArrayClientes;
    int i;
    int j;
    boolean validaCondicao;
    String entrada1;
    String entrada2;
    String entrada3;
    String entrada4;

    public BancoUI() {
        initComponents();
        menus.removeAll();
        menus.repaint();
        menus.revalidate();
        entrada1Operador.setVisible(false);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        botaoOperador = new javax.swing.JButton();
        botaoCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        menus = new javax.swing.JPanel();
        menuOperador = new javax.swing.JPanel();
        botaoCriarAgencia = new javax.swing.JButton();
        botaoCadastrarCliente = new javax.swing.JButton();
        botaoCadastrarConta = new javax.swing.JButton();
        botaoListarContas = new javax.swing.JButton();
        botaoListarClientes = new javax.swing.JButton();
        botaoCancelarContaOperador = new javax.swing.JButton();
        nomeEntrada1Operador = new javax.swing.JLabel();
        nomeEntrada2Operador = new javax.swing.JLabel();
        nomeEntrada3Operador = new javax.swing.JLabel();
        nomeEntrada4Operador = new javax.swing.JLabel();
        entrada1Operador = new javax.swing.JTextField();
        entrada2Operador = new javax.swing.JTextField();
        entrada3Operador = new javax.swing.JTextField();
        entrada4Operador = new javax.swing.JTextField();
        botaoConfirmarOperador = new javax.swing.JButton();
        botaoLimparOperador = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoOperador = new javax.swing.JTextArea();
        menuCliente = new javax.swing.JPanel();
        botaoDeposito = new javax.swing.JButton();
        botaoSaque = new javax.swing.JButton();
        botaoExtrato = new javax.swing.JButton();
        botaoMinhasContas = new javax.swing.JButton();
        botaoCancelarContaCliente = new javax.swing.JButton();
        nomeEntrada1Cliente = new javax.swing.JLabel();
        nomeEntrada2Cliente = new javax.swing.JLabel();
        nomeEntrada3Cliente = new javax.swing.JLabel();
        entrada1Cliente = new javax.swing.JTextField();
        entrada2Cliente = new javax.swing.JTextField();
        entrada3Cliente = new javax.swing.JTextField();
        botaoConfirmarCliente = new javax.swing.JButton();
        botaoLimparCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoCliente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuLateral.setBackground(new java.awt.Color(0, 0, 0));

        botaoOperador.setText("Operador");
        botaoOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOperadorActionPerformed(evt);
            }
        });

        botaoCliente.setText("Cliente");
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Build: 3.0");

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoOperador, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(botaoOperador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        botaoCriarAgencia.setText("Criar Agência");
        botaoCriarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarAgenciaActionPerformed(evt);
            }
        });

        botaoCadastrarCliente.setText("Cadastrar Cliente");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        botaoCadastrarConta.setText("Cadastrar Conta");
        botaoCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarContaActionPerformed(evt);
            }
        });

        botaoListarContas.setText("Listar Contas");
        botaoListarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarContasActionPerformed(evt);
            }
        });

        botaoListarClientes.setText("Listar Clientes");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });

        botaoCancelarContaOperador.setText("Cancelar Conta");
        botaoCancelarContaOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarContaOperadorActionPerformed(evt);
            }
        });

        botaoConfirmarOperador.setText("Confirmar");
        botaoConfirmarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarOperadorActionPerformed(evt);
            }
        });

        botaoLimparOperador.setText("Limpar");
        botaoLimparOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparOperadorActionPerformed(evt);
            }
        });

        resultadoOperador.setEditable(false);
        resultadoOperador.setColumns(20);
        resultadoOperador.setRows(5);
        jScrollPane2.setViewportView(resultadoOperador);

        javax.swing.GroupLayout menuOperadorLayout = new javax.swing.GroupLayout(menuOperador);
        menuOperador.setLayout(menuOperadorLayout);
        menuOperadorLayout.setHorizontalGroup(
            menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCancelarContaOperador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoListarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoListarContas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadastrarConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCriarAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(menuOperadorLayout.createSequentialGroup()
                        .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeEntrada4Operador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(nomeEntrada1Operador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeEntrada2Operador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeEntrada3Operador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrada1Operador)
                            .addComponent(entrada2Operador)
                            .addComponent(entrada3Operador)
                            .addComponent(entrada4Operador)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOperadorLayout.createSequentialGroup()
                        .addGap(0, 470, Short.MAX_VALUE)
                        .addComponent(botaoConfirmarOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimparOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuOperadorLayout.setVerticalGroup(
            menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarAgencia)
                    .addComponent(nomeEntrada1Operador)
                    .addComponent(entrada1Operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarCliente)
                    .addComponent(nomeEntrada2Operador)
                    .addComponent(entrada2Operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarConta)
                    .addComponent(nomeEntrada3Operador)
                    .addComponent(entrada3Operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarContas)
                    .addComponent(nomeEntrada4Operador)
                    .addComponent(entrada4Operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarClientes)
                    .addComponent(botaoLimparOperador)
                    .addComponent(botaoConfirmarOperador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOperadorLayout.createSequentialGroup()
                        .addComponent(botaoCancelarContaOperador)
                        .addGap(0, 333, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        botaoDeposito.setText("Deposito");

        botaoSaque.setText("Saque");

        botaoExtrato.setText("Extrato");

        botaoMinhasContas.setText("Minhas Contas");

        botaoCancelarContaCliente.setText("Cancelar Conta");

        nomeEntrada1Cliente.setText("AAAAAAAA");

        nomeEntrada2Cliente.setText("AAAAAAAA");

        nomeEntrada3Cliente.setText("AAAAAAAA");

        botaoConfirmarCliente.setText("Confirmar");

        botaoLimparCliente.setText("Limpar");

        resultadoCliente.setColumns(20);
        resultadoCliente.setRows(5);
        jScrollPane1.setViewportView(resultadoCliente);

        javax.swing.GroupLayout menuClienteLayout = new javax.swing.GroupLayout(menuCliente);
        menuCliente.setLayout(menuClienteLayout);
        menuClienteLayout.setHorizontalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoSaque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCancelarContaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMinhasContas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExtrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDeposito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuClienteLayout.createSequentialGroup()
                        .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeEntrada1Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(nomeEntrada2Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeEntrada3Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrada1Cliente)
                            .addComponent(entrada2Cliente)
                            .addComponent(entrada3Cliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuClienteLayout.createSequentialGroup()
                        .addGap(0, 480, Short.MAX_VALUE)
                        .addComponent(botaoConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        menuClienteLayout.setVerticalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDeposito)
                    .addComponent(nomeEntrada1Cliente)
                    .addComponent(entrada1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSaque)
                    .addComponent(nomeEntrada2Cliente)
                    .addComponent(entrada2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExtrato)
                    .addComponent(nomeEntrada3Cliente)
                    .addComponent(entrada3Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMinhasContas)
                    .addComponent(botaoLimparCliente)
                    .addComponent(botaoConfirmarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuClienteLayout.createSequentialGroup()
                        .addComponent(botaoCancelarContaCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuOperador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOperadorActionPerformed
        //Exibe menu operador
        menus.removeAll();
        menus.repaint();
        menus.revalidate();
        menus.add(menuOperador);
        menus.repaint();
        menus.revalidate();
    }//GEN-LAST:event_botaoOperadorActionPerformed

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        //Exibe menu cliente
        menus.removeAll();
        menus.repaint();
        menus.revalidate();
        menus.add(menuCliente);
        menus.repaint();
        menus.revalidate();
    }//GEN-LAST:event_botaoClienteActionPerformed

    private void botaoCriarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarAgenciaActionPerformed
        //Criar Agência
        opcaoOperador = 1;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Número:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoCriarAgenciaActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        //Cadastrar Cliente
        opcaoOperador = 2;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Nome:");
        nomeEntrada2Operador.setText("Agência:");
        nomeEntrada3Operador.setText("Telefone:");
        nomeEntrada4Operador.setText("Email:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(true);
        entrada3Operador.setVisible(true);
        entrada4Operador.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void botaoCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarContaActionPerformed
        //Cadastrar Conta
        opcaoOperador = 3;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Nome:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoCadastrarContaActionPerformed

    private void botaoListarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarContasActionPerformed
        //Listar Contas
        opcaoOperador = 4;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Agência:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoListarContasActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        //Listar Clientes
        opcaoOperador = 5;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Agência:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoCancelarContaOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarContaOperadorActionPerformed
        //Cancelar Conta
        opcaoOperador = 6;
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        
        nomeEntrada1Operador.setText("Titular:");
        nomeEntrada2Operador.setText("Agência:");
        entrada1Operador.setVisible(true);
        entrada2Operador.setVisible(true);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoCancelarContaOperadorActionPerformed

    private void botaoLimparOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparOperadorActionPerformed
        //Limpar
        resetLabelOperador();
        resetEntradaOperador();
        resultadoOperador.setText("");
        entrada1Operador.setVisible(false);
        entrada2Operador.setVisible(false);
        entrada3Operador.setVisible(false);
        entrada4Operador.setVisible(false);
    }//GEN-LAST:event_botaoLimparOperadorActionPerformed

    private void botaoConfirmarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarOperadorActionPerformed
        //Confirmar
        switch(opcaoOperador) {
            case 1:
                criarNovaAgencia();
                break;
            case 2:
                cadastrarNovoCliente();
                break;
            case 3:
                cadastrarNovaConta();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_botaoConfirmarOperadorActionPerformed

    private void criarNovaAgencia() {
        entrada1 = entrada1Operador.getText();
        
        //Verifica se a entrada do operador é um numero maior que 0
        if (Integer.parseInt(entrada1) > 0) {
            //Se o array de agências estiver vazio vai atribuir a nova agência a primeira posição do array
            if (tamanhoArrayAgencias == 0) {
                todasAsAgencias[tamanhoArrayAgencias] = new Agencia(Integer.parseInt(entrada1));;
                resultadoOperador.setText("Agência " + todasAsAgencias[tamanhoArrayAgencias].getNumeroAgencia() + " cadastrada\n");
                tamanhoArrayAgencias++;
            }
            else {
                validaCondicao = false;
                //Percorre o array de agências para verificar se já existe uma agência com a mesma numeração
                for (i = 0; i < tamanhoArrayAgencias; i++) {
                    if (todasAsAgencias[i].getNumeroAgencia() == Integer.parseInt(entrada1)) {
                        validaCondicao = true;
                        i = tamanhoArrayAgencias;
                        resultadoOperador.setText("Agência previamente cadastrada\n");
                    }
                }
                
                //Insere uma nova agência no array de agências
                if (validaCondicao == false) {
                    todasAsAgencias[tamanhoArrayAgencias] = new Agencia(Integer.parseInt(entrada1));
                    resultadoOperador.setText("Agência " + todasAsAgencias[tamanhoArrayAgencias].getNumeroAgencia() + " cadastrada\n");
                    tamanhoArrayAgencias++;
                }
            }
        }
    }
    
    private void cadastrarNovoCliente() {
        entrada1 = entrada1Operador.getText();
        entrada2 = entrada2Operador.getText();
        entrada3 = entrada3Operador.getText();
        entrada4 = entrada4Operador.getText();
        cliente = null;
        
        //Verifica se o operador passou algum valor nulo
        if (entrada1 != null && entrada1 != "" && entrada2 != null && entrada2 != "" && entrada3 != null && entrada3 != "" && entrada4 != null && entrada4 != "") {
            cliente = new Cliente(entrada1, entrada2, entrada3, Integer.parseInt(entrada2));
        }
        else {
            resultadoOperador.setText("Não foi possível cadastrar cliente, informações faltando\n");
        }
        
        //Procura a agencia do novo cliente
        validaCondicao = false;
        if (cliente != null) {
            for (i = 0; i < tamanhoArrayAgencias; i++) {
                if (todasAsAgencias[i].getNumeroAgencia() == Integer.parseInt(entrada2)) {
                    validaCondicao = true;
                    todasAsAgencias[i].setCliente(cliente);
                    resultadoOperador.setText("Cliente " + cliente.getNome() + " cadastrado na agência " + todasAsAgencias[i].getNumeroAgencia());
                }
            }
            
            if (validaCondicao == false) {
                resultadoOperador.setText("Agencia inexistente");
            }
        }
    }
    
    private void cadastrarNovaConta() {
        String numeroDaConta;
        entrada1 = entrada1Operador.getText();
        
        //Verifica se o operador passou algum valor nulo
        if (entrada1 != null && entrada1 != "") {
            //Percorre o array de agencias
            validaCondicao = false;
            for (i = 0; i < tamanhoArrayAgencias; i++) {
                tamanhoArrayClientes = todasAsAgencias[i].getTamanhoArrayClientes();
                //Percorre o array de clientes de cada agencia
                for (j = 0; j < tamanhoArrayClientes; j++) {
                    //Verifica se o array de clientes atual possui algum cliente com o noem passado pelo operador
                    if (todasAsAgencias[i].getCliente(j).getNome().equals(entrada1)) {
                        validaCondicao = true;
                        //Cria um numero para nova conta
                        numeroDaConta = "1000" + todasAsAgencias[i].getNumeroAgencia() + "" + todasAsAgencias[i].getTamanhoArrayContas();
                        cliente = todasAsAgencias[i].getCliente(j);
                        conta = new ContaBancaria(Integer.parseInt(numeroDaConta), cliente, todasAsAgencias[i].getNumeroAgencia());
                        resultadoOperador.setText("Conta cadastrada para o cliente " + entrada1);
                        i = tamanhoArrayAgencias;
                        j = tamanhoArrayClientes;
                    }
                }
                
                if (validaCondicao == false) {
                    resultadoOperador.setText("Cliente " + entrada1 + " não encontrado\n");
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(BancoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoUI().setVisible(true);
            }
        });
    }
    
    private void resetLabelOperador() {
        nomeEntrada1Operador.setText("");
        nomeEntrada2Operador.setText("");
        nomeEntrada3Operador.setText("");
        nomeEntrada4Operador.setText("");
    }
    
    private void resetLabelCliente() {
        nomeEntrada1Cliente.setText("");
        nomeEntrada2Cliente.setText("");
        nomeEntrada3Cliente.setText("");
    }
    
    private void resetEntradaOperador() {
        entrada1Operador.setText("");
        entrada2Operador.setText("");
        entrada3Operador.setText("");
        entrada4Operador.setText("");
    }
    
    private void resetEntradaCliente() {
        entrada1Cliente.setText("");
        entrada2Cliente.setText("");
        entrada3Cliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoCadastrarConta;
    private javax.swing.JButton botaoCancelarContaCliente;
    private javax.swing.JButton botaoCancelarContaOperador;
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton botaoConfirmarCliente;
    private javax.swing.JButton botaoConfirmarOperador;
    private javax.swing.JButton botaoCriarAgencia;
    private javax.swing.JButton botaoDeposito;
    private javax.swing.JButton botaoExtrato;
    private javax.swing.JButton botaoLimparCliente;
    private javax.swing.JButton botaoLimparOperador;
    private javax.swing.JButton botaoListarClientes;
    private javax.swing.JButton botaoListarContas;
    private javax.swing.JButton botaoMinhasContas;
    private javax.swing.JButton botaoOperador;
    private javax.swing.JButton botaoSaque;
    private javax.swing.JTextField entrada1Cliente;
    private javax.swing.JTextField entrada1Operador;
    private javax.swing.JTextField entrada2Cliente;
    private javax.swing.JTextField entrada2Operador;
    private javax.swing.JTextField entrada3Cliente;
    private javax.swing.JTextField entrada3Operador;
    private javax.swing.JTextField entrada4Operador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuCliente;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel menuOperador;
    private javax.swing.JPanel menus;
    private javax.swing.JLabel nomeEntrada1Cliente;
    private javax.swing.JLabel nomeEntrada1Operador;
    private javax.swing.JLabel nomeEntrada2Cliente;
    private javax.swing.JLabel nomeEntrada2Operador;
    private javax.swing.JLabel nomeEntrada3Cliente;
    private javax.swing.JLabel nomeEntrada3Operador;
    private javax.swing.JLabel nomeEntrada4Operador;
    private javax.swing.JTextArea resultadoCliente;
    private javax.swing.JTextArea resultadoOperador;
    // End of variables declaration//GEN-END:variables
}
