/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author arthur
 */
public class Endereço {
    // Atributos
    private String logradouro;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;
    
    // Construtor
    public Endereço(String logradouro, String complemento, int cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Endereço() {
        this("Rua sem nome", "Apto. 1000", 90120510, "Pelotas", "RS");
    }
    
    // Métodos
    void getEndereço() {
        System.out.println("Endereço: " + logradouro + ", " + complemento + ", " + cep + ", " + cidade + " - " + estado);
    }
}
