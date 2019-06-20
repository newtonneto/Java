package banco;

import javax.swing.JOptionPane;

public class ViewUI extends javax.swing.JFrame {
    Banco[] todosOsBancos = new Banco[100];
    int tamanhoArrayBancos = 0;
    Banco banco;
    Agencia agencia;
    Cliente cliente;
    ContaPoupanca contaPoupanca;
    ContaCorrente contaCorrente;
    int operacaoBanco;
    int operacaoOperador;
    int operacaoCliente;
    int tipoConta;
    
    public ViewUI() {
        initComponents();
        menuLateralOperador.setVisible(false);
        menuLateralCliente.setVisible(false);
        areaBanco.setVisible(false);
        submenuBanco.setVisible(false);
        areaOperador.setVisible(false);
        areaCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        menuLateralPrincipal = new javax.swing.JPanel();
        criarBanco = new javax.swing.JButton();
        entrarBanco = new javax.swing.JButton();
        menuLateralOperador = new javax.swing.JPanel();
        cadastrarCliente = new javax.swing.JButton();
        criarConta = new javax.swing.JButton();
        listarContas = new javax.swing.JButton();
        listarClientes = new javax.swing.JButton();
        alterarStatusConta = new javax.swing.JButton();
        voltarOperador = new javax.swing.JButton();
        menuLateralCliente = new javax.swing.JPanel();
        deposito = new javax.swing.JButton();
        saque = new javax.swing.JButton();
        transferencia = new javax.swing.JButton();
        extrato = new javax.swing.JButton();
        voltarCliente = new javax.swing.JButton();
        areaGeral = new javax.swing.JPanel();
        areaBanco = new javax.swing.JPanel();
        label1Banco = new javax.swing.JLabel();
        textBanco = new javax.swing.JTextField();
        confirmarBanco = new javax.swing.JButton();
        limparBanco = new javax.swing.JButton();
        msgErroBanco = new javax.swing.JLabel();
        submenuBanco = new javax.swing.JPanel();
        labelTitulo1 = new javax.swing.JLabel();
        labelTitulo2 = new javax.swing.JLabel();
        label1submenuBanco = new javax.swing.JLabel();
        label2submenuBanco = new javax.swing.JLabel();
        label3submenuBanco = new javax.swing.JLabel();
        label4submenuBanco = new javax.swing.JLabel();
        text1submenuBanco = new javax.swing.JTextField();
        text2submenuBanco = new javax.swing.JTextField();
        text3submenuBanco = new javax.swing.JTextField();
        text4submenuBanco = new javax.swing.JTextField();
        confirmar1submenuBanco = new javax.swing.JButton();
        limpar1submenuBanco = new javax.swing.JButton();
        label5submenuBanco = new javax.swing.JLabel();
        label6submenuBanco = new javax.swing.JLabel();
        text5submenuBanco = new javax.swing.JTextField();
        text6submenuBanco = new javax.swing.JTextField();
        confirmar2submenuBanco = new javax.swing.JButton();
        limpar2submenuBanco = new javax.swing.JButton();
        msg1ErroSubmenuBanco = new javax.swing.JLabel();
        msg2ErroSubmenuBanco = new javax.swing.JLabel();
        labelTitulo3 = new javax.swing.JLabel();
        label7submenuBanco = new javax.swing.JLabel();
        label8submenuBanco = new javax.swing.JLabel();
        label9submenuBanco = new javax.swing.JLabel();
        text7submenuBanco = new javax.swing.JTextField();
        text8submenuBanco = new javax.swing.JTextField();
        text9submenuBanco = new javax.swing.JTextField();
        confimar3submenuBanco = new javax.swing.JButton();
        limpar3submenuBanco = new javax.swing.JButton();
        msg3ErroSubmenuBanco = new javax.swing.JLabel();
        radio1submenuBanco = new javax.swing.JRadioButton();
        radio2submenuBanco = new javax.swing.JRadioButton();
        areaOperador = new javax.swing.JPanel();
        label1AreaOperador = new javax.swing.JLabel();
        label2AreaOperador = new javax.swing.JLabel();
        label3AreaOperador = new javax.swing.JLabel();
        label4AreaOperador = new javax.swing.JLabel();
        label5AreaOperador = new javax.swing.JLabel();
        text1AreaOperador = new javax.swing.JTextField();
        text2AreaOperador = new javax.swing.JTextField();
        text3AreaOperador = new javax.swing.JTextField();
        text4AreaOperador = new javax.swing.JTextField();
        text5AreaOperador = new javax.swing.JTextField();
        confirmarAreaOperador = new javax.swing.JButton();
        limparAreaOperador = new javax.swing.JButton();
        radio1Operador = new javax.swing.JRadioButton();
        radio2Operador = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaOperador = new javax.swing.JTextArea();
        msgErroAreaOperador = new javax.swing.JLabel();
        areaCliente = new javax.swing.JPanel();
        label1AreaCliente = new javax.swing.JLabel();
        label2AreaCliente = new javax.swing.JLabel();
        label3AreaCliente = new javax.swing.JLabel();
        label4AreaCliente = new javax.swing.JLabel();
        label5AreaCliente = new javax.swing.JLabel();
        text1AreaCliente = new javax.swing.JTextField();
        text2AreaCliente = new javax.swing.JTextField();
        text3AreaCliente = new javax.swing.JTextField();
        text4AreaCliente = new javax.swing.JTextField();
        text5AreaCliente = new javax.swing.JTextField();
        confirmarAreaCliente = new javax.swing.JButton();
        limparAreaCliente = new javax.swing.JButton();
        radio1Cliente = new javax.swing.JRadioButton();
        radio2Cliente = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaCliente = new javax.swing.JTextArea();
        msgErroAreaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 0, 0));

        menuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        criarBanco.setText("Criar Banco");
        criarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarBancoActionPerformed(evt);
            }
        });

        entrarBanco.setText("Entrar Banco");
        entrarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralPrincipalLayout = new javax.swing.GroupLayout(menuLateralPrincipal);
        menuLateralPrincipal.setLayout(menuLateralPrincipalLayout);
        menuLateralPrincipalLayout.setHorizontalGroup(
            menuLateralPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entrarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLateralPrincipalLayout.setVerticalGroup(
            menuLateralPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(criarBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrarBanco)
                .addContainerGap(632, Short.MAX_VALUE))
        );

        menuLateral.add(menuLateralPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        criarConta.setText("Criar Conta");
        criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaActionPerformed(evt);
            }
        });

        listarContas.setText("Listar Contas");
        listarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarContasActionPerformed(evt);
            }
        });

        listarClientes.setText("Listar Clientes");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
            }
        });

        alterarStatusConta.setText("Alterar Status Conta");
        alterarStatusConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarStatusContaActionPerformed(evt);
            }
        });

        voltarOperador.setText("Voltar");
        voltarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarOperadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralOperadorLayout = new javax.swing.GroupLayout(menuLateralOperador);
        menuLateralOperador.setLayout(menuLateralOperadorLayout);
        menuLateralOperadorLayout.setHorizontalGroup(
            menuLateralOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(criarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listarContas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarStatusConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLateralOperadorLayout.setVerticalGroup(
            menuLateralOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listarContas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterarStatusConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarOperador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuLateral.add(menuLateralOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        deposito.setText("Deposito");
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
            }
        });

        saque.setText("Saque");
        saque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueActionPerformed(evt);
            }
        });

        transferencia.setText("Transferencia");
        transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaActionPerformed(evt);
            }
        });

        extrato.setText("Extrato");
        extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratoActionPerformed(evt);
            }
        });

        voltarCliente.setText("Voltar");
        voltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralClienteLayout = new javax.swing.GroupLayout(menuLateralCliente);
        menuLateralCliente.setLayout(menuLateralClienteLayout);
        menuLateralClienteLayout.setHorizontalGroup(
            menuLateralClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deposito, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(saque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLateralClienteLayout.setVerticalGroup(
            menuLateralClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(extrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarCliente)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        menuLateral.add(menuLateralCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        areaGeral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1Banco.setText("Nome Banco:");

        confirmarBanco.setText("Confirmar");
        confirmarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBancoActionPerformed(evt);
            }
        });

        limparBanco.setText("Limpar");

        msgErroBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErroBanco.setForeground(new java.awt.Color(255, 0, 51));
        msgErroBanco.setText("MSG ERRO");

        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo1.setText("Criar Agencia");

        labelTitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo2.setText("Entrar Agencia - Funcionario");

        label1submenuBanco.setText("Numero:");

        label2submenuBanco.setText("Funcionario:");

        label3submenuBanco.setText("Telefone:");

        label4submenuBanco.setText("Email:");

        confirmar1submenuBanco.setText("Confirmar");
        confirmar1submenuBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar1submenuBancoActionPerformed(evt);
            }
        });

        limpar1submenuBanco.setText("Limpar");

        label5submenuBanco.setText("Numero:");

        label6submenuBanco.setText("Funcionario:");

        confirmar2submenuBanco.setText("Confirmar");
        confirmar2submenuBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar2submenuBancoActionPerformed(evt);
            }
        });

        limpar2submenuBanco.setText("Limpar");

        msg1ErroSubmenuBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msg1ErroSubmenuBanco.setForeground(new java.awt.Color(255, 0, 51));
        msg1ErroSubmenuBanco.setText("MSG ERRO");

        msg2ErroSubmenuBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msg2ErroSubmenuBanco.setForeground(new java.awt.Color(255, 0, 51));
        msg2ErroSubmenuBanco.setText("MSG ERRO");

        labelTitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo3.setText("Entrar Agencia - Cliente");

        label7submenuBanco.setText("Numero:");

        label8submenuBanco.setText("Nome:");

        label9submenuBanco.setText("Conta:");

        confimar3submenuBanco.setText("Confirmar");
        confimar3submenuBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confimar3submenuBancoActionPerformed(evt);
            }
        });

        limpar3submenuBanco.setText("Limpar");

        msg3ErroSubmenuBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msg3ErroSubmenuBanco.setForeground(new java.awt.Color(255, 0, 51));
        msg3ErroSubmenuBanco.setText("MSG ERRO");

        buttonGroup2.add(radio1submenuBanco);
        radio1submenuBanco.setText("Conta Poupanca");

        buttonGroup2.add(radio2submenuBanco);
        radio2submenuBanco.setText("Conta Corrente");

        javax.swing.GroupLayout submenuBancoLayout = new javax.swing.GroupLayout(submenuBanco);
        submenuBanco.setLayout(submenuBancoLayout);
        submenuBancoLayout.setHorizontalGroup(
            submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuBancoLayout.createSequentialGroup()
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label1submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1submenuBanco)
                            .addComponent(text2submenuBanco)
                            .addComponent(text3submenuBanco)
                            .addComponent(text4submenuBanco, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuBancoLayout.createSequentialGroup()
                        .addComponent(msg1ErroSubmenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmar1submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar1submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuBancoLayout.createSequentialGroup()
                        .addComponent(msg2ErroSubmenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmar2submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar2submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuBancoLayout.createSequentialGroup()
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(submenuBancoLayout.createSequentialGroup()
                                .addComponent(label6submenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(submenuBancoLayout.createSequentialGroup()
                                .addComponent(label5submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text5submenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                            .addComponent(text6submenuBanco)))
                    .addGroup(submenuBancoLayout.createSequentialGroup()
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo1)
                            .addComponent(labelTitulo2)
                            .addComponent(labelTitulo3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(submenuBancoLayout.createSequentialGroup()
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label9submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label8submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label7submenuBanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text7submenuBanco)
                            .addComponent(text8submenuBanco)
                            .addGroup(submenuBancoLayout.createSequentialGroup()
                                .addComponent(text9submenuBanco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio1submenuBanco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radio2submenuBanco))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submenuBancoLayout.createSequentialGroup()
                        .addComponent(msg3ErroSubmenuBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confimar3submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar3submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        submenuBancoLayout.setVerticalGroup(
            submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1submenuBanco)
                    .addComponent(text1submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2submenuBanco)
                    .addComponent(text2submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3submenuBanco)
                    .addComponent(text3submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4submenuBanco)
                    .addComponent(text4submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar1submenuBanco)
                    .addComponent(limpar1submenuBanco)
                    .addComponent(msg1ErroSubmenuBanco))
                .addGap(18, 18, 18)
                .addComponent(labelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5submenuBanco)
                    .addComponent(text5submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6submenuBanco)
                    .addComponent(text6submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar2submenuBanco)
                    .addComponent(confirmar2submenuBanco)
                    .addComponent(msg2ErroSubmenuBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7submenuBanco)
                    .addComponent(text7submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8submenuBanco)
                    .addComponent(text8submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label9submenuBanco)
                    .addComponent(text9submenuBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio1submenuBanco)
                    .addComponent(radio2submenuBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(submenuBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar3submenuBanco)
                    .addComponent(confimar3submenuBanco)
                    .addComponent(msg3ErroSubmenuBanco))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout areaBancoLayout = new javax.swing.GroupLayout(areaBanco);
        areaBanco.setLayout(areaBancoLayout);
        areaBancoLayout.setHorizontalGroup(
            areaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBancoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(msgErroBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(356, 356, 356)
                        .addComponent(confirmarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaBancoLayout.createSequentialGroup()
                        .addComponent(label1Banco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        areaBancoLayout.setVerticalGroup(
            areaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1Banco)
                    .addComponent(textBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparBanco)
                    .addComponent(confirmarBanco)
                    .addComponent(msgErroBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submenuBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        areaGeral.add(areaBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        areaOperador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        areaOperador.add(label1AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 74, -1));
        areaOperador.add(label2AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 74, -1));
        areaOperador.add(label3AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 74, -1));

        label4AreaOperador.setToolTipText("");
        areaOperador.add(label4AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 74, -1));
        areaOperador.add(label5AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 74, -1));
        areaOperador.add(text1AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 11, 768, -1));
        areaOperador.add(text2AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 42, 768, -1));
        areaOperador.add(text3AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 73, 768, -1));
        areaOperador.add(text4AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 104, 768, -1));
        areaOperador.add(text5AreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 135, 768, -1));

        confirmarAreaOperador.setText("Confirmar");
        confirmarAreaOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAreaOperadorActionPerformed(evt);
            }
        });
        areaOperador.add(confirmarAreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 166, 180, -1));

        limparAreaOperador.setText("Limpar");
        areaOperador.add(limparAreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 166, 180, -1));

        buttonGroup1.add(radio1Operador);
        radio1Operador.setText("Conta Poupanca");
        radio1Operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1OperadorActionPerformed(evt);
            }
        });
        areaOperador.add(radio1Operador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));

        buttonGroup1.add(radio2Operador);
        radio2Operador.setText("Conta Corrente");
        radio2Operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2OperadorActionPerformed(evt);
            }
        });
        areaOperador.add(radio2Operador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        textAreaOperador.setColumns(20);
        textAreaOperador.setRows(5);
        jScrollPane2.setViewportView(textAreaOperador);

        areaOperador.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 852, 440));

        msgErroAreaOperador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErroAreaOperador.setForeground(new java.awt.Color(255, 0, 51));
        msgErroAreaOperador.setText("MSG ERRO");
        areaOperador.add(msgErroAreaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 472, -1));

        areaGeral.add(areaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        areaCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        areaCliente.add(label1AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 74, -1));
        areaCliente.add(label2AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 74, -1));
        areaCliente.add(label3AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 74, -1));

        label4AreaCliente.setToolTipText("");
        areaCliente.add(label4AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 74, -1));
        areaCliente.add(label5AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 74, -1));
        areaCliente.add(text1AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 11, 768, -1));
        areaCliente.add(text2AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 42, 768, -1));
        areaCliente.add(text3AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 73, 768, -1));
        areaCliente.add(text4AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 104, 768, -1));
        areaCliente.add(text5AreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 135, 768, -1));

        confirmarAreaCliente.setText("Confirmar");
        confirmarAreaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAreaClienteActionPerformed(evt);
            }
        });
        areaCliente.add(confirmarAreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 166, 180, -1));

        limparAreaCliente.setText("Limpar");
        areaCliente.add(limparAreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 166, 180, -1));

        buttonGroup1.add(radio1Cliente);
        radio1Cliente.setText("Conta Poupanca");
        radio1Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ClienteActionPerformed(evt);
            }
        });
        areaCliente.add(radio1Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));

        buttonGroup1.add(radio2Cliente);
        radio2Cliente.setText("Conta Corrente");
        radio2Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ClienteActionPerformed(evt);
            }
        });
        areaCliente.add(radio2Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        textAreaCliente.setColumns(20);
        textAreaCliente.setRows(5);
        jScrollPane4.setViewportView(textAreaCliente);

        areaCliente.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 852, 440));

        msgErroAreaCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErroAreaCliente.setForeground(new java.awt.Color(255, 0, 51));
        msgErroAreaCliente.setText("MSG ERRO");
        areaCliente.add(msgErroAreaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 472, -1));

        areaGeral.add(areaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areaGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areaGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarBancoActionPerformed
        //MOSTRAR AREA BANCO
        operacaoBanco = 1;
        resetLabelsBanco();
        textBanco.setText("");
        areaBanco.setVisible(true);
        submenuBanco.setVisible(false);
        areaOperador.setVisible(false);
        areaCliente.setVisible(false);
    }//GEN-LAST:event_criarBancoActionPerformed

    private void entrarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBancoActionPerformed
        //MOSTRAR AREA BANCO
        operacaoBanco = 2;
        resetLabelsBanco();
        textBanco.setText("");
        areaBanco.setVisible(true);
        submenuBanco.setVisible(false);
        areaOperador.setVisible(false);
        areaCliente.setVisible(false);
    }//GEN-LAST:event_entrarBancoActionPerformed

    private void confirmarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBancoActionPerformed
        //CONFIRMAR AREA BANCO
        switch (operacaoBanco){
            case 1:
                criarBanco();
                break;
            case 2:
                entrarBanco();
                break;
        }
    }//GEN-LAST:event_confirmarBancoActionPerformed

    private void confirmar1submenuBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar1submenuBancoActionPerformed
        //CRIAR AGENCIA
        criarAgencia();
    }//GEN-LAST:event_confirmar1submenuBancoActionPerformed

    private void confirmar2submenuBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar2submenuBancoActionPerformed
        //ENTRAR COMO OPERADOR
        entrarAgenciaOperador();
    }//GEN-LAST:event_confirmar2submenuBancoActionPerformed

    private void confirmarAreaOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAreaOperadorActionPerformed
        //CONFIRMAR OPERADOR
        switch(operacaoOperador) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                criarConta();
                break;
            case 3:
                listarContas();
                break;
            case 5:
                alterarStatusConta();
                break;
        }
    }//GEN-LAST:event_confirmarAreaOperadorActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        //CADASTRAR CLIENTE
        esconderElementosOperador();
        areaOperador.setVisible(true);
        resetLabelsOperador();
        label1AreaOperador.setText("Nome:");
        label2AreaOperador.setText("Telefone:");
        label3AreaOperador.setText("Email:");
        text1AreaOperador.setVisible(true);
        text2AreaOperador.setVisible(true);
        text3AreaOperador.setVisible(true);
        confirmarAreaOperador.setVisible(true);
        limparAreaOperador.setVisible(true);
        operacaoOperador = 1;
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void criarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaActionPerformed
        //CRIAR CONTA
        esconderElementosOperador();
        areaOperador.setVisible(true);
        resetLabelsOperador();
        label1AreaOperador.setText("Titular:");
        text1AreaOperador.setVisible(true);
        radio1Operador.setVisible(true);
        radio2Operador.setVisible(true);
        confirmarAreaOperador.setVisible(true);
        limparAreaOperador.setVisible(true);
        operacaoOperador = 2;
    }//GEN-LAST:event_criarContaActionPerformed

    private void radio1OperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1OperadorActionPerformed
        //SELECIONA POUPANCA
        /*selecionaTipoConta = 1;*/
    }//GEN-LAST:event_radio1OperadorActionPerformed

    private void radio2OperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2OperadorActionPerformed
        //SELECIONA CORRENTE
        /*selecionaTipoConta = 2;*/
    }//GEN-LAST:event_radio2OperadorActionPerformed

    private void listarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarContasActionPerformed
        //LISTAR CONTAS
        esconderElementosOperador();
        areaOperador.setVisible(true);
        resetLabelsOperador();
        resetTextOperador();
        radio1Operador.setVisible(true);
        radio2Operador.setVisible(true);
        textAreaOperador.setVisible(true);
        confirmarAreaOperador.setVisible(true);
        limparAreaOperador.setVisible(true);
        operacaoOperador = 3;
    }//GEN-LAST:event_listarContasActionPerformed

    private void alterarStatusContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarStatusContaActionPerformed
        //ALTERAR STATUS CONTA
        esconderElementosOperador();
        areaOperador.setVisible(true);
        resetLabelsOperador();
        resetTextOperador();
        label1AreaOperador.setText("Conta:");
        label2AreaOperador.setText("Titular:");
        text1AreaOperador.setVisible(true);
        text2AreaOperador.setVisible(true);
        radio1Operador.setVisible(true);
        radio2Operador.setVisible(true);
        confirmarAreaOperador.setVisible(true);
        limparAreaOperador.setVisible(true);
        operacaoOperador = 5;
    }//GEN-LAST:event_alterarStatusContaActionPerformed

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesActionPerformed
        //LISTAR CLIENTES
        esconderElementosOperador();
        areaOperador.setVisible(true);
        resetLabelsOperador();
        resetTextOperador();
        textAreaOperador.setVisible(true);
        /*operacaoOperador = 4;*/
        listarClientes();
    }//GEN-LAST:event_listarClientesActionPerformed

    private void voltarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarOperadorActionPerformed
        //VOLTAR
        voltar();
    }//GEN-LAST:event_voltarOperadorActionPerformed

    private void confirmarAreaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAreaClienteActionPerformed
        //CONFIRMAR AREA CLIENTE
        if (tipoConta == 1) {
            switch(operacaoCliente) {
                case 1:
                    depositoPoupanca();
                    break;
                case 2:
                    saquePoupanca();
                    break;
            }
        }
        else if (tipoConta == 2) {
            switch(operacaoCliente) {
                case 1:
                    depositoCorrente();
                    break;
                case 2:
                    saqueCorrente();
                    break;
                case 3:
                    transferenciaCorrente();
                    break;
            }
        }
    }//GEN-LAST:event_confirmarAreaClienteActionPerformed

    private void radio1ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ClienteActionPerformed

    private void radio2ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ClienteActionPerformed

    private void confimar3submenuBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confimar3submenuBancoActionPerformed
        //ENTRAR COMO CLIENTE
        entrarAgenciaCliente();
    }//GEN-LAST:event_confimar3submenuBancoActionPerformed

    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
        //DEPOSITO
        esconderElementosCliente();
        areaCliente.setVisible(true);
        resetLabelsCliente();
        label1AreaCliente.setText("Valor");
        text1AreaCliente.setVisible(true);
        confirmarAreaCliente.setVisible(true);
        limparAreaCliente.setVisible(true);
        operacaoCliente = 1;
    }//GEN-LAST:event_depositoActionPerformed

    private void saqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueActionPerformed
        //SAQUE
        esconderElementosCliente();
        areaCliente.setVisible(true);
        resetLabelsCliente();
        label1AreaCliente.setText("Valor");
        text1AreaCliente.setVisible(true);
        confirmarAreaCliente.setVisible(true);
        limparAreaCliente.setVisible(true);
        operacaoCliente = 2;
    }//GEN-LAST:event_saqueActionPerformed

    private void transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaActionPerformed
        //TRANSFERENCIA
        esconderElementosCliente();
        areaCliente.setVisible(true);
        resetLabelsCliente();
        label1AreaCliente.setText("Banco: ");
        label2AreaCliente.setText("Agencia: ");
        label3AreaCliente.setText("Conta: ");
        label4AreaCliente.setText("Titular: ");
        label5AreaCliente.setText("Valor: ");
        text1AreaCliente.setVisible(true);
        text2AreaCliente.setVisible(true);
        text3AreaCliente.setVisible(true);
        text4AreaCliente.setVisible(true);
        text5AreaCliente.setVisible(true);
        confirmarAreaCliente.setVisible(true);
        limparAreaCliente.setVisible(true);
        operacaoCliente = 3;
    }//GEN-LAST:event_transferenciaActionPerformed

    private void extratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratoActionPerformed
        //EXTRATO
        esconderElementosCliente();
        areaCliente.setVisible(true);
        resetLabelsCliente();
        textAreaCliente.setVisible(true);
        if (tipoConta == 1) {
            extratoPoupanca();
        }
        else if (tipoConta == 2) {
            extratoCorrente();
        }
    }//GEN-LAST:event_extratoActionPerformed

    private void voltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarClienteActionPerformed
        //VOLTAR
        voltar();
    }//GEN-LAST:event_voltarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUI().setVisible(true);
            }
        });
    }
    
    //METODOS PARA BANCO
    
    //Cria um novo banco
    private void criarBanco() {
        resetLabelsBanco();
        String nomeFantasia = textBanco.getText();
        Banco novoBanco = new Banco(nomeFantasia);
        todosOsBancos[tamanhoArrayBancos] = novoBanco;
        tamanhoArrayBancos++;
        textBanco.setText("");
    }
    
    //Tenta acessar um banco existente
    private void entrarBanco() {
        resetLabelsBanco();
        String nomeBanco = textBanco.getText();
        int i;
        boolean validaCondicao = false;
        
        if (tamanhoArrayBancos > 0) {
            for (i = 0; i < tamanhoArrayBancos; i++) {
                if (todosOsBancos[i].getNome().equals(nomeBanco)) {
                    validaCondicao = true;
                    banco = todosOsBancos[i];
                }
            }
            if (validaCondicao == true) {
                submenuBanco.setVisible(true);
            }
            else {
                msgErroBanco.setText("Banco nao encontrado");
                submenuBanco.setVisible(false);
            }
        }
        else {
            msgErroBanco.setText("Nenhum banco cadastrado");
        }
        
        textBanco.setText("");
    }
    
    //Cria uma nova agencia
    private void criarAgencia() {
        String numeroAgencia = text1submenuBanco.getText();
        String nomeFuncionario = text2submenuBanco.getText();
        String telefone = text3submenuBanco.getText();
        String email = text4submenuBanco.getText();
        Cliente funcionario = new Cliente(nomeFuncionario, telefone, email);
        Agencia novaAgencia;
        
        if (banco.buscaAgencia(Integer.parseInt(numeroAgencia)) != null) {
            msg1ErroSubmenuBanco.setText("Ja existe uma agencia com esse numero");
        }
        else {
            novaAgencia = new Agencia(Integer.parseInt(numeroAgencia), funcionario);
            banco.setAgencia(novaAgencia);
        }
        
        text1submenuBanco.setText("");
        text2submenuBanco.setText("");
        text3submenuBanco.setText("");
        text4submenuBanco.setText("");
    }
    
    //Tenta acessar uma agencia como operador
    private void entrarAgenciaOperador() {
        String numeroAgencia = text5submenuBanco.getText();
        String nomeFuncionario = text6submenuBanco.getText();
        agencia = banco.buscaAgencia(Integer.parseInt(numeroAgencia));
        
        if (agencia != null) {
            if (agencia.getFuncionario().equals(nomeFuncionario)) {
                escondeTudo();
                menuLateralOperador.setVisible(true);
                /*areaOperador.setVisible(true);*/
            }
            else {
                msg2ErroSubmenuBanco.setText("Funcionario nao encontrado");
                agencia = null;
            }
        }
        else {
            msg2ErroSubmenuBanco.setText("Agencia nao encontrada");
        }
        
        text5submenuBanco.setText("");
        text6submenuBanco.setText("");
    }
    
    //Tenta acessar uma agencia como cliente
    private void entrarAgenciaCliente() {
        String numeroAgencia = text7submenuBanco.getText();
        String nomeCliente = text8submenuBanco.getText();
        String numeroConta = text9submenuBanco.getText();
        agencia = banco.buscaAgencia(Integer.parseInt(numeroAgencia));
        
        if (agencia != null) {
            cliente = agencia.buscaCliente(nomeCliente);
            
            if (cliente != null) {
                if (radio1submenuBanco.isSelected()) {
                    contaPoupanca = cliente.buscaContaPoupanca(Integer.parseInt(numeroConta));
                    
                    if (contaPoupanca != null) {
                        escondeTudo();
                        menuLateralCliente.setVisible(true);
                        transferencia.setVisible(false);
                        tipoConta = 1;
                    }
                    else {
                        msgErroAreaOperador.setText("Conta nao encontrada");
                    }
                }
                else if (radio2submenuBanco.isSelected()) {
                    contaCorrente = cliente.buscaContaCorrente(Integer.parseInt(numeroConta));
                    
                    if (contaCorrente != null) {
                        escondeTudo();
                        menuLateralCliente.setVisible(true);
                        transferencia.setVisible(true);
                        tipoConta = 2;
                    }
                    else {
                        msgErroAreaOperador.setText("Conta nao encontrada");
                    }
                }
                else {
                    msgErroAreaOperador.setText("Escolha um tipo de conta");
                }
            }
            else {
                msg2ErroSubmenuBanco.setText("Cliente nao encontrado");
                agencia = null;
            }
        }
        else {
            msg2ErroSubmenuBanco.setText("Agencia nao encontrada");
        }
        
        text7submenuBanco.setText("");
        text8submenuBanco.setText("");
        text9submenuBanco.setText("");
        buttonGroup2.clearSelection();
    }
    
    //METODOS PARA OPERADOR
    
    //Cadastrar novo cliente
    private void cadastrarCliente() {
        String nomeCliente = text1AreaOperador.getText();
        String telefoneCliente = text2AreaOperador.getText();
        String emailCliente = text3AreaOperador.getText();
        Cliente novoCliente = new Cliente(nomeCliente, telefoneCliente, emailCliente, agencia.getNumeroAgencia());
        /*msgErroAreaOperador.setText("Cliente " + novoCliente.getNome() + " cadastrado");*/
        JOptionPane.showMessageDialog(null, "Cliente " + novoCliente.getNome() + " cadastrado");
        agencia.setCliente(novoCliente);
        resetTextOperador();
    }
    
    //Criar nova conta
    private void criarConta() {
        msgErroAreaOperador.setText("");
        String nomeCliente = text1AreaOperador.getText();
        Cliente clienteCadastro = buscaCliente(nomeCliente);
        String numeroDaConta;
        
        if (clienteCadastro != null) {
            if (radio1Operador.isSelected()) {
                numeroDaConta = "10001" + agencia.getNumeroAgencia() + agencia.getTamanhoArrayPoupanca();
                ContaPoupanca novaContaPoupanca = new ContaPoupanca(Integer.parseInt(numeroDaConta), clienteCadastro, agencia.getNumeroAgencia());
                clienteCadastro.setContaPoupanca(novaContaPoupanca);
                agencia.setContaPoupanca(novaContaPoupanca);
                /*msgErroAreaOperador.setText("Conta " + novaContaPoupanca.getNumeroConta() + " criada");*/
                JOptionPane.showMessageDialog(null, "Conta " + novaContaPoupanca.getNumeroConta() + " criada");
            }
            else if (radio2Operador.isSelected()){
                numeroDaConta = "10002" + agencia.getNumeroAgencia() + agencia.getTamanhoArrayCorrente();
                ContaCorrente novaContaCorrente = new ContaCorrente(Integer.parseInt(numeroDaConta), clienteCadastro, agencia.getNumeroAgencia());
                clienteCadastro.setContaCorrente(novaContaCorrente);
                agencia.setContaCorrente(novaContaCorrente);
                /*msgErroAreaOperador.setText("Conta " + novaContaCorrente.getNumeroConta() + " criada");*/
                JOptionPane.showMessageDialog(null, "Conta " + novaContaCorrente.getNumeroConta() + " criada");
            }
            else {
                msgErroAreaOperador.setText("Escolha um tipo de conta");
            }
        }
        else {
            msgErroAreaOperador.setText("Cliente nao encontrado");
        }
        
        buttonGroup1.clearSelection();
        resetTextOperador();
    }
    
    //Listar contas
    private void listarContas() {
        resetTextOperador();
        int i;
        int tamanhoArray;
        
        if (radio1Operador.isSelected()) {
            tamanhoArray = agencia.getTamanhoArrayPoupanca();
            
            if (tamanhoArray > 0) {
                for (i = 0; i < tamanhoArray; i++) {
                    textAreaOperador.setText(textAreaOperador.getText()
                                            + "Conta: " + agencia.getContaPoupanca(i).getNumeroConta()
                                            + "\nTitular: " + agencia.getContaPoupanca(i).getNomeTitular() + "\n\n");
                }
            }
            else {
                msgErroAreaOperador.setText(agencia.getNumeroAgencia() + " nao possui Contas Poupanca");
            }
        }
        else if (radio2Operador.isSelected()) {
            tamanhoArray = agencia.getTamanhoArrayCorrente();
            
            if (tamanhoArray > 0) {
                for (i = 0; i < tamanhoArray; i++) {
                    textAreaOperador.setText(textAreaOperador.getText()
                                            + "Conta: " + agencia.getContaCorrente(i).getNumeroConta()
                                            + "\nTitular: " + agencia.getContaCorrente(i).getNomeTitular() + "\n\n");
                }
            }
            else {
                msgErroAreaOperador.setText(agencia.getNumeroAgencia() + " nao possui Contas Corrente");
            }
        }
        else {
            msgErroAreaOperador.setText("Escolha um tipo de conta");
        }
        
        buttonGroup1.clearSelection();
    }
    
    //Listar clientes
    private void listarClientes() {
        resetTextOperador();
        int i;
        int tamanhoArray = agencia.getTamanhoArrayClientes();
        
        if (tamanhoArray > 0) {
            for (i = 0; i < tamanhoArray; i++) {
                textAreaOperador.setText(textAreaOperador.getText()
                                        + "Nome: " + agencia.getCliente(i).getNome() + "\n\n");
            }
        }
        else {
            msgErroAreaOperador.setText(agencia.getNumeroAgencia() + " nao possui clientes");
        }
        
        buttonGroup1.clearSelection();
    }
    
    //Alterar status conta
    private void alterarStatusConta() {
        String nomeTitular = text2AreaOperador.getText(); 
        Cliente retornoCliente = agencia.buscaCliente(nomeTitular);
        ContaPoupanca retornoContaPoupanca;
        ContaCorrente retornoContaCorrente;
        int numeroConta = Integer.parseInt(text1AreaOperador.getText());
        int i;
        boolean validaCondicao;
        
        if (cliente != null) {
            if (radio1Operador.isSelected()) {
                retornoContaPoupanca = retornoCliente.buscaContaPoupanca(numeroConta);
                
                if (retornoContaPoupanca != null) {
                    retornoContaPoupanca.sacar(retornoContaPoupanca.getSaldo());
                    retornoContaPoupanca.cancelarConta();
                    JOptionPane.showMessageDialog(null, "Conta " + retornoContaPoupanca.getNumeroConta() + " cancelada");
                }
                else {
                    msgErroAreaOperador.setText("Conta nao encontrada");
                }
            }
            else if (radio2Operador.isSelected()) {
                retornoContaCorrente = retornoCliente.buscaContaCorrente(numeroConta);
                
                if (retornoContaCorrente != null) {
                    retornoContaCorrente.sacar(retornoContaCorrente.getSaldo());
                    retornoContaCorrente.cancelarConta();
                    JOptionPane.showMessageDialog(null, "Conta " + retornoContaCorrente.getNumeroConta() + " cancelada");
                }
                else {
                    msgErroAreaOperador.setText("Conta nao encontrada");
                }
            }
            else {
                msgErroAreaOperador.setText("Escolha um tipo de conta");
            }
        }
        else {
            msgErroAreaOperador.setText("Conta nao encontrada");
        }
        
        resetTextOperador();
        buttonGroup1.clearSelection();
    }
    
    //METODOS PARA CLIENTE
    
    private void depositoPoupanca() {
        double valor = Double.parseDouble(text1AreaCliente.getText());
        
        contaPoupanca.depositar(valor);
        JOptionPane.showMessageDialog(null, valor + " depositado na conta " + contaPoupanca.getNumeroConta());
        
        text1AreaCliente.setText("");
    }
    
    private void depositoCorrente() {
        double valor = Double.parseDouble(text1AreaCliente.getText());
        
        contaCorrente.depositar(valor);
        JOptionPane.showMessageDialog(null, valor + " depositado na conta " + contaCorrente.getNumeroConta());
        
        text1AreaCliente.setText("");
    }
    
    private void saquePoupanca() {
        double valor = Double.parseDouble(text1AreaCliente.getText());
        
        if (contaPoupanca.getSaldo() - valor >= 0) {
            contaPoupanca.sacar(valor);
            JOptionPane.showMessageDialog(null, valor + " sacado da conta " + contaPoupanca.getNumeroConta());
        }
        else {
            msgErroAreaCliente.setText("Saldo insuficiente");
        }
        
        text1AreaCliente.setText("");
    }
    
    private void saqueCorrente() {
        double valor = Double.parseDouble(text1AreaCliente.getText());
        
        if (contaCorrente.getSaldo() - valor >= 0) {
            contaCorrente.sacar(valor);
            JOptionPane.showMessageDialog(null, valor + " sacado da conta " + contaCorrente.getNumeroConta());
        }
        else {
            msgErroAreaCliente.setText("Saldo insuficiente");
        }
        
        text1AreaCliente.setText("");
    }
    
    private void transferenciaCorrente() {
        String bancoDestino = text1AreaCliente.getText();
        int agenciaDestino = Integer.parseInt(text2AreaCliente.getText());
        int contaDestino = Integer.parseInt(text3AreaCliente.getText());
        String nomeDestino = text4AreaCliente.getText();
        double valor = Double.parseDouble(text5AreaCliente.getText());
        Banco salvaBancoDestino = null;
        Agencia salvaAgenciaDestino = null;
        ContaCorrente salvaContaDestino = null;
        Cliente salvaClienteDestino = null;
        int i;
        
        if (contaCorrente.getSaldo() - valor >= 0) {
            for (i = 0; i < tamanhoArrayBancos; i++) {
                if (todosOsBancos[i].getNome().equals(bancoDestino)) {
                    salvaBancoDestino = todosOsBancos[i];
                }
            }
            
            if (salvaBancoDestino != null) {
                salvaAgenciaDestino = salvaBancoDestino.buscaAgencia(agenciaDestino);
                
                if (salvaAgenciaDestino != null) {
                    salvaClienteDestino = salvaAgenciaDestino.buscaCliente(nomeDestino);
                    
                    if (salvaClienteDestino != null) {
                        salvaContaDestino = salvaClienteDestino.buscaContaCorrente(contaDestino);
                        
                        if (salvaContaDestino != null) {
                            contaCorrente.sacar(valor);
                            salvaContaDestino.depositar(valor);
                            JOptionPane.showMessageDialog(null, valor + " transferido para a conta " + salvaContaDestino.getNumeroConta() + " do banco " + salvaBancoDestino.getNome());
                        }
                        else {
                            msgErroAreaCliente.setText("Conta " + contaDestino + " destino nao encontrada");
                        }
                    }
                    else {
                        msgErroAreaCliente.setText("Cliente " + nomeDestino + " destino nao encontrado");
                    }
                }
                else {
                    msgErroAreaCliente.setText("Agencia " + agenciaDestino + " destino nao encontrada");
                }
            }
            else {
                msgErroAreaCliente.setText("Banco " + bancoDestino + " destino nao encontrado");
            }
        }
        else {
            msgErroAreaOperador.setText("Saldo insuficiente");
        }
        
        text1AreaCliente.setText("");
    }
    
    private void extratoPoupanca() {
        textAreaCliente.setText("Saldo: " + contaPoupanca.getSaldo());
    }
    
    private void extratoCorrente() {
        textAreaCliente.setText("Saldo: " + contaCorrente.getSaldo());
    }
    
    //METODOS GENERICOS
    private Cliente buscaCliente(String nomeCliente) {
        Cliente clienteEncontrado = null;
        int tamanhoArrayClientes = agencia.getTamanhoArrayClientes();
        int i;
        String numeroDaConta;
        
        if (tamanhoArrayClientes > 0) {
            for (i = 0; i < tamanhoArrayClientes; i++) {
                if (agencia.getCliente(i).getNome().equals(nomeCliente)) {
                    clienteEncontrado = agencia.getCliente(i);
                }
            }
        }
        else {
            msgErroAreaOperador.setText("Agencia " + agencia.getNumeroAgencia() + " nao possui clientes");
        }
        
        return clienteEncontrado;
    }
    
    private void voltar() {
        areaOperador.setVisible(false);
        areaCliente.setVisible(false);
        menuLateralOperador.setVisible(false);
        menuLateralCliente.setVisible(false);
        menuLateralPrincipal.setVisible(true);
    }
    
    //METODOS PARA LIMPAR UI
    
    //Esconde os painels
    private void escondeTudo() {
        menuLateralPrincipal.setVisible(false);
        menuLateralOperador.setVisible(false);
        menuLateralCliente.setVisible(false);
        submenuBanco.setVisible(false);
        areaBanco.setVisible(false);
        areaOperador.setVisible(false);
        areaCliente.setVisible(false);
    }
    
    //Apaga o conteudo das labels banco
    private void resetLabelsBanco() {
        msgErroBanco.setText("");
        msg1ErroSubmenuBanco.setText("");
        msg2ErroSubmenuBanco.setText("");
        msg3ErroSubmenuBanco.setText("");
    }
    
    //Esconde os elementos, como botoes e labels
    private void esconderElementosOperador() {
        msgErroAreaOperador.setText("");
        text1AreaOperador.setVisible(false);
        text2AreaOperador.setVisible(false);
        text3AreaOperador.setVisible(false);
        text4AreaOperador.setVisible(false);
        text5AreaOperador.setVisible(false);
        confirmarAreaOperador.setVisible(false);
        limparAreaOperador.setVisible(false);
        textAreaOperador.setVisible(false);
        radio1Operador.setVisible(false);
        radio2Operador.setVisible(false);
    }
    
    //Apaga o conteudo dos labels operador
    private void resetLabelsOperador() {
        label1AreaOperador.setText("");
        label2AreaOperador.setText("");
        label3AreaOperador.setText("");
        label4AreaOperador.setText("");
        label5AreaOperador.setText("");
    }
    
    //Apaga o conteudo dos campos de texto operador
    private void resetTextOperador() {
        text1AreaOperador.setText("");
        text2AreaOperador.setText("");
        text3AreaOperador.setText("");
        text4AreaOperador.setText("");
        text5AreaOperador.setText("");
        textAreaOperador.setText("");
    }
    
    //Esconde os elementos, como botoes e labels
    private void esconderElementosCliente() {
        msgErroAreaCliente.setText("");
        text1AreaCliente.setVisible(false);
        text2AreaCliente.setVisible(false);
        text3AreaCliente.setVisible(false);
        text4AreaCliente.setVisible(false);
        text5AreaCliente.setVisible(false);
        confirmarAreaCliente.setVisible(false);
        limparAreaCliente.setVisible(false);
        textAreaCliente.setVisible(false);
        radio1Cliente.setVisible(false);
        radio2Cliente.setVisible(false);
    }
    
    //Apaga o conteudo dos labels operador
    private void resetLabelsCliente() {
        label1AreaCliente.setText("");
        label2AreaCliente.setText("");
        label3AreaCliente.setText("");
        label4AreaCliente.setText("");
        label5AreaCliente.setText("");
    }
    
    //Apaga o conteudo dos campos de texto operador
    private void resetTextCliente() {
        text1AreaCliente.setText("");
        text2AreaCliente.setText("");
        text3AreaCliente.setText("");
        text4AreaCliente.setText("");
        text5AreaCliente.setText("");
        textAreaCliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarStatusConta;
    private javax.swing.JPanel areaBanco;
    private javax.swing.JPanel areaCliente;
    private javax.swing.JPanel areaGeral;
    private javax.swing.JPanel areaOperador;
    private javax.swing.JPanel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JButton confimar3submenuBanco;
    private javax.swing.JButton confirmar1submenuBanco;
    private javax.swing.JButton confirmar2submenuBanco;
    private javax.swing.JButton confirmarAreaCliente;
    private javax.swing.JButton confirmarAreaOperador;
    private javax.swing.JButton confirmarBanco;
    private javax.swing.JButton criarBanco;
    private javax.swing.JButton criarConta;
    private javax.swing.JButton deposito;
    private javax.swing.JButton entrarBanco;
    private javax.swing.JButton extrato;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label1AreaCliente;
    private javax.swing.JLabel label1AreaOperador;
    private javax.swing.JLabel label1Banco;
    private javax.swing.JLabel label1submenuBanco;
    private javax.swing.JLabel label2AreaCliente;
    private javax.swing.JLabel label2AreaOperador;
    private javax.swing.JLabel label2submenuBanco;
    private javax.swing.JLabel label3AreaCliente;
    private javax.swing.JLabel label3AreaOperador;
    private javax.swing.JLabel label3submenuBanco;
    private javax.swing.JLabel label4AreaCliente;
    private javax.swing.JLabel label4AreaOperador;
    private javax.swing.JLabel label4submenuBanco;
    private javax.swing.JLabel label5AreaCliente;
    private javax.swing.JLabel label5AreaOperador;
    private javax.swing.JLabel label5submenuBanco;
    private javax.swing.JLabel label6submenuBanco;
    private javax.swing.JLabel label7submenuBanco;
    private javax.swing.JLabel label8submenuBanco;
    private javax.swing.JLabel label9submenuBanco;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JButton limpar1submenuBanco;
    private javax.swing.JButton limpar2submenuBanco;
    private javax.swing.JButton limpar3submenuBanco;
    private javax.swing.JButton limparAreaCliente;
    private javax.swing.JButton limparAreaOperador;
    private javax.swing.JButton limparBanco;
    private javax.swing.JButton listarClientes;
    private javax.swing.JButton listarContas;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel menuLateralCliente;
    private javax.swing.JPanel menuLateralOperador;
    private javax.swing.JPanel menuLateralPrincipal;
    private javax.swing.JLabel msg1ErroSubmenuBanco;
    private javax.swing.JLabel msg2ErroSubmenuBanco;
    private javax.swing.JLabel msg3ErroSubmenuBanco;
    private javax.swing.JLabel msgErroAreaCliente;
    private javax.swing.JLabel msgErroAreaOperador;
    private javax.swing.JLabel msgErroBanco;
    private javax.swing.JRadioButton radio1Cliente;
    private javax.swing.JRadioButton radio1Operador;
    private javax.swing.JRadioButton radio1submenuBanco;
    private javax.swing.JRadioButton radio2Cliente;
    private javax.swing.JRadioButton radio2Operador;
    private javax.swing.JRadioButton radio2submenuBanco;
    private javax.swing.JButton saque;
    private javax.swing.JPanel submenuBanco;
    private javax.swing.JTextField text1AreaCliente;
    private javax.swing.JTextField text1AreaOperador;
    private javax.swing.JTextField text1submenuBanco;
    private javax.swing.JTextField text2AreaCliente;
    private javax.swing.JTextField text2AreaOperador;
    private javax.swing.JTextField text2submenuBanco;
    private javax.swing.JTextField text3AreaCliente;
    private javax.swing.JTextField text3AreaOperador;
    private javax.swing.JTextField text3submenuBanco;
    private javax.swing.JTextField text4AreaCliente;
    private javax.swing.JTextField text4AreaOperador;
    private javax.swing.JTextField text4submenuBanco;
    private javax.swing.JTextField text5AreaCliente;
    private javax.swing.JTextField text5AreaOperador;
    private javax.swing.JTextField text5submenuBanco;
    private javax.swing.JTextField text6submenuBanco;
    private javax.swing.JTextField text7submenuBanco;
    private javax.swing.JTextField text8submenuBanco;
    private javax.swing.JTextField text9submenuBanco;
    private javax.swing.JTextArea textAreaCliente;
    private javax.swing.JTextArea textAreaOperador;
    private javax.swing.JTextField textBanco;
    private javax.swing.JButton transferencia;
    private javax.swing.JButton voltarCliente;
    private javax.swing.JButton voltarOperador;
    // End of variables declaration//GEN-END:variables
}