package Classes;

import java.util.Date;

public class ScorePlayer {
int id_score, id_game,id_player,score, id_Player;
Date data;
String nickname, email, plataforma;

    public ScorePlayer(int Id, String nickname, String email, String plataforma, java.sql.Date data, int id, int ID, int sc, java.sql.Date data0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScorePlayer(int Id, int iD, String nickname, String email, String plataforma, java.sql.Date data, int id, int ID, int sc, java.sql.Date data0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScorePlayer(int Id, int Id_game, int Id_player, int score, java.sql.Date data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScorePlayer(int Id, String nickname, String email, String plataforma, java.sql.Date data, int id_s, int id_j, int id_p, int score) {
     
    }

    public ScorePlayer(int Id_consulta, int Id_medico, int Id_paciente, java.sql.Date data, int score) {
        
    }

    public ScorePlayer(int Id_paciente, String nome, String plat, int id_consulta, int id_medico, int id_paciente, java.sql.Date data, int score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScorePlayer(int idScore, int idPlayer, java.sql.Date data, int score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public ScorePlayer(int id_score, int id_game, int id_player, int score, int id_Player, Date data, String nickname, String email, String plataforma) {
        this.id_score = id_score;
        this.id_game = id_game;
        this.id_player = id_player;
        this.score = score;
        this.id_Player = id_Player;
        this.data = data;
        this.nickname = nickname;
        this.email = email;
        this.plataforma = plataforma;
    }

    public ScorePlayer() {
    }

    public ScorePlayer(int id_score, int id_game, int id_player, int score, int id_Player, Date data, String nickname, String email) {
        this.id_score = id_score;
        this.id_game = id_game;
        this.id_player = id_player;
        this.score = score;
        this.id_Player = id_Player;
        this.data = data;
        this.nickname = nickname;
        this.email = email;
    }

    public ScorePlayer(int score, Date data, String nickname, String email) {
        this.score = score;
        this.data = data;
        this.nickname = nickname;
        this.email = email;
    }

    public int getId_score() {
        return id_score;
    }

    public int getId_game() {
        return id_game;
    }

    public int getId_player() {
        return id_player;
    }

    public int getScore() {
        return score;
    }

    public int getId_Player() {
        return id_Player;
    }

    public Date getData() {
        return data;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setId_score(int id_score) {
        this.id_score = id_score;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setId_Player(int id_Player) {
        this.id_Player = id_Player;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
