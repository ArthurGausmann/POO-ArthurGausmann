/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author arthur
 */
public class ControleRemoto {
    // Atributos
    private Televisão tv;
    
    // Construtor
    ControleRemoto(Televisão tv) {
        this.tv = tv;
    }
    
    // Métodos
    void aumentarVolume() {
        tv.aumentarVolume();
    }
}
