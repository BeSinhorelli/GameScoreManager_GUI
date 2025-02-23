package GUI;

import DAO.ScoreDAO;
import Classes.Score;
import Classes.ScorePlayerJogo;
import DAO.ErpDAOException;
import DAO.ScorePlayerJogoDAO;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class ListarTudo extends javax.swing.JFrame {

    public ListarTudo() {
        initComponents();
        setResizable(false); //sem tela cheia
    }

    private static ArrayList<ScorePlayerJogo> spj = new ArrayList<ScorePlayerJogo>();
    private static ArrayList<ScorePlayerJogo> spj2 = new ArrayList<ScorePlayerJogo>();
    private static DefaultListModel Valores = new DefaultListModel();
    private static ArrayList<ScorePlayerJogo> sjp3 = new ArrayList<ScorePlayerJogo>();

    private static int posicao = 0;
    private static int cod = 0;

    private Score P = new Score();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem ");
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

        jLabel1.setText("LISTAGEM ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked

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
        ScorePlayerJogoDAO PCDAO = new ScorePlayerJogoDAO();
        sjp3 = PCDAO.listarTodos();
        Valores.clear();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i <sjp3.size(); i++) {
            String dataFormatada = dateFormat.format(sjp3.get(i).getData());
            Valores.addElement("ID do score: "+ sjp3.get(i).getId_score()+"----ID do jogo: " + sjp3.get(i).getId_game() +"----ID do player: "+ sjp3.get(i).getId_player() +"----Data: " + dataFormatada + "----score: " + sjp3.get(i).getScore());
        }
        
        Lista.setModel(Valores);
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JList<String> Lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton sair;
    // End of variables declaration//GEN-END:variables
}
