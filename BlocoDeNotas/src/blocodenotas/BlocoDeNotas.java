/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blocodenotas;

/**
 *
 * @author arthur
 */
public class BlocoDeNotas {
    
    public static void main(String[] args) {
        Lembrete l1 = new Lembrete("POO", "Aula de POO");
        Lembrete l2 = new Lembrete("POO", "Estudar POO", new Data(14, 10, 2025));
        Data d1 = new Data(30, 12, 2026);
        Lembrete l3 = new Lembrete("Ano novo", "Virada do ano", d1);
                
        l1.getLembrete();
        l2.getLembrete();
        l3.getLembrete();
        
        BlocoDeLembretes bloco1 = new BlocoDeLembretes();
        
        bloco1.setBlocoLembretes(l1);
        bloco1.setBlocoLembretes(l2);
        bloco1.setBlocoLembretes(l3);
    }
    
}
