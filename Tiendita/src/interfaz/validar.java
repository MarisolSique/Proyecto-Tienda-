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

    public static Boolean nit(JTextField c) {
        Boolean seguir = true;
        //Se recibe la cadena
            String nit = c.getText().trim().toLowerCase();
        //Si tiene un patrón válido
        Pattern pattern = Pattern.compile("^\\d+[-]+(\\d|k)$");       
        Matcher matcher = pattern.matcher( nit );
        if( matcher.matches() ){
                //Buscar guión
                    Integer pos = nit.indexOf("-");
                //Se extraen los dígitos antes del guión y se ordenan en un array para su manipulación posterior
                    String[] digitos = nit.substring(0,pos).split("");
                //Se extrae y guarda el dígito verificador
                    String digito_verificador = nit.substring( pos+1 );
                    if( digito_verificador.equals("k") ){
                        digito_verificador = "10";
                    }               
                //De izquierda a derecha, se multiplican los dígitos decrementalmente
                //de 8 a 2 respectivamente y se suman los resultados
                    int suma = 0;
                    int multiplicador = digitos.length+1;
                    for (int i = 0; i<digitos.length;i++) {
                        suma+=Integer.parseInt(digitos[i])*multiplicador;
                        multiplicador--;
                    }

                    int digito_a_verificar = (11 - (suma % 11)) % 11;

                if( digito_a_verificar != Integer.parseInt( digito_verificador ) ){
                    c.setBorder(BorderFactory.createLineBorder(Color.red));
                    c.setToolTipText("Ingrese un NIT válido");
                    seguir = false;
                }else{
                    c.setBorder(BorderFactory.createLineBorder(Color.lightGray));
                    c.setToolTipText(null);
                }
            }else{
                c.setBorder(BorderFactory.createLineBorder(Color.red));
                c.setToolTipText("Ingrese un NIT válido");
                seguir = false;
            }
        return seguir;
    }
}
