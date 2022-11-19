
package menus;

public class LogicaPitagoras {
    public static Double CalcularHipotenusa(Double CatetoOpuesto, Double CatetoAdyacente){
        Double hipotenusa = Math.sqrt(Math.pow(CatetoOpuesto, 2)+Math.pow(CatetoAdyacente, 2));
        
        return hipotenusa;
    }
}
