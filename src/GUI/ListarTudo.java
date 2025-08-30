package GUI;

import DAO.ScorePlayerJogoDAO;
import Classes.ScorePlayerJogo;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListarTudo extends javax.swing.JFrame {

    private ArrayList<ScorePlayerJogo> scoresList = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ListarTudo() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); // Centralizar a janela
        configureList();
    }

    private void configureList() {
        Lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Adicionar listener para seleção
        Lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = Lista.getSelectedIndex();
                    if (selectedIndex != -1) {
                        // Pode adicionar funcionalidade aqui quando um item é selecionado
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        jLabelContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Completa de Scores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("LISTAGEM COMPLETA DE SCORES");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 15, 0));

        Lista.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 10));

        btnDetalhes.setText("Ver Detalhes");
        btnDetalhes.setEnabled(false);
        btnDetalhes.setToolTipText("Ver detalhes do score selecionado");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });
        jPanel2.add(btnDetalhes);


        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("Atualizar a lista de scores");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualizar);


        btnSair.setText("Sair");
        btnSair.setToolTipText("Fechar a janela");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair);

        jLabelContador.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelContador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelContador.setText("0 registros encontrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jLabelContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        carregarLista();
    }                                 

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {                                   
        if (evt.getClickCount() == 2) { // Duplo clique
            exibirDetalhes();
        }
    }                                  

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
    }                                       

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        carregarLista();
        JOptionPane.showMessageDialog(this, "Lista atualizada com sucesso!", "Atualização", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }                                            

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        exibirDetalhes();
    }                                           

    private void carregarLista() {
        try {
            ScorePlayerJogoDAO scoreDAO = new ScorePlayerJogoDAO();
            scoresList = scoreDAO.listarTodos();
            listModel.clear();
            
            if (scoresList.isEmpty()) {
                listModel.addElement("Nenhum score encontrado.");
                btnDetalhes.setEnabled(false);
            } else {
                for (ScorePlayerJogo score : scoresList) {
                    String dataFormatada = dateFormat.format(score.getData());
                    String item = String.format("ID Score: %-4d | ID Jogo: %-4d | ID Player: %-4d | Data: %-10s | Score: %-4d",
                            score.getId_score(), score.getId_game(), score.getId_player(), 
                            dataFormatada, score.getScore());
                    listModel.addElement(item);
                }
                btnDetalhes.setEnabled(true);
            }
            
            Lista.setModel(listModel);
            atualizarContador();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar scores: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            listModel.clear();
            listModel.addElement("Erro ao carregar dados.");
            btnDetalhes.setEnabled(false);
        }
    }
    
    private void atualizarContador() {
        int count = scoresList.size();
        jLabelContador.setText(count + " registro(s) encontrado(s)");
    }
    
    private void exibirDetalhes() {
        int selectedIndex = Lista.getSelectedIndex();
        if (selectedIndex == -1 || scoresList.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Selecione um item para ver os detalhes.", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ScorePlayerJogo scoreSelecionado = scoresList.get(selectedIndex);
        String detalhes = String.format(
            "DETALHES DO SCORE:\n\n" +
            "ID do Score: %d\n" +
            "ID do Jogo: %d\n" +
            "ID do Player: %d\n" +
            "Data: %s\n" +
            "Score: %d\n",
            scoreSelecionado.getId_score(),
            scoreSelecionado.getId_game(),
            scoreSelecionado.getId_player(),
            dateFormat.format(scoreSelecionado.getData()),
            scoreSelecionado.getScore()
        );
        
        JOptionPane.showMessageDialog(this, detalhes, "Detalhes do Score", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}