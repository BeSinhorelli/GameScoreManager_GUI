package DAO;

import Classes.ScorePlayerJogo;
import Conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;

public class ScorePlayerJogoDAO {

    private Connection conn;

    public ScorePlayerJogoDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro ao estabelecer conexão com o banco: " + e.getMessage());
        }
    }
    public ArrayList<ScorePlayerJogo> listarTodos() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList<ScorePlayerJogo> listaScores = new ArrayList<>();

        try {
            // Consulta SQL para listar todos os registros da tabela score
            String SQL = "SELECT id_score, id_game, id_player, score, data FROM score";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idScore = rs.getInt("id_score");
                int idGame = rs.getInt("id_game");
                int idPlayer = rs.getInt("id_player");
                int score = rs.getInt("score");
                Date data = rs.getDate("data");
                ScorePlayerJogo scorePlayer = new ScorePlayerJogo(idScore, idGame, idPlayer, score, data);
                listaScores.add(scorePlayer);
            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar scores: " + sqle.getMessage());
        } finally {
            Conexao.close(connL, ps);
        }

        return listaScores;
    }
}
