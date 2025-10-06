/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthur
 */
public class Data {
    // Atributos
    private int dia, mes, ano;
    
    // Construtor
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    // Métodos
    void getData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}
