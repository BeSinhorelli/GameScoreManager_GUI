/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Player {
    
    private int id_player;
    private String nickname, email, plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Player(int id_player, String nickname, String email, String plataforma) {
        this.id_player = id_player;
        this.nickname = nickname;
        this.email = email;
        this.plataforma = plataforma;
    }

    public Player() {
    }

    public Player(int id_player, String nickname, String email) {
        this.id_player = id_player;
        this.nickname = nickname;
        this.email = email;
    }

    public Player(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    public int getId_player() {
        return id_player;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
