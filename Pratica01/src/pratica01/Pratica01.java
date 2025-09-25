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
        contaManuela.deposita(600);
        contaArthur.devolveSaldo();
        contaManuela.devolveSaldo();
        
        Funcionario funcionario1, funcionario2;
        funcionario1 = new Funcionario();
        funcionario2 = new Funcionario();
        
        funcionario1.nome = "João";
        funcionario1.departamento = "Administrativo";
        funcionario1.salario = 13000.0;
        funcionario1.dataEntrada = "03/09/2023";
        funcionario1.rg = "1234567890";
        
        funcionario2.nome = "Daniel";
        funcionario2.departamento = "Financeiro";
        funcionario2.salario = 35000.0;
        funcionario2.dataEntrada = "07/02/2017";
        funcionario2.rg = "0987654321";
        
        funcionario1.recebeAumento(2000.0);
        funcionario1.calculaGanhoAnual();
        funcionario2.calculaGanhoAnual();
        funcionario1.mostra();
        funcionario2.mostra();
    }
    
}
