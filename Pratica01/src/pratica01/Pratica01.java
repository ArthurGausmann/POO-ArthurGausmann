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
        Conta contaArthur, contaManuela;
        contaArthur = new Conta();
        contaManuela = new Conta();
        
        contaArthur.dono = "Arthur";
        contaArthur.saldo = 20000.0;
        contaArthur.numero = 12345;
        contaArthur.limite = 2000.0;
        
        contaManuela.dono = "Manuela";
        contaManuela.saldo = 50000.0;
        contaManuela.numero = 67890;
        contaManuela.limite = 4000.0;
        
        contaArthur.imprimeDados();
        contaManuela.imprimeDados();
        contaArthur.transferePara(contaManuela, 1500);
        contaArthur.deposita(500.0);
        contaManuela.saca(2500.0);
        contaArthur.imprimeDono();
        contaArthur.devolveSaldo();
    }
    
}
