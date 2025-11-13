/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogobatalha;

/**
 *
 * @author arthur
 */

import java.util.Random;

public class Arqueiro extends Personagem {
    // Construtores
    public Arqueiro(String nome) {
        super(nome, 9, 4, 19);
    }
    Random random = new Random();
    
    // Métodos
    @Override
    void imprimirStatus() {
        System.out.println("<Status do Arqueiro>");
        super.imprimirStatus();
    }
    
    @Override
    void atacar(Personagem inimigo) {
        int dice = random.nextInt(4);
        if (dice == 0) {
            System.out.println("O arqueiro errou o ataque");
        } else {
            int dano = getAtaque() - inimigo.getDefesa();
            if (dano > 0 || inimigo.getSaude() != 0) {
                inimigo.recebeDano(dano);
                System.out.println(getNome() + " deu " + dano + " de dano em " + inimigo.getNome() + 
                        " que ficou com " + inimigo.getSaude() + " de saúde!");
            } else {
                System.out.println("Ataque não surtiu efeito!");
            }
        }
    }
}
