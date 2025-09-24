/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthurg5
 */
public class Pratica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta contaArthur;
        contaArthur = new Conta();
        
        contaArthur.dono = "Arthur";
        contaArthur.saldo = 20000.0;
        contaArthur.numero = 12345;
        contaArthur.limite = 2000.0;
        
        System.out.println("A conta do usuário " + contaArthur.dono + " possui saldo de R$" + contaArthur.saldo);
        contaArthur.deposita(500.0);
        System.out.println("Foi depositado R$500.0 agora o saldo é R$" + contaArthur.saldo);
        contaArthur.saca(1500.0);
        System.out.println("Foi retirado R$1500.0 agora o saldo é R$" + contaArthur.saldo);
    }
    
}
