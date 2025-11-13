/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogobatalha;

/**
 *
 * @author arthur
 */
public class Guerreiro extends Personagem {
    // Construtor    
    public Guerreiro(String nome) {
        super(nome, 8, 6, 18);
    }
    
    // Métodos
    @Override
    void imprimirStatus() {
        System.out.println("<Status do Guerreiro>");
        super.imprimirStatus();
    }
    
    @Override
    void atacar(Personagem inimigo) {
        int dano = (getAtaque() + 2) - inimigo.getDefesa();
        if (dano > 0 || inimigo.getSaude() != 0) {
            inimigo.recebeDano(dano);
            System.out.println(getNome() + " deu " + dano + " de dano em " + inimigo.getNome() + 
                    " que ficou com " + inimigo.getSaude() + " de saúde!");
        } else {
            System.out.println("Ataque não surtiu efeito!");
        }
    }
}
