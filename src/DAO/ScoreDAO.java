/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Score;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ScoreDAO {

    private Connection conn;

    public ScoreDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Score> listarTodos() {
        ArrayList<Score> scores = new ArrayList<>();

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM Score";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Executando consulta no banco de dados...");

            while (rs.next()) {
                Score score = new Score();
                score.setId_score(rs.getInt("id_score"));
                Date date = rs.getDate("data");
                if (date != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    dateFormat.format(date); 
                    score.setData(date);
                } else {
                   JOptionPane.showMessageDialog(null, "erro");
                }
                score.setScore(rs.getInt("score"));

                System.out.println("Registro lido: ID = " + score.getId_score()
                        + ", Data = " + score.getData()
                        + ", Score = " + score.getScore());

                scores.add(score);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao consultar os dados: " + e.getMessage());
        }

        return scores;
    }

    public ArrayList<Score> listar() {
        ArrayList<Score> lista = new ArrayList<>();
        String sql = "SELECT id_score, data, score FROM score";
        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id_score");
                Date data = rs.getDate("data");
                int score = rs.getInt("score");
                Score s = new Score(id, data, score);
                lista.add(s);
                System.out.println("Listando: " + s);
            }
        } catch (SQLException e) {
            System.out.println("Erro no listar: " + e.getMessage());
        }
        return lista;
    }

 public Score procurar2(int codigo) {
    Score s = null;
    String sql = "SELECT id_score, data, score FROM score WHERE id_score = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, codigo);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int id = rs.getInt("id_score");
                Date data = rs.getDate("data");
                int scoreValor = rs.getInt("score");
                s = new Score(id, data, scoreValor);
                System.out.println("Encontrado em procurar2: " + s);
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro no procurar2: " + e.getMessage());
    }
    return s;
}


    public void inserir(Score consulta) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (consulta == null) {
            throw new ErpDAOException("O objeto player não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO score(id_game, id_player, score, data) "
                    + "values (?,?,?,?);";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);

            ps.setInt(1, consulta.getId_game());

            ps.setInt(2, consulta.getId_player());

            java.util.Date dataJAVA = consulta.getData();  
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); 
            ps.setDate(4, dataSQL);  
            ps.setInt(3, consulta.getScore());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir um novo score " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }//fim inserir

    public void excluir(int codigo) {
        PreparedStatement ps = null;

        try {
            String SQL = "DELETE FROM score WHERE id_score = ?;";
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            System.out.println("Score excluído com sucesso.");
        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir score: " + sqle.getMessage());
        } finally {
            Conexao.close(conn, ps);
        }
    }

    public Score procurar(int codigo) {
        Score consulta = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT id_score, id_game, id_player, data, score FROM score WHERE id_score = ?";
            ps = this.conn.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) { 
                int ID = rs.getInt("id_score");
                int id_game = rs.getInt("id_game");
                int id_player = rs.getInt("id_player");
                Date data = rs.getDate("data");
                int score = rs.getInt("score");
                consulta = new Score(ID, id_game, id_player, data, score);
            }
        } catch (SQLException e) {
            System.out.print("Erro ao procurar o score: " + e);
        } finally {
            Conexao.close(null, ps);
        }
        return consulta;
    }

    public void atualizar(Score Consultas) {
        PreparedStatement ps = null;
        Connection connL = null;

        if (Consultas == null) {
            System.out.print("O objeto score não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE score SET id_game=?, id_player=?, data=?, score=? WHERE id_score=?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, Consultas.getId_game());
            ps.setInt(2, Consultas.getId_player());
            java.util.Date dataJAVA = Consultas.getData();  // Data da classe Java Util
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(3, dataSQL);
            ps.setInt(4, Consultas.getScore());
            ps.setInt(5, Consultas.getId_score());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            System.out.print("Erro ao editar score " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }

    public void atualizar2(Score Consultas) {
        PreparedStatement ps = null;
        Connection connL = null;

        if (Consultas == null) {
            System.out.print("O objeto score não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE score SET data=?, score=? WHERE id_score=?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            java.util.Date dataJAVA = Consultas.getData();  // Data da classe Java Util
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(1, dataSQL);
            ps.setInt(2, Consultas.getScore());
            ps.setInt(3, Consultas.getId_score());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            System.out.print("Erro ao editar score " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    public ArrayList<Score> listar(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
