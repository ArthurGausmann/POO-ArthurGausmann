/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author arthurg5
 */
public class Elevador {
    // Atributos
    private int andarAtual;
    private int totalAndares;
    private int capacidadeTotal;
    private int pessoas;
    
    // Construtor
    Elevador(int andarAtual, int totalAndares, int capacidadeTotal, int pessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        this.pessoas = pessoas;
    }
    
    Elevador(int totalAndares, int capacidadeTotal) {
        this(0, totalAndares, capacidadeTotal, 0);
    }
    
    // Métodos
    void inicia(int totalAndares, int capacidadeTotal) {
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        
        
        System.out.println("Elevador inicializado com os seguintes parâmetros: ");
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Total de andares: " + totalAndares);
        System.out.println("Capacidade total: " + capacidadeTotal);
        System.out.println("Pessoas: " + pessoas + "\n");
    }
    
    void entra() {
        if (capacidadeTotal == pessoas + 1) {
            System.out.println("Capacidade total atingida\n");
        } else {
            pessoas++;
            System.out.println(pessoas + "/" + capacidadeTotal + "\n");
        }
    }
    
    void sai() {
        if (pessoas < 1) {
            System.out.println("Não há ninguém no elevador\n");
        } else {
            pessoas--;
            System.out.println(pessoas + "/" + capacidadeTotal + "\n");
        }
    }
    
    void sobe() {
        if (andarAtual == totalAndares) {
            System.out.println("O elevador está no último andar\n");
        } else {
            andarAtual++;
            System.out.println(andarAtual + "/" + totalAndares + "\n");
        }
    }
    
    void desce() {
        if (andarAtual < 0) {
            System.out.println("O elevador está no térreo\n");
        } else {
            andarAtual--;
            System.out.println(andarAtual + "/" + totalAndares + "\n");
        }
    }
    
    void andar(int andar) {
        if (andar > totalAndares) {
            System.out.println("Este andar não tem no prédio");
        } else {
            andarAtual = andar;
            System.out.println("Andar atual: " + andarAtual + "\n");
        }
    }
    
    void info() {
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Total de andares: " + totalAndares);
        System.out.println("Capacidade total: " + capacidadeTotal);
        System.out.println("Pessoas: " + pessoas + "\n");
    }
}
