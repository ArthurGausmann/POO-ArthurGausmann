/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogobatalha;

/**
 *
 * @author arthur
 */
public class Batalha {    
    // Métodos
    public static void turnoBatalha(Personagem atacante, Personagem defensor) {
        atacante.atacar(defensor);
        defensor.imprimirStatus();
        if (defensor.getSaude() == 0) {
            System.out.println(defensor.getNome() + " foi derrotado!");
        }
    }
    
    public static Personagem duelar(Personagem p1, Personagem p2) {
        Personagem vencedor;
        int count = 1;
        System.out.println("<==DUELO INICIADO==>");
        while (p1.getSaude() > 0 || p2.getSaude() > 0) {
            System.out.println("Turno " + count);
            turnoBatalha(p1,p2);
            p1.imprimirStatus();
            if (p2.getSaude() == 0) {
                vencedor = p1;
                System.out.println("Após " + count + " turnos " + vencedor.getNome() + " saiu vitorioso da batalha!");  
                return vencedor;
            }
            Personagem aux;
            aux = p1;
            p1 = p2;
            p2 = aux;
            count++;
        }
        
        return null;
    }
}
