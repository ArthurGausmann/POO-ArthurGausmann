/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author arthur
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisão tv = new Televisão(20, 8);
        ControleRemoto controle = new ControleRemoto(tv);
        
        controle.mostrarVolume();
        controle.mostrarCanal();
        
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        
        controle.diminuirCanal();
        controle.diminuirCanal();
        
        controle.mostrarVolume();
        controle.mostrarCanal();
        
        controle.trocarCanal(18);
        
        controle.mostrarCanal();
    }
    
}
