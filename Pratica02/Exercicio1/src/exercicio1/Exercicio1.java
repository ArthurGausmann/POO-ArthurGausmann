/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author arthur
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Arthur", 7, 1, 2004, 175);
        p1.mostrarDados();
        
        Pessoa p2 = new Pessoa("Manuela");
        p2.mostrarDados();
        p2.setNascimento(5, 9, 2005);
        p2.setAltura(163);
        p2.setNome("Manuela Avila");
        p2.mostrarDados();
    }
    
}
