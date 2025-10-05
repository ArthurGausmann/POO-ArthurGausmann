/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author arthur
 */
public class Pessoa {
    // Atributos
    private String nome;
    private int dia, mes, ano;
    private int altura;
    
    // Construtores
    Pessoa(String n, int d, int m, int a, int alt) {
        nome = n;
        dia = d;
        mes = m;
        ano = a;
        altura = alt;
    }
    
    Pessoa(String nome) {
        this(nome, 1, 1, 2000, 0);
    }
    
    // Métodos
    void setNome(String nome) {
        this.nome = nome;
    }
    
    void setNascimento(int d, int m, int a) {
        if (d > 31 || m > 12 || a > 2025) {
           System.out.println("Valores incorretos!");
        } else {
            dia = d;
            mes = m;
            ano = a;
        }
    }
    
    void setAltura(int altura) {
        this.altura = altura;
    }
    
    void getNome() {
        System.out.println("Nome: " + nome);
    }
    
    void getNascimento() {
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
    }
    
    void getAltura() {
        System.out.println("Altura: " + altura + " cm");
    }
    
    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
        System.out.println("Idade: " + idade());
        System.out.println("Altura: " + altura + " cm\n");
    }
    
    int idade() {
       return (2025 - ano); 
    }
    

}
