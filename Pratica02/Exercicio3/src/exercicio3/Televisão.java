/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author arthur
 */
public class Televisão {
    // Atributos
    private int volume;
    private int canal;
    
    // Construtor
    Televisão(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    
    // Métodos
    void aumentarVolume() {
        volume++;
    }
}
