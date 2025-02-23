package Classes;

import java.util.Date;

public class Score {
    private int id_score;
    private int id_game;
    private int id_player;
    private int score;
    private Date data;
    public Score() {
    }
    public Score(int id_score, int id_game, int id_player, int score, Date data) {
        this.id_score = id_score;
        this.id_game = id_game;
        this.id_player = id_player;
        this.score = score;
        this.data = data;
    }

    public Score(int score, Date data) {
        this.score = score;
        this.data = data;
    }


    public Score(int id_score, java.sql.Date data, int score) {
        this.id_score = id_score;
        this.data = new Date(data.getTime());
        this.score = score;
    }

    public Score(int id_score, int id_game, int id_player, java.sql.Date data, int score) {
        this.id_score = id_score;
        this.id_game = id_game;
        this.id_player = id_player;
        this.data = new Date(data.getTime());
        this.score = score;
    }

    public int getId_score() {
        return id_score;
    }

    public void setId_score(int id_score) {
        this.id_score = id_score;
    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Score{" +
               "id_score=" + id_score +
               ", id_game=" + id_game +
               ", id_player=" + id_player +
               ", score=" + score +
               ", data=" + data +
               '}';
    }
}
