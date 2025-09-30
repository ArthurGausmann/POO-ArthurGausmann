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
    void diminuirVolume() {
        volume--;
    }
    void aumentarCanal() {
        canal++;
    }
    void diminuirCanal() {
        canal--;
    }
    int trocarCanal(int num) {
        return canal = num;
    }
    void mostrarVolume() {
        System.out.println("Volume: " + volume);
    }
    void mostrarCanal() {
        System.out.println("Canal: " + canal);
    }
    
}
