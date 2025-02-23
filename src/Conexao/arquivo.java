/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;



import Classes.config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class arquivo {

        public static void grava(config CF) {
        try {
            FileOutputStream arquivo = new FileOutputStream("lib/game.cfg");
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(CF);
            fluxo.flush();
            System.out.println("Dados gravados com sucesso no arquivo game.cfg");
        } catch (Exception e) {
            System.out.println("Falha na gravação do arquivo" + (e));

        }

    }

    public static config le() {
       config CF = new config ();
        try {
            FileInputStream arquivo = new FileInputStream("lib/game.cfg");
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            CF = (config) fluxo.readObject();
            System.out.println("Dados lidos com sucesso no arquivo dados.txt");
        } catch (Exception e) {
            System.out.println("Falha na leitura do arquivo" + (e));
        }
        return CF;
    }
}