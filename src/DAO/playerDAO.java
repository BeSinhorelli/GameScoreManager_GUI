package DAO;

import Conexao.Conexao;
import Classes.Player;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class playerDAO {

    private Connection conn;

    public playerDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro ao estabelecer conexão com o banco: " + e.getMessage());
        }
    }

    public void inserir(Player p) throws ErpDAOException {
        String SQL = "INSERT INTO player (nickname, email, plataforma) VALUES (?, ?, ?)";
        
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            if (p == null) {
                throw new ErpDAOException("O objeto Player não pode ser nulo.");
            }
            ps.setString(1, p.getNickname());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getPlataforma());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir jogador: " + sqle.getMessage(), sqle);
        }
    }

    public void atualizar(Player p) throws ErpDAOException {
        String SQL = "UPDATE player SET nickname = ?, email = ?, plataforma = ? WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            if (p == null) {
                throw new ErpDAOException("O objeto Player não pode ser nulo.");
            }
            ps.setString(1, p.getNickname());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getPlataforma());
            ps.setInt(4, p.getId_player());
            ps.executeUpdate();
        } catch (Exception sqle) {
            throw new ErpDAOException("Erro ao atualizar jogador: " + sqle.getMessage(), sqle);
        }
    }

    public Player procurar(int id) throws ErpDAOException {
        String SQL = "SELECT id, nickname, email, plataforma FROM player WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Player(
                        rs.getInt("id"),
                        rs.getString("nickname"),
                        rs.getString("email"),
                        rs.getString("plataforma")
                    );
                }
                return null; 
            }
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao procurar jogador: " + sqle.getMessage(), sqle);
        }
    }
public ArrayList listar() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList pacientes = new ArrayList();
        try {
            String SQL = "SELECT * FROM player ORDER BY nickname";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int Id_paciente = rs.getInt("id");
                String nome = rs.getString("nickname");
                String telefone = rs.getString("email");
                String plat = rs.getString("plataforma");
                pacientes.add(new Player(Id_paciente, nome, telefone, plat));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            Conexao.close(connL, ps);
        }

        return pacientes;
    }
   public void excluir(Player player) throws ErpDAOException {
    if (player == null) {
        throw new ErpDAOException("O objeto Player não pode ser nulo.");
    }

    String deleteScores = "DELETE FROM score WHERE id_player = ?";
    String deletePlayer = "DELETE FROM player WHERE id = ?";

    try (PreparedStatement psScores = conn.prepareStatement(deleteScores);
         PreparedStatement psPlayer = conn.prepareStatement(deletePlayer)) {

        // Exclui registros na tabela score
        psScores.setInt(1, player.getId_player());
        psScores.executeUpdate();

        // Exclui o player
        psPlayer.setInt(1, player.getId_player());
        psPlayer.executeUpdate();

    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao excluir jogador: " + e.getMessage(), e);
    }
}
}
