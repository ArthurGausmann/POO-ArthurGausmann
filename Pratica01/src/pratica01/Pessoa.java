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
    Pessoa (String nome, Endereço endereço, Telefone telefone, Data data) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.data = data;
    }
    
    // Métodos
    void getPessoa() {
        System.out.println("-----Pessoa-----");
        System.out.println("Nome: " + nome);
        endereço.getEndereço();
        telefone.getTelefone();
        data.getData();
    }
}
