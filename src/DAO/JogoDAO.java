package DAO;

import Classes.Jogo;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JogoDAO {

    private Connection conn;

    public JogoDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
    }

    public ArrayList<Jogo> listar() {
        String SQL = "SELECT * FROM jogo ORDER BY nome;";
        ArrayList<Jogo> dados = new ArrayList<>();

        try (PreparedStatement ps = this.conn.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int ID = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                dados.add(new Jogo(ID, nome, tipo));
            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar jogos: " + sqle.getMessage());
        }
        return dados;
    }

    public void inserir(Jogo game) {
        if (game == null) {
            System.out.println("O objeto jogo não pode ser nulo.");
            return;
        }

        String SQL = "INSERT INTO jogo (codigo, nome, tipo) VALUES (?, ?, ?);";

        try (PreparedStatement ps = this.conn.prepareStatement(SQL)) {
            ps.setInt(1, game.getId_game());
            ps.setString(2, game.getNome());
            ps.setString(3, game.getTipo());
            ps.executeUpdate();
            System.out.println("Jogo inserido com sucesso!");
        } catch (SQLException sqle) {
            System.out.println("Erro ao inserir jogo: " + sqle.getMessage());
        }
    }

    public Jogo procurar(int codigo) {
        String SQL = "SELECT codigo, nome, tipo FROM jogo WHERE codigo = ?;";
        Jogo game = null;

        try (PreparedStatement ps = this.conn.prepareStatement(SQL)) {
            ps.setInt(1, codigo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int ID = rs.getInt("codigo");
                    String nome = rs.getString("nome");
                    String tipo = rs.getString("tipo");
                    game = new Jogo(ID, nome, tipo);
                }
            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao procurar jogo: " + sqle.getMessage());
        }
        return game;
    }
 public void excluir(Jogo player) throws ErpDAOException {
    if (player == null) {
        throw new ErpDAOException("O objeto Player não pode ser nulo.");
    }

    String deleteScores = "DELETE FROM score WHERE id_game = ?";
    String deletePlayer = "DELETE FROM jogo WHERE codigo = ?";

    try (PreparedStatement psScores = conn.prepareStatement(deleteScores);
         PreparedStatement psPlayer = conn.prepareStatement(deletePlayer)) {
        psScores.setInt(1, player.getId_game());
        psScores.executeUpdate();
        psPlayer.setInt(1, player.getId_game());
        psPlayer.executeUpdate();

    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao excluir: " + e.getMessage(), e);
    }
}


    public void atualizar(Jogo game) {
        if (game == null) {
            System.out.println("O objeto jogo não pode ser nulo.");
            return;
        }

        String SQL = "UPDATE jogo SET nome = ?, tipo = ? WHERE codigo = ?;";

        try (PreparedStatement ps = this.conn.prepareStatement(SQL)) {
            ps.setString(1, game.getNome());
            ps.setString(2, game.getTipo());
            ps.setInt(3, game.getId_game());
            ps.executeUpdate();
            System.out.println("Jogo atualizado com sucesso!");
        } catch (SQLException sqle) {
            System.out.println("Erro ao atualizar jogo: " + sqle.getMessage());
        }
    }
}
