/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

/**
 *
 * @author Johan
 */
public class Corriente {
    public static Double CalcularCorriente(Double Voltaje, Double Resistencia){
        Double corriente = Voltaje / Resistencia;
        
        return corriente;
    }
}
