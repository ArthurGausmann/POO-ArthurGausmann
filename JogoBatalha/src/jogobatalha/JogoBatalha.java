/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogobatalha;

/**
 *
 * @author arthur
 */
public class JogoBatalha {
    
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro("Theodore");
        Guerreiro guerreiro2 = new Guerreiro("Sisyphus");
        Arqueiro arqueiro1 = new Arqueiro("Légolas");
        Mago mago1 = new Mago("Harry");
        
        guerreiro1.imprimirStatus();
        arqueiro1.imprimirStatus();
        mago1.imprimirStatus();

        Batalha.duelar(mago1, guerreiro1);
        Batalha.duelar(guerreiro2, arqueiro1);
    }
    
}
