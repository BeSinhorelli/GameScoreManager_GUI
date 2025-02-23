/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

public class ScorePlayerJogo {
    int id_score, id_game, id_player;
    int score;
    Date data;
    public ScorePlayerJogo() {
    }

    public ScorePlayerJogo(int id_score, int id_game, int id_player, int score, Date data) {
        this.id_score = id_score;
        this.id_game = id_game;
        this.id_player = id_player;
        this.score = score;
        this.data = data;
    }

    public ScorePlayerJogo(int id_game, int id_player, int score, Date data) {
        this.id_game = id_game;
        this.id_player = id_player;
        this.score = score;
        this.data = data;
    }

    public ScorePlayerJogo(int score, Date data) {
        this.score = score;
        this.data = data;
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

    public Date getData() {
        return data;
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

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
