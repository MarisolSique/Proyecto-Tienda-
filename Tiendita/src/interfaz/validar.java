package interfaz;

import java.awt.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;

public class validar {
       
    public static Boolean camposVacios(JTextField... arrayCampos) {
        ToolTipManager.sharedInstance().setInitialDelay(0);
        Boolean seguir = true;
           for (JTextField c : arrayCampos) {
               String texto = c.getText();
               if  (texto==null || texto.equals("")){
                    c.setBorder(BorderFactory.createLineBorder(Color.red));
                    c.setToolTipText("Este campo no debe estar vacío");
                    seguir = false;
               }else{
                   c.setBorder(BorderFactory.createLineBorder(Color.lightGray));
                   c.setToolTipText(null);
               }
           } 
           return seguir;
    }

    public static Boolean areasVacias(JTextArea... arrayAreas) {
        ToolTipManager.sharedInstance().setInitialDelay(0);
        Boolean seguir = true;
           for (JTextArea c : arrayAreas) {
               String texto = c.getText();
               if  (texto==null || texto.equals("")){
                    c.setBorder(BorderFactory.createLineBorder(Color.red));
                    c.setToolTipText("Este campo no debe estar vacío");
                    seguir = false;
               }else{
                   c.setBorder(BorderFactory.createLineBorder(Color.lightGray));
                   c.setToolTipText(null);
               }
           } 
           return seguir;
    }

    public static Boolean correo(JTextField c) {
        Boolean seguir = true;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher( c.getText() );
        if( !matcher.matches() ){
            c.setBorder(BorderFactory.createLineBorder(Color.red));
            c.setToolTipText("Ingrese un correo válido");
            seguir = false;
        }else{
            c.setBorder(BorderFactory.createLineBorder(Color.lightGray));
            c.setToolTipText(null);
        }
        return seguir;
    }
}
