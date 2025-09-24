/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthurg5
 */
public class Conta {
    // Atributos
    int numero;
    String dono;
    double saldo;
    double limite;
    
    // Métodos
    void deposita(double quantidade) {
        saldo += quantidade;
    }
    
    boolean saca(double valor) {
        if (saldo < valor && limite < valor) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
}
