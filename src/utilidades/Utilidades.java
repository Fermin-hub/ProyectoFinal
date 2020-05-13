/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import modelo.Actor;


/**
 *
 * @author fer
 */
public class Utilidades {
    
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
    
    public static int confirmar() {       
        int confirm = JOptionPane.showConfirmDialog(null, "Confirmar", "Confirmar registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return confirm;       
    }
   
    
    
    
}
