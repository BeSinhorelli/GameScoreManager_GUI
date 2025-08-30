package GUI;

import Classes.Player;
import DAO.ErpDAOException;
import DAO.playerDAO;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AlteraPlayer extends javax.swing.JFrame {
    private Player playerSelecionado = new Player();
    private ArrayList<Player> players = new ArrayList<>();
    
    public AlteraPlayer() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroupPlataforma = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelSelecionar = new javax.swing.JLabel();
        comboPlayers = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelNickname = new javax.swing.JLabel();
        textFieldNickname = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        jLabelPlataforma = new javax.swing.JLabel();
        jPanelPlataformas = new javax.swing.JPanel();
        radioPC = new javax.swing.JRadioButton();
        radioPlaystation = new javax.swing.JRadioButton();
        radioXbox = new javax.swing.JRadioButton();
        radioNintendo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Player");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("ALTERAÇÃO DE PLAYER");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 15, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleção do Player"));
        jPanel2.setLayout(new java.awt.BorderLayout(10, 5));

        jLabelSelecionar.setText("Selecione o Player:*");
        jLabelSelecionar.setToolTipText("Selecione o player que deseja alterar");
        jPanel2.add(jLabelSelecionar, java.awt.BorderLayout.NORTH);

        comboPlayers.setToolTipText("Lista de players disponíveis para alteração");
        comboPlayers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPlayersItemStateChanged(evt);
            }
        });
        jPanel2.add(comboPlayers, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Player"));
        jPanel3.setLayout(new java.awt.GridLayout(3, 2, 10, 15));

        jLabelNickname.setText("Nickname:*");
        jLabelNickname.setToolTipText("Nome de usuário do player (obrigatório)");
        jPanel3.add(jLabelNickname);

        textFieldNickname.setToolTipText("Digite o nickname do player");
        jPanel3.add(textFieldNickname);

        jLabelEmail.setText("Email:*");
        jLabelEmail.setToolTipText("Email do player (obrigatório)");
        jPanel3.add(jLabelEmail);

        textFieldEmail.setToolTipText("Digite o email do player");
        jPanel3.add(textFieldEmail);

        jLabelPlataforma.setText("Plataforma:*");
        jLabelPlataforma.setToolTipText("Selecione a plataforma do player (obrigatório)");
        jPanel3.add(jLabelPlataforma);

        jPanelPlataformas.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        buttonGroupPlataforma.add(radioPC);
        radioPC.setText("PC");
        radioPC.setToolTipText("Plataforma PC");
        jPanelPlataformas.add(radioPC);

        buttonGroupPlataforma.add(radioPlaystation);
        radioPlaystation.setText("Playstation");
        radioPlaystation.setToolTipText("Plataforma Playstation");
        jPanelPlataformas.add(radioPlaystation);

        buttonGroupPlataforma.add(radioXbox);
        radioXbox.setText("Xbox");
        radioXbox.setToolTipText("Plataforma Xbox");
        jPanelPlataformas.add(radioXbox);

        buttonGroupPlataforma.add(radioNintendo);
        radioNintendo.setText("Nintendo Switch");
        radioNintendo.setToolTipText("Plataforma Nintendo Switch");
        jPanelPlataformas.add(radioNintendo);

        jPanel3.add(jPanelPlataformas);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        btnSalvar.setText("Salvar Alterações");
        btnSalvar.setToolTipText("Salvar as alterações do player");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalvar);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar operação");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (comboPlayers.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, 
                "Selecione um player para alterar.", 
                "Seleção Necessária", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!validarCampos()) {
            return;
        }
        
        Player playerAtualizado = new Player();
        playerAtualizado.setId_player(playerSelecionado.getId_player());
        playerAtualizado.setNickname(textFieldNickname.getText().trim());
        playerAtualizado.setEmail(textFieldEmail.getText().trim().toLowerCase());
        playerAtualizado.setPlataforma(obterPlataformaSelecionada());
        
        try {
            playerDAO playerDAO = new playerDAO();
            playerDAO.atualizar(playerAtualizado);
            
            JOptionPane.showMessageDialog(this, 
                "Player atualizado com sucesso!\n\n" +
                "ID: " + playerAtualizado.getId_player() + "\n" +
                "Nickname: " + playerAtualizado.getNickname() + "\n" +
                "Email: " + playerAtualizado.getEmail() + "\n" +
                "Plataforma: " + playerAtualizado.getPlataforma(), 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Recarregar a lista de players após alteração
            carregarComboPlayers();
            
        } catch (ErpDAOException ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao atualizar player: " + ex.getMessage(), 
                "Erro na Atualização", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int confirmacao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente cancelar? Todas as alterações não salvas serão perdidas.",
            "Confirmar Cancelamento",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            dispose();
        }
    }                                           

    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
        carregarComboPlayers();
    }                                   

    private void comboPlayersItemStateChanged(java.awt.event.ItemEvent evt) {                                              
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            int selectedIndex = comboPlayers.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < players.size()) {
                playerSelecionado = players.get(selectedIndex);
                carregarDadosPlayer();
            }
        }
    }                                             
    
    private void carregarComboPlayers() {
        try {
            playerDAO playerDAO = new playerDAO();
            players = playerDAO.listar();
            comboPlayers.removeAllItems();
            
            if (players.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Nenhum player cadastrado para alteração.", 
                    "Informação", 
                    JOptionPane.INFORMATION_MESSAGE);
                dispose();
                return;
            }
            
            for (Player player : players) {
                comboPlayers.addItem(player.getId_player() + " - " + player.getNickname());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar players: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void carregarDadosPlayer() {
        textFieldNickname.setText(playerSelecionado.getNickname());
        textFieldEmail.setText(playerSelecionado.getEmail());
        
        // Selecionar a plataforma correta
        buttonGroupPlataforma.clearSelection();
        String plataforma = playerSelecionado.getPlataforma();
        
        if ("PC".equalsIgnoreCase(plataforma)) {
            radioPC.setSelected(true);
        } else if ("Playstation".equalsIgnoreCase(plataforma)) {
            radioPlaystation.setSelected(true);
        } else if ("Xbox".equalsIgnoreCase(plataforma)) {
            radioXbox.setSelected(true);
        } else if ("Nintendo Switch".equalsIgnoreCase(plataforma)) {
            radioNintendo.setSelected(true);
        }
    }
    
    private boolean validarCampos() {
        // Validar nickname
        String nickname = textFieldNickname.getText().trim();
        if (nickname.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, informe o nickname do player.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            textFieldNickname.requestFocus();
            return false;
        }
        
        if (nickname.length() < 3) {
            JOptionPane.showMessageDialog(this, 
                "O nickname deve ter pelo menos 3 caracteres.", 
                "Nickname Inválido", 
                JOptionPane.WARNING_MESSAGE);
            textFieldNickname.requestFocus();
            textFieldNickname.selectAll();
            return false;
        }
        
        // Validar email
        String email = textFieldEmail.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, informe o email do player.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            textFieldEmail.requestFocus();
            return false;
        }
        
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, informe um email válido.\nExemplo: usuario@provedor.com", 
                "Email Inválido", 
                JOptionPane.WARNING_MESSAGE);
            textFieldEmail.requestFocus();
            textFieldEmail.selectAll();
            return false;
        }
        
        // Validar plataforma
        if (!radioPC.isSelected() && !radioPlaystation.isSelected() && 
            !radioXbox.isSelected() && !radioNintendo.isSelected()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, selecione uma plataforma.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private boolean validarEmail(String email) {
        // Regex simples para validação de email
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    private String obterPlataformaSelecionada() {
        if (radioPC.isSelected()) return "PC";
        if (radioPlaystation.isSelected()) return "Playstation";
        if (radioXbox.isSelected()) return "Xbox";
        if (radioNintendo.isSelected()) return "Nintendo Switch";
        return "";
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroupPlataforma;
    private javax.swing.JComboBox<String> comboPlayers;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNickname;
    private javax.swing.JLabel jLabelPlataforma;
    private javax.swing.JLabel jLabelSelecionar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPlataformas;
    private javax.swing.JRadioButton radioNintendo;
    private javax.swing.JRadioButton radioPC;
    private javax.swing.JRadioButton radioPlaystation;
    private javax.swing.JRadioButton radioXbox;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNickname;
    // End of variables declaration                   
}