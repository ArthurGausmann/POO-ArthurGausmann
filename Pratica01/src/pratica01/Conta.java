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
        System.out.println("Foi depositado R$" + quantidade + " à conta " + dono);
    }
    
    boolean saca(double valor) {
        if (saldo < valor || limite < valor) {
            System.out.println("Não foi possível realizar o saque");
            return false;
        } else {
            saldo -= valor;
            System.out.println("O saque de R$" + valor + " foi realizado com sucesso");
            return true;
        }
    }
    
    void imprimeDono() {
        System.out.println("O dono da conta é " + dono);
    }
    
    void devolveSaldo() {
        System.out.println("O saldo da conta é R$" + saldo);
    }
    
    boolean transferePara(Conta destino, double valor) {
        if (saldo < valor || limite < valor) {
            System.out.println("Não foi possível realizar a transferência");
            return false;
        } else {
            destino.saldo += valor;
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + destino.dono);
            return true;
        }
    }
    
    void imprimeDados() {
        System.out.println("------------------");
        System.out.println("Dono: " + dono);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("------------------");
    }
}
