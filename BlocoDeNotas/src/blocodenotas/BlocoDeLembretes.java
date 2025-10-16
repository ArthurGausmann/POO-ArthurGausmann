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
    private static int numLembrete;
    private static int countData;
    private

    // Construtores
    public BlocoDeLembretes(int tamanho) {
        lembretes = new Lembrete[tamanho];
    }
    
    public BlocoDeLembretes() {
        this(10);
    }
    
    // Métodos    
    public void incluirLembrete(Lembrete lembrete) {
        for(int i = 0; i <= lembretes.length; i++) {
            if(i == lembretes.length) {
                Lembrete[] lembretes2 = new Lembrete[(lembretes.length*2)];
                System.arraycopy(lembretes, 0, lembretes2, 0, lembretes.length);
            } else {
                lembretes[i] = lembrete;
            }
        }
        System.out.print("Lembrete adicionado - ");
        lembrete.getNomeLembrete();
        System.out.println("Na posição " + numLembrete + " do Array");
        numLembrete++;
    }
    
    public void excluirLembrete(int a) { // FIX: Remoção correta dos lembretes da lista
        lembretes[a] = null;
        System.out.println(lembretes[a]);
    }
    
    public void numeroDeLembretes() {
        System.out.println("Você possui " + numLembrete + " lembretes");
    }
    
    public void listarLembretes() {
        System.out.println("-Listagem dos lembretes-");
        for(int i = 0; i < numLembrete; i++){
            System.out.println("Lembrete " + (i+1) + ":");
            lembretes[i].getLembrete();
        }
    }
    
    public void buscarLembretesPorData(Data data) {
        for(int i = 0; i < numLembrete; i++) {
            data.getData();
            lembretes[i].getNomeLembrete();
            lembretes[i].getData(); // FIX: Comparação com data
//            if(data = lembretes[i].getData()) {
//                lembretes[i].getNomeLembrete();
//                countData++;
//            }
        }
        System.out.println("Você possui " + countData + " lembretes para essa data");
    }
}
