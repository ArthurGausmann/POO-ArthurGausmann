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
    private int numero;
    private Pessoa dono;
    private double saldo;
    private double limite;
    private static int numContas;
    
    // Construtores
    public Conta(Pessoa dono, double saldo, double limite) {
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
        numContas++;
        numero = numContas;
    }
    
    public Conta(Pessoa dono) {
        this(dono, 0, 0);
    }
    
    // Métodos
    void deposita(double quantidade) {
        saldo += quantidade;
        System.out.print("Foi depositado R$" + quantidade + " à conta ");
        dono.getNome();
    }
    
    boolean saca(double valor) {
        if (saldo + limite < valor) {
            System.out.println("Não foi possível realizar o saque");
            return false;
        } else {
            saldo -= valor;
            System.out.println("O saque de R$" + valor + " foi realizado com sucesso");
            return true;
        }
    }
    
    void imprimeDono() {
        System.out.print("O dono da conta é ");
        dono.getNome();
    }
    
    void devolveSaldo() {
        System.out.println("O saldo da conta é R$" + saldo);
    }
    
    boolean transferePara(Conta destino, double valor) {
        if (saca(valor)) {
            destino.saldo += valor;
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso");
            return true;
        } else {
            System.out.println("Não foi possível realizar a transferência");
            return false;
        }
    }
    
    void imprimeDados() {
        System.out.print("Dono: ");
        dono.getNome();
        System.out.println("Número: " + numero + " (" + numContas + ")");
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite + "\n");
    }
}
