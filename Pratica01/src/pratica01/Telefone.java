/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthur
 */
public class Telefone {
    // Atributos
    private int ddd;
    private int numero;

    // Construtor
    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    
    public Telefone() {
        this(53, 990901515);
    }
    
    // Métodos
    void getTelefone() {
        System.out.println("Telefone: (" + ddd + ")" + numero);
    }
}
