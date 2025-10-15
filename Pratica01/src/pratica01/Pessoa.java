/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthur
 */
public class Pessoa {
    // Atributos
    private String nome;
    private Endereço endereço;
    private Telefone telefone;
    private Data data;
    
    // Construtor
    public Pessoa(String nome, Endereço endereço, Telefone telefone, Data data) {
        this.nome = nome;
        endereço = new Endereço();
        telefone = new Telefone();
        data = new Data();
    }
    
    public Pessoa(String nome) {
        this(nome, new Endereço(), new Telefone(), new Data());
    }
    
    // Métodos
    void getPessoa() {
        System.out.println("-----Pessoa-----");
        System.out.println("Nome: " + nome);
        endereço.getEndereço();
        telefone.getTelefone();
        data.getData();
    }
    
    public void getNome() {
        System.out.println(nome);
    }
}
