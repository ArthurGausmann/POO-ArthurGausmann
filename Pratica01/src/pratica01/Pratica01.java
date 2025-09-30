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
        contaArthur = new Conta("Arthur", 20000, 2000);
        contaManuela = new Conta("Manuela");

        contaArthur.imprimeDados();
        contaManuela.imprimeDados();
        contaArthur.transferePara(contaManuela, 1500);
        contaArthur.deposita(500.0);
        contaManuela.saca(500.0);
        contaArthur.imprimeDono();
        contaManuela.deposita(600);
        contaArthur.devolveSaldo(); 
        contaManuela.devolveSaldo();
        
        //----------------//
        
        Funcionario funcionario1, funcionario2;
        funcionario1 = new Funcionario("João", "Administrativo", 13000, "03/09/2023", "1234567890");
        funcionario2 = new Funcionario("Daniel", "Financeiro", 35000, "07/02/2017", "0987654321");
        
        funcionario1.recebeAumento(2000.0);
        funcionario1.calculaGanhoAnual();
        funcionario2.calculaGanhoAnual();
        funcionario1.mostra();
        funcionario2.mostra();
    }
    
}
