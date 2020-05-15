/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.time.LocalDate;
import javax.swing.JOptionPane;




/**
 *
 * @author Fermin
 */
public class Utilidades {
/**
 * metodo para convertir a int un String   
 * @param String
 * @return int
 */
    public static int validaInt (String numero) {
        int resultado = 0;
        try {
            if (numero != null) {
                resultado = Integer.parseInt(numero);
            }
        }catch (NumberFormatException E) { 
            JOptionPane.showMessageDialog(null, "Número introducido incorrecto");
        }
        return resultado;
    }
/**
 * metodo para confirmar accion   
 * @return accion
 */
    public static int confirmar() {       
        int confirm = JOptionPane.showConfirmDialog(null, "Confirmar", "Confirmar registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return confirm;       
    }
/**
 * metodo para validar fecha   
 * @param numero
 * @return fecha
 */
    public static boolean validaFecha (int numero) {
    	LocalDate date = LocalDate.now();
    	int anio = date.getYear();
        if (numero <= anio) {
            return true;
        }else{
            return false;           
        }  
    }
/**
 * metodo para validar un String sin numeros   
 * @param cadena
 * @return cadena
 */
    public static boolean validaString(String cadena) {
        boolean flag = false;
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            flag = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' '); 
        }
        return flag;
    } 
}
