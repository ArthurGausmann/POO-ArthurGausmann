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
        Guerreiro guerreiro2 = new Guerreiro("Sophyst");
        
        guerreiro1.imprimirStatus();
        guerreiro1.atacar(guerreiro2);
        guerreiro2.imprimirStatus();
    }
    
}
