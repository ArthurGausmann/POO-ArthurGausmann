/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocodenotas;

/**
 *
 * @author arthur
 */
public class Data {
    // Atributos
    private int dia, mes, ano;
    
    // Construtores
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data() {
        this(1, 1, 2000);
    }
    
    // Métodos
    public void getData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
