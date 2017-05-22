package view;

import java.util.ArrayList;
import model.*;
import controller.*;
import java.awt.Component;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public final class MainInterface extends javax.swing.JFrame {
    
    public MainInterface() {
        initComponents();
        showPanel(null);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ListClientPN = new javax.swing.JPanel();
        LCTitle = new javax.swing.JLabel();
        LCTableScroll = new javax.swing.JScrollPane();
        LCTable = new ClientTable();
        HelpPN = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RegClientPN = new javax.swing.JPanel();
        RCTitle = new javax.swing.JLabel();
        RCName = new javax.swing.JLabel();
        RCButton = new javax.swing.JButton();
        RCNameInput = new javax.swing.JTextField();
        RCEmail = new javax.swing.JLabel();
        RCEmailInput = new javax.swing.JTextField();
        RCCpf = new javax.swing.JLabel();
        RCCpfInput = new javax.swing.JTextField();
        RCData = new javax.swing.JLabel();
        RCDataInput = new javax.swing.JTextField();
        RCAddress = new javax.swing.JLabel();
        RCAddressInput = new javax.swing.JTextField();
        RCComplement = new javax.swing.JLabel();
        RCComplementInput = new javax.swing.JTextField();
        RCCep = new javax.swing.JLabel();
        RCCepInput = new javax.swing.JTextField();
        RCReference = new javax.swing.JLabel();
        RCReferenceInput = new javax.swing.JTextField();
        ListOrderPN = new javax.swing.JPanel();
        LOTitle = new javax.swing.JLabel();
        LOTableScroll = new javax.swing.JScrollPane();
        LOTable = new javax.swing.JTable();
        ListDishPN = new javax.swing.JPanel();
        LDTitle = new javax.swing.JLabel();
        LDTableScroll = new javax.swing.JScrollPane();
        LDTable = new javax.swing.JTable();
        ListIngrePN = new javax.swing.JPanel();
        LITitle = new javax.swing.JLabel();
        LiTableScroll = new javax.swing.JScrollPane();
        LITable = new IngreTable();
        Menu = new javax.swing.JMenuBar();
        ClientMenu = new javax.swing.JMenu();
        NewClientMI = new javax.swing.JMenuItem();
        ClientListMI = new javax.swing.JMenuItem();
        OrderMenu = new javax.swing.JMenu();
        OrderListMI = new javax.swing.JMenuItem();
        DishMenu = new javax.swing.JMenu();
        DishListMI = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        NewIngreMI = new javax.swing.JMenuItem();
        IngreListMI = new javax.swing.JMenuItem();
        AboutMenu = new javax.swing.JMenu();
        HelpMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 480));

        MainPanel.setLayout(new java.awt.CardLayout());

        LCTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LCTitle.setText("Lista de Clientes");

        LCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LCTable.getTableHeader().setReorderingAllowed(false);
        LCTableScroll.setViewportView(LCTable);

        javax.swing.GroupLayout ListClientPNLayout = new javax.swing.GroupLayout(ListClientPN);
        ListClientPN.setLayout(ListClientPNLayout);
        ListClientPNLayout.setHorizontalGroup(
            ListClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LCTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(ListClientPNLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(LCTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListClientPNLayout.setVerticalGroup(
            ListClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListClientPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LCTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LCTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );

        MainPanel.add(ListClientPN, "card2");

        jLabel3.setText("New Game Panel");

        javax.swing.GroupLayout HelpPNLayout = new javax.swing.GroupLayout(HelpPN);
        HelpPN.setLayout(HelpPNLayout);
        HelpPNLayout.setHorizontalGroup(
            HelpPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        HelpPNLayout.setVerticalGroup(
            HelpPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        MainPanel.add(HelpPN, "card2");

        RCTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RCTitle.setText("Cadastro Cliente");

        RCName.setText("Nome:");

        RCButton.setText("CADASTRAR");
        RCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCButtonActionPerformed(evt);
            }
        });

        RCNameInput.setToolTipText("");

        RCEmail.setText("Email:");

        RCEmailInput.setToolTipText("");

        RCCpf.setText("CPF:");

        RCCpfInput.setToolTipText("");

        RCData.setText("Telefone:");

        RCDataInput.setToolTipText("");

        RCAddress.setText("Endereço:");

        RCAddressInput.setToolTipText("");
        RCAddressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCAddressInputActionPerformed(evt);
            }
        });

        RCComplement.setText("Complemento");

        RCComplementInput.setToolTipText("");

        RCCep.setText("CEP:");

        RCCepInput.setToolTipText("");

        RCReference.setText("Referência:");

        RCReferenceInput.setToolTipText("");

        javax.swing.GroupLayout RegClientPNLayout = new javax.swing.GroupLayout(RegClientPN);
        RegClientPN.setLayout(RegClientPNLayout);
        RegClientPNLayout.setHorizontalGroup(
            RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegClientPNLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(RCCpf)
                                .addComponent(RCCpfInput, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(RCName)
                                .addComponent(RCAddress)
                                .addComponent(RCAddressInput)
                                .addComponent(RCNameInput))
                            .addComponent(RCCepInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RCData)
                                .addComponent(RCDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RCComplement)
                                .addComponent(RCComplementInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RCEmail)
                                .addComponent(RCEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegClientPNLayout.createSequentialGroup()
                                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RCReference)
                                    .addComponent(RCReferenceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(30, 30, 30))
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCCep)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegClientPNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCTitle)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCButton)
                        .addGap(242, 242, 242))))
        );
        RegClientPNLayout.setVerticalGroup(
            RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegClientPNLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(RCTitle)
                .addGap(28, 28, 28)
                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCCpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RCAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RCComplement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCComplementInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegClientPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCCepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegClientPNLayout.createSequentialGroup()
                        .addComponent(RCReference, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCReferenceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(RCButton)
                        .addGap(71, 71, 71))))
        );

        MainPanel.add(RegClientPN, "card2");

        LOTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LOTitle.setText("Lista de Pedidos");

        LOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Data", "Valor", "Items", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LOTable.getTableHeader().setReorderingAllowed(false);
        LOTableScroll.setViewportView(LOTable);

        javax.swing.GroupLayout ListOrderPNLayout = new javax.swing.GroupLayout(ListOrderPN);
        ListOrderPN.setLayout(ListOrderPNLayout);
        ListOrderPNLayout.setHorizontalGroup(
            ListOrderPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(ListOrderPNLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(LOTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListOrderPNLayout.setVerticalGroup(
            ListOrderPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOrderPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LOTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LOTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );

        MainPanel.add(ListOrderPN, "card2");

        LDTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LDTitle.setText("Lista de Produtos");

        LDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Preço", "Ingredientes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LDTable.getTableHeader().setReorderingAllowed(false);
        LDTableScroll.setViewportView(LDTable);

        javax.swing.GroupLayout ListDishPNLayout = new javax.swing.GroupLayout(ListDishPN);
        ListDishPN.setLayout(ListDishPNLayout);
        ListDishPNLayout.setHorizontalGroup(
            ListDishPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LDTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(ListDishPNLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(LDTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListDishPNLayout.setVerticalGroup(
            ListDishPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListDishPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LDTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LDTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );

        MainPanel.add(ListDishPN, "card2");

        LITitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LITitle.setText("Lista de Ingredientes");

        LITable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Calorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LITable.getTableHeader().setReorderingAllowed(false);
        LiTableScroll.setViewportView(LITable);

        javax.swing.GroupLayout ListIngrePNLayout = new javax.swing.GroupLayout(ListIngrePN);
        ListIngrePN.setLayout(ListIngrePNLayout);
        ListIngrePNLayout.setHorizontalGroup(
            ListIngrePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LiTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(ListIngrePNLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(LITitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ListIngrePNLayout.setVerticalGroup(
            ListIngrePNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListIngrePNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LITitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LiTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );

        MainPanel.add(ListIngrePN, "card2");

        ClientMenu.setText("Cliente");

        NewClientMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewClientMI.setText("Novo Cliente");
        NewClientMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewClientMIActionPerformed(evt);
            }
        });
        ClientMenu.add(NewClientMI);

        ClientListMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ClientListMI.setText("Lista Clientes");
        ClientListMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientListMIActionPerformed(evt);
            }
        });
        ClientMenu.add(ClientListMI);

        Menu.add(ClientMenu);

        OrderMenu.setText("Pedido");

        OrderListMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        OrderListMI.setText("Lista Pedidos");
        OrderListMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderListMIActionPerformed(evt);
            }
        });
        OrderMenu.add(OrderListMI);

        Menu.add(OrderMenu);

        DishMenu.setText("Pratos");
        DishMenu.setToolTipText("");

        DishListMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        DishListMI.setText("Lista Pratos");
        DishMenu.add(DishListMI);

        Menu.add(DishMenu);

        jMenu1.setText("Ingredients");

        NewIngreMI.setText("Novo Ingrediente");
        NewIngreMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewIngreMIActionPerformed(evt);
            }
        });
        jMenu1.add(NewIngreMI);

        IngreListMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        IngreListMI.setText("Lista Ingredientes");
        IngreListMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreListMIActionPerformed(evt);
            }
        });
        jMenu1.add(IngreListMI);

        Menu.add(jMenu1);

        AboutMenu.setText("About");

        HelpMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        HelpMI.setText("Help");
        HelpMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMIActionPerformed(evt);
            }
        });
        AboutMenu.add(HelpMI);

        Menu.add(AboutMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewClientMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClientMIActionPerformed
        showPanel(RegClientPN);
    }//GEN-LAST:event_NewClientMIActionPerformed

    private void ClientListMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientListMIActionPerformed
        showPanel(ListClientPN);
        ((ClientTable)LCTable).populate();
    }//GEN-LAST:event_ClientListMIActionPerformed

    private void HelpMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMIActionPerformed
        showPanel(HelpPN);
    }//GEN-LAST:event_HelpMIActionPerformed

    private void RCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCButtonActionPerformed
        String name = RCNameInput.getText();
        String email = RCEmailInput.getText();
        String phone = RCDataInput.getText();
        String cpf = RCCpfInput.getText();
        String address = RCCepInput.getText();
        String complement = RCComplementInput.getText();
        String cep = RCCepInput.getText();
        String reference = RCReferenceInput.getText();
        
        
        Response resp = ClientController.registerClient(name, email, cpf, phone, address, complement, cep, reference);
        if(resp.success) {
            for (Component component : RegClientPN.getComponents()) {
                    if(component instanceof JLabel) {
                        ((JLabel) component).setText("");
                    }
                }
            showPanel(ListClientPN);
            ((ClientTable)LCTable).populate();
        }
        JOptionPane.showMessageDialog(null, resp.message);
    }//GEN-LAST:event_RCButtonActionPerformed

    private void RCAddressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCAddressInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RCAddressInputActionPerformed

    private void OrderListMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderListMIActionPerformed
        showPanel(ListOrderPN);   
    }//GEN-LAST:event_OrderListMIActionPerformed

    private void NewIngreMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewIngreMIActionPerformed
        String name = JOptionPane.showInputDialog("Digite o nome do ingrediente");
        String calories = JOptionPane.showInputDialog("Digite as calorias do produto");
        Response resp = IngredientController.registerIngredient(name, calories);
        if(resp.success) {
            showPanel(ListIngrePN);
            ((IngreTable)LITable).populate();
        }
        JOptionPane.showMessageDialog(null, resp.message);
    }//GEN-LAST:event_NewIngreMIActionPerformed

    private void IngreListMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreListMIActionPerformed
        showPanel(ListIngrePN);
        ((IngreTable)LITable).populate();
    }//GEN-LAST:event_IngreListMIActionPerformed

    public void showPanel(JPanel panel) {
        MainPanel.removeAll();
        if(panel != null) {
            MainPanel.add(panel);
        }
        MainPanel.revalidate();
        MainPanel.repaint();
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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenuItem ClientListMI;
    private javax.swing.JMenu ClientMenu;
    private javax.swing.JMenuItem DishListMI;
    private javax.swing.JMenu DishMenu;
    private javax.swing.JMenuItem HelpMI;
    private javax.swing.JPanel HelpPN;
    private javax.swing.JMenuItem IngreListMI;
    private javax.swing.JTable LCTable;
    private javax.swing.JScrollPane LCTableScroll;
    private javax.swing.JLabel LCTitle;
    private javax.swing.JTable LDTable;
    private javax.swing.JScrollPane LDTableScroll;
    private javax.swing.JLabel LDTitle;
    private javax.swing.JTable LITable;
    private javax.swing.JLabel LITitle;
    private javax.swing.JTable LOTable;
    private javax.swing.JScrollPane LOTableScroll;
    private javax.swing.JLabel LOTitle;
    private javax.swing.JScrollPane LiTableScroll;
    private javax.swing.JPanel ListClientPN;
    private javax.swing.JPanel ListDishPN;
    private javax.swing.JPanel ListIngrePN;
    private javax.swing.JPanel ListOrderPN;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem NewClientMI;
    private javax.swing.JMenuItem NewIngreMI;
    private javax.swing.JMenuItem OrderListMI;
    private javax.swing.JMenu OrderMenu;
    private javax.swing.JLabel RCAddress;
    private javax.swing.JTextField RCAddressInput;
    private javax.swing.JButton RCButton;
    private javax.swing.JLabel RCCep;
    private javax.swing.JTextField RCCepInput;
    private javax.swing.JLabel RCComplement;
    private javax.swing.JTextField RCComplementInput;
    private javax.swing.JLabel RCCpf;
    private javax.swing.JTextField RCCpfInput;
    private javax.swing.JLabel RCData;
    private javax.swing.JTextField RCDataInput;
    private javax.swing.JLabel RCEmail;
    private javax.swing.JTextField RCEmailInput;
    private javax.swing.JLabel RCName;
    private javax.swing.JTextField RCNameInput;
    private javax.swing.JLabel RCReference;
    private javax.swing.JTextField RCReferenceInput;
    private javax.swing.JLabel RCTitle;
    private javax.swing.JPanel RegClientPN;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
