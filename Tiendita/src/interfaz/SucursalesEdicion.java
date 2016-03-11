package interfaz;

import metodos.*;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SucursalesEdicion extends JFrame {

    String id;
    private Integer posicion;
    private JButton jButton2 = new JButton();
    private JButton jButton1 = new JButton();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel1 = new JLabel();

    public SucursalesEdicion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(410, 407));
        jButton2.setText("Guardar");
        jButton2.setBounds(new Rectangle(235, 225, 105, 20));
        jButton2.setSize(new Dimension(105, 22));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jButton1.setText("Regresar ...");
        jButton1.setBounds(new Rectangle(60, 225, 105, 20));
        jButton1.setSize(new Dimension(105, 22));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jTextArea1.setBounds(new Rectangle(140, 125, 200, 85));
        jTextArea1.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jTextField1.setBounds(new Rectangle(140, 85, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jLabel4.setText("Direcci\u00f3n:");
        jLabel4.setBounds(new Rectangle(10, 125, 120, 15));
        jLabel4.setSize(new Dimension(120, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(10, 85, 120, 15));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        //Obtener y popular información
            posicion = Sucursales.posicion;
            m_sucursal c = new m_sucursal();
            m_sucursal sucursal = c.obtenerSucursal(posicion);
            id = sucursal.id;
        jTextField1.setText(sucursal.nombre);
        jTextArea1.setText(sucursal.direccion);        

        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jButton2, null);
        setLocationRelativeTo(null);

    }

    private void jButton2_actionPerformed(ActionEvent e) {
        
        String nombre = jTextField1.getText();    
        String direccion = jTextArea1.getText();
    
        //Validar
        if( validar.camposVacios(jTextField1) & validar.areasVacias(jTextArea1)  ){
            //Si valida, actualizar
            m_sucursal suc = new m_sucursal();
            if( suc.editarSucursal(posicion,id,nombre, direccion) ){
                Sucursales sucursal = new Sucursales();
                sucursal.setVisible(true);
                this.dispose();
    }
        }}
    private void jButton1_actionPerformed(ActionEvent e) {
        Sucursales sucursal = new Sucursales();
        sucursal.setVisible(true);
        this.dispose();
    }

}
