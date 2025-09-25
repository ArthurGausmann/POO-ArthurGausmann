/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthurg5
 */
public class Funcionario {
    // Atributos
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    
    void recebeAumento(double aumento) {
        salario += aumento;
        System.out.println("O funcionário " + nome + " recebeu um aumento de R$" + aumento);
    }
    
    double calculaGanhoAnual() {
       double salarioAnual = (salario * 12);
       System.out.println("O funcionário " + nome + " recebe um salário anual de R$" + salarioAnual);
       return salarioAnual;
    }
    
    void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$" + salario);
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("--------------");
    }
}
