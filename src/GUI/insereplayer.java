package GUI;

import Classes.Player;
import DAO.ErpDAOException;
import DAO.playerDAO;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class insereplayer extends javax.swing.JFrame {

    public insereplayer() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); // Centralizar a janela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroupPlataforma = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Player");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CADASTRO DE NOVO PLAYER");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 15, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Player"));
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 10, 15));

        jLabelNickname.setText("Nickname:*");
        jLabelNickname.setToolTipText("Nome de usuário do player (obrigatório)");
        jPanel2.add(jLabelNickname);

        textFieldNickname.setToolTipText("Digite o nickname do player");
        jPanel2.add(textFieldNickname);

        jLabelEmail.setText("Email:*");
        jLabelEmail.setToolTipText("Email do player (obrigatório)");
        jPanel2.add(jLabelEmail);

        textFieldEmail.setToolTipText("Digite o email do player");
        jPanel2.add(textFieldEmail);

        jLabelPlataforma.setText("Plataforma:*");
        jLabelPlataforma.setToolTipText("Selecione a plataforma do player (obrigatório)");
        jPanel2.add(jLabelPlataforma);

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

        jPanel2.add(jPanelPlataformas);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        btnOk.setText("Cadastrar");
        btnOk.setToolTipText("Cadastrar novo player");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel3.add(btnOk);

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar operação");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (!validarCampos()) {
            return;
        }
        
        Player player = new Player();
        player.setNickname(textFieldNickname.getText().trim());
        player.setEmail(textFieldEmail.getText().trim().toLowerCase());
        player.setPlataforma(obterPlataformaSelecionada());
        
        try {
            playerDAO playerDAO = new playerDAO();
            playerDAO.inserir(player);
            
            JOptionPane.showMessageDialog(this, 
                "Player cadastrado com sucesso!\n\n" +
                "Nickname: " + player.getNickname() + "\n" +
                "Email: " + player.getEmail() + "\n" +
                "Plataforma: " + player.getPlataforma(), 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            limparCampos();
            
        } catch (ErpDAOException ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao cadastrar player: " + ex.getMessage(), 
                "Erro no Cadastro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                     

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int confirmacao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente cancelar? Todas as informações não salvas serão perdidas.",
            "Confirmar Cancelamento",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            dispose();
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
    
    private void limparCampos() {
        textFieldNickname.setText("");
        textFieldEmail.setText("");
        buttonGroupPlataforma.clearSelection();
        textFieldNickname.requestFocus();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroupPlataforma;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNickname;
    private javax.swing.JLabel jLabelPlataforma;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPlataformas;
    private javax.swing.JRadioButton radioNintendo;
    private javax.swing.JRadioButton radioPC;
    private javax.swing.JRadioButton radioPlaystation;
    private javax.swing.JRadioButton radioXbox;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNickname;
    // End of variables declaration                   
}