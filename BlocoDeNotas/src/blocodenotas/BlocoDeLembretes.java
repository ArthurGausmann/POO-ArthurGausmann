/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;

/**
 *
 * @author arthur
 */
public class BlocoDeLembretes {
    // Atributos
    private Lembrete[] lembretes; // Array de Lembrete

    // Construtores
    public BlocoDeLembretes(int tamanho) {
        lembretes = new Lembrete[tamanho];
    }
    
    public BlocoDeLembretes() {
        this(10);
    }
    
    // Métodos
    public void getBlocoLembretes() {   
        System.out.println("Lembretes: " + lembretes);
    }
    
    public void setBlocoLembretes(Lembrete lembrete) {
        for(int i = 0; i < lembretes.length; i++) {
            lembretes[i] = lembrete;
        }
        System.out.print("Lembrete adicionado - ");
        lembrete.getNomeLembrete();
    }
}
