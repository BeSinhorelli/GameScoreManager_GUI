/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Classes.ScorePlayer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;


public class ScorePlayerDAO {

    private Connection conn;
    
    public ScorePlayerDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList ListarConsulta(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList pacientesconsulta = new ArrayList();
        
        try {
            String SQL = "select id, nickname, email, plataforma, id_score, "
                    + "id_game, id_player, data, score from player, "
                    + "score where id = ? and id = id_player";
            connL = this.conn;
            System.out.println("TESTE");
            
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
    
            rs = ps.executeQuery();

            while (rs.next()) {
                int Id_paciente = rs.getInt("id");
                String nome = rs.getString("nickname");
                String telefone = rs.getString("email");
                String plat = rs.getString("plataforma");
                int id_consulta = rs.getInt("id_score");
                int id_medico = rs.getInt("id_score");
                int id_paciente = rs.getInt("id_score");
                Date data = rs.getDate("data");
                 int score = rs.getInt("score");

                pacientesconsulta.add(new ScorePlayer(Id_paciente, nome, plat, id_consulta, id_medico, id_paciente, data, score));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            Conexao.close(connL, ps);
        }

        return pacientesconsulta;
    }
    
     public ScorePlayer procura(int codigo) {
    PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ScorePlayer Pacas = new ScorePlayer();

        try{
           String SQL = "select id, nickname, email, plataforma, id_score, "
                    + "id_game, id_player, data, score from player, "
                    + "score where id = ? ";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, Integer.toString(codigo));
            rs = ps.executeQuery();

            

            while( rs.next()){
              
             
              int Id_paciente = rs.getInt("id");
                String nome = rs.getString("nickname");
                String telefone = rs.getString("email");
                 String plat = rs.getString("plataforma");
              
                int id_consulta = rs.getInt("id_score");
                int id_medico = rs.getInt("id_score");
                int id_paciente = rs.getInt("id_player");
                Date data = rs.getDate("data");
                int score = rs.getInt("score");
            
              
             Pacas.setNickname(nome);
             Pacas.setId_player(id_paciente);
             
              
            }


        }catch(SQLException sqle){
           System.out.println("Erro " + sqle);
        }
        finally{
           Conexao.close(connL,ps);
        }
         return Pacas;
    }

      public ArrayList ListarConsultaPaciente(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList pacientesconsulta = new ArrayList();

        try {
            String SQL = "select id, id_score, id_game, id_player, data, score"
                    + " from player, score "
                    + "where id = ? and id = id_player";
            connL = this.conn;
            System.out.println("TESTE");

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);

            rs = ps.executeQuery();

            while (rs.next()) {
                
                int Id_consulta = rs.getInt("id_score");
                int Id_medico = rs.getInt("id_game");
                int Id_paciente = rs.getInt("id_player");
                Date data = rs.getDate("data");
                int score = rs.getInt("score");
                pacientesconsulta.add(new ScorePlayer(Id_consulta,Id_medico,Id_paciente,data,score));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            Conexao.close(connL, ps);
        }

        return pacientesconsulta;
    }
      public ArrayList<ScorePlayer> listarTodos() {
    PreparedStatement ps = null;
    Connection connL = null;
    ResultSet rs = null;
    ArrayList<ScorePlayer> listaScores = new ArrayList<>();

    try {
        String SQL = "SELECT id_score, id_player, data, score FROM score";
        connL = this.conn;
        ps = connL.prepareStatement(SQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            int idScore = rs.getInt("id_score");
            int idPlayer = rs.getInt("id_player");
            Date data = rs.getDate("data");
            int score = rs.getInt("score");
            listaScores.add(new ScorePlayer(idScore, idPlayer, data, score));
        }
    } catch (SQLException sqle) {
        System.out.println("Erro ao listar scores: " + sqle.getMessage());
    } finally {
        Conexao.close(connL, ps);
    }

    return listaScores;
}

     
}
