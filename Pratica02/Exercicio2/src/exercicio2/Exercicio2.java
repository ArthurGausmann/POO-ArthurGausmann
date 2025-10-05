/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author arthurg5
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador(26, 13);
        
        elevador1.inicia(26, 13);
        
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        
        elevador1.sai();
        
        elevador1.andar(15);
        
        elevador1.sai();
        elevador1.sai();
        
        elevador1.sobe();
        
        elevador1.sai();
        elevador1.sai();
        
        elevador1.info();
    }
    
}
