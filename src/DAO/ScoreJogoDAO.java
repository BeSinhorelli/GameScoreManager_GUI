package DAO;

import Classes.Jogo;
import Conexao.Conexao;
import Classes.ScoreJogo;
import Classes.Score;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class ScoreJogoDAO {

    private Connection conn;

    public ScoreJogoDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + ":\n" + e.getMessage());
        }
    }

    public ArrayList listar(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList MedicosCon = new ArrayList();

        try {
            String SQL = "SELECT jogo.nome,score.data,score.score FROM jogo, score WHERE jogo.codigo=score.id_game and jogo.codigo = ?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, Integer.toString(codigo));
            rs = ps.executeQuery();

            while (rs.next()) {

                String nome = rs.getString("nome");
                int score = rs.getInt("score");
                Date date = rs.getDate("data");
                MedicosCon.add(new ScoreJogo(nome, score, date));

            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar Score " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
        return MedicosCon;
    }

    public ArrayList listarmed(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList MedicosCon = new ArrayList();

        try {
            String SQL = "SELECT player.nickname, jogo.nome,score.data,score.score FROM player, jogo, score WHERE player.id = score.id_player and jogo.codigo=score.id_game and jogo.codigo = ?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, Integer.toString(codigo));
            rs = ps.executeQuery();

            while (rs.next()) {

                String nick = rs.getString("nickname");
                String nome = rs.getString("nome");
                Date date = rs.getDate("data");
                int score = rs.getInt("score");

                MedicosCon.add(new ScoreJogo(nick, nome, date, score));

            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
        return MedicosCon;
    }

    public ArrayList listarpordata(java.util.Date data) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList MedicosCon = new ArrayList();

        try {
            String SQL = "SELECT player.nickname, jogo.nome, score.data,score.score FROM player, jogo, score WHERE player.id = score.id_player and jogo.codigo=score.id_game and score.data = ?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            java.util.Date dataJAVA = data;
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(1, dataSQL);
            rs = ps.executeQuery();
            while (rs.next()) {

                String nick = rs.getString("nick");
                String nome = rs.getString("nome");

                Date date = rs.getDate("data");
                int score = rs.getInt("score");

                MedicosCon.add(new ScoreJogo(nick, nome, date, score));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            Conexao.close(connL, ps);
        }

        return MedicosCon;
    }//fim listar

    public Jogo procura(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        Jogo MedicosCon = new Jogo();

        try {
            String SQL = "SELECT jogo.nome ,jogo.codigo ,score.data,score.score FROM jogo, score WHERE jogo.codigo=score.id_game and score.id_score = ?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, Integer.toString(codigo));
            rs = ps.executeQuery();

            while (rs.next()) {

                String nome_med = rs.getString("nome");
                int id = rs.getInt("codigo");
                Date date = rs.getDate("data");
                int score = rs.getInt("score");
                MedicosCon.setNome(nome_med);
                MedicosCon.setId_game(id);

            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar scores " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
        return MedicosCon;
    }

}
