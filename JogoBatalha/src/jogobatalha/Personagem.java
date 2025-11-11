/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogobatalha;

/**
 *
 * @author arthur
 */
abstract class Personagem {
    // Atributos
    private String nome;
    private int ataque;
    private int defesa;
    private int saude;

    // Construtor
    Personagem(String nome, int ataque, int defesa, int saude) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.saude = saude;
    }
    
    // Métodos
    void imprimirStatus() {
        System.out.println("|Nome: " + nome);
        System.out.println("|Ataque: " + ataque);
        System.out.println("|Defesa: " + defesa);
        System.out.println("|Saude: " + saude);
    };
    
    abstract void atacar(Personagem inimigo);
    
    String getNome() {
        return this.nome;
    }
    
    int getAtaque() {
        return this.ataque;
    }
    
    int getDefesa() {
        return this.defesa;
    }
    
    int getSaude() {
        return this.saude;
    }
    
    int setSaude(int saude) {
        return this.saude = saude;
    }
}
