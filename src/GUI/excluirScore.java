package GUI;

import DAO.ScoreDAO;
import Classes.Score;
import DAO.ErpDAOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class excluirScore extends javax.swing.JFrame {

    public excluirScore() {
        initComponents();
        setResizable(false); //sem tela cheia
    }

    private static ArrayList<Score> scores = new ArrayList<Score>();
    private static ArrayList<Score> scores2 = new ArrayList<Score>();
    private static DefaultListModel Valores = new DefaultListModel();
    private static ArrayList<Score> scores3 = new ArrayList<Score>();

    private static int posicao = 0;
    private static int cod = 0;

    private Score S = new Score();
    int codigo = 0;

    public void excluirConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        sair = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exclusão de score");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        jLabel4.setText("CLIQUE 1x COM O BOTÃO ESQUERDO E DEPOIS CLIQUE COM O DIREITO PARA EXCLUIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        int index, codigo, resp;
        String aux;
        index = Lista.getSelectedIndex();
        if ((evt.getModifiers() & evt.BUTTON3_MASK) != 0) { // Clique Direito 
            if (index != -1) {
                codigo = scores3.get(index).getId_score();
                resp = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o score: " + scores3.get(index).getId_score(), "Confirmar edição", 0);
                if (resp == 0) {
                    ScoreDAO cDAO = new ScoreDAO();
                    cDAO.excluir(codigo);
                    carregaLista();
                }
            }
        }    
    }//GEN-LAST:event_ListaMouseClicked

    
    
    
    
    
    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // carregaPaciente();
        carregaLista();
    }//GEN-LAST:event_formWindowOpened

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        dispose();
    }//GEN-LAST:event_sairMouseClicked

    public static void carregaLista() {
    Lista.removeAll();
    if (posicao != -1) {
        ScoreDAO PCDAO = new ScoreDAO();
       scores3 = PCDAO.listar();
        Valores.clear();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < scores3.size(); i++) {
            String dataFormatada = dateFormat.format(scores3.get(i).getData());
            Valores.addElement("ID: "+ scores3.get(i).getId_score() +" | Data: " + dataFormatada + " | score: " + scores3.get(i).getScore());
        }
        
        Lista.setModel(Valores);
    }
}

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JList<String> Lista;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton sair;
    // End of variables declaration//GEN-END:variables
}
