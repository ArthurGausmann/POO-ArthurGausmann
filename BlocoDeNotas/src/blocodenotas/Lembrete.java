/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;

/**
 *
 * @author arthur
 */
public class Lembrete {
    // Atributos
    private String nome;
    private String descricao;
    private Data data;
    
    // Construtores
    public Lembrete(String nome, String descricao, Data data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }
    
    public Lembrete(String nome, String descricao) {
        this(nome, descricao, new Data());
    }
    
    // Métodos
    public void getLembrete() {
        System.out.println("#####################");
        System.out.println("Nome lembrete: " + nome);
        System.out.print("Data: ");
        data.getData();
        System.out.println("----------------------");
        System.out.println("Descrição: " + descricao);
        System.out.println("#####################");
    }
    
    public void getNomeLembrete() {
        System.out.println("Nome: " + nome);
    }
}
