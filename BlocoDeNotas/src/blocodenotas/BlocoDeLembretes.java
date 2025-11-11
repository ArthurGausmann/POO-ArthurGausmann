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
            lembretes = limiteArray();
            System.out.println("--Array redimensionado--");
        }
        lembretes[numLembrete] = lembrete;
        System.out.print("Lembrete adicionado - ");
        lembrete.getNomeLembrete();
        System.out.println("Na posição " + numLembrete + " do Array");
        numLembrete++;
    }
        
    public Lembrete[] limiteArray() {
        Lembrete[] lembretesAux = new Lembrete[(lembretes.length * 2)];
        for(int i = 0; i < lembretes.length; i++) {
            lembretesAux[i] = lembretes[i];
        }
        return lembretesAux;
    }
    
    public void excluirLembrete(int a) {
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
    
    public void buscarLembretesPorData(Data dataCompara) {
        int countData = 0;
        System.out.print("\n-Lembretes na data: ");
        dataCompara.getData();
        for(int i = 0; i < numLembrete; i++) {
            if(dataCompara.equals(lembretes[i].getDataLembrete())) {
                lembretes[i].getNomeLembrete();
                countData++;
            }
        }
        System.out.println("Você possui " + countData + " lembretes para essa data");
    }
    
    public void buscarLembretesPorNome(String nomeCompara) {
        int countNome = 0;
        System.out.println("\n-Lembretes de nome: " + nomeCompara);
        for(int i = 0; i < numLembrete; i++) {
            if(nomeCompara.equals(lembretes[i].getNomeLembrete())) {
                lembretes[i].getNomeLembrete();
                countNome++;
            }
        }
        System.out.println("Você possui " + countNome + " lembretes para essa data");
    }
}
