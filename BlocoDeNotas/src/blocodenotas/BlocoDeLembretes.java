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
    private int numLembrete;
    private static int countData;

    // Construtores
    public BlocoDeLembretes(int tamanho) {
        lembretes = new Lembrete[tamanho];
        numLembrete = 0;
    }
    
    public BlocoDeLembretes() {
        this(10);
    }
    
    // Métodos    
    public void incluirLembrete(Lembrete lembrete) {
        if(numLembrete == lembretes.length) {
            Lembrete[] lembretesAux = new Lembrete[(lembretes.length*2)];
            System.arraycopy(lembretes, 0, lembretesAux, 0, lembretes.length);
            lembretes = lembretesAux;
            System.out.println("Array redimensionado");
        }
        lembretes[numLembrete] = lembrete;
        System.out.print("Lembrete adicionado - ");
        lembrete.getNomeLembrete();
        System.out.println("Na posição " + numLembrete + " do Array");
        numLembrete++;
    }
    
    public void excluirLembrete(int a) { // FIX: Remoção correta dos lembretes da lista
        if(a < 0 || a > lembretes.length) {
            System.out.println("Valor de índice inválido para remoção");
        } else {
            for(int i = a; i < numLembrete; i++) {
                lembretes[i] = lembretes[i+1];
            }
            lembretes[numLembrete - 1] = null;
            numLembrete--;
            System.out.println("Lembrete excluído com sucesso");
        }
    }
    
    public void numeroDeLembretes() {
        System.out.println("Você possui " + numLembrete + " lembretes");
    }
    
    public void listarLembretes() {
        System.out.println("\n-Listagem dos lembretes-");
        for(int i = 0; i < numLembrete; i++){
            System.out.println("Lembrete " + (i+1) + ":");
            lembretes[i].getLembrete();
        }
    }
    
//    public void buscarLembretesPorData(Data data) {
//        for(int i = 0; i < numLembrete; i++) {
//            data.getData();
//            lembretes[i].getNomeLembrete();
//            lembretes[i].getData(); // FIX: Comparação com data
////            if(data = lembretes[i].getData()) {
////                lembretes[i].getNomeLembrete();
////                countData++;
////            }
//        }
//        System.out.println("Você possui " + countData + " lembretes para essa data");
//    }
}
