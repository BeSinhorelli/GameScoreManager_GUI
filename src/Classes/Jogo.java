/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
public class Jogo {
    
    int id_game;
    String nome, tipo;

    public Jogo() {
    }

    public Jogo(int id_game, String nome, String tipo) {
        this.id_game = id_game;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Jogo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId_game() {
        return id_game;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Object get(int posicao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
