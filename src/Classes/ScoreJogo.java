
package Classes;

import java.util.Date;
public class ScoreJogo {
private int id_score, id_jogo, id_player, id_Jogo, score;
private Date data;
String tipo, nome;

    public ScoreJogo() {
    }

    public ScoreJogo(int id_score, int id_jogo, int id_player, int id_Jogo, int score, Date data, String tipo, String nome) {
        this.id_score = id_score;
        this.id_jogo = id_jogo;
        this.id_player = id_player;
        this.id_Jogo = id_Jogo;
        this.score = score;
        this.data = data;
        this.tipo = tipo;
        this.nome = nome;
    }

    public ScoreJogo(int score, Date data, String tipo, String nome) {
        this.score = score;
        this.data = data;
        this.tipo = tipo;
        this.nome = nome;
    }

    public ScoreJogo(String nome, java.sql.Date data, int score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScoreJogo(String nome, java.sql.Date date, String tipo, int score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScoreJogo(String nick, String nome, java.sql.Date date, int score) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ScoreJogo(String nome, int score, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_score() {
        return id_score;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public int getId_player() {
        return id_player;
    }

    public int getId_Jogo() {
        return id_Jogo;
    }

    public int getScore() {
        return score;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setId_score(int id_score) {
        this.id_score = id_score;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public void setId_Jogo(int id_Jogo) {
        this.id_Jogo = id_Jogo;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNickname() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
