package interfaz;

import javax.swing.JPasswordField;

import metodos.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;

import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class UsuariosNuevos extends JFrame {


    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private ButtonGroup grupo1 = new ButtonGroup();
    private JLabel jLabel5 = new JLabel();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JComboBox jComboBox1 = new JComboBox();
    private JPasswordField jPasswordField1 = new JPasswordField();

    public UsuariosNuevos() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(432, 340));
        this.setTitle("Crear usuario nuevo");
        jTextField2.setBounds(new Rectangle(175, 80, 200, 20));
        jTextField2.setSize(new Dimension(200, 20));
        jTextField1.setBounds(new Rectangle(175, 50, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jLabel2.setText("Correo:");
        jLabel2.setBounds(new Rectangle(40, 80, 120, 16));
        jLabel2.setSize(new Dimension(120, 16));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setFont(new Font("Tahoma", 1, 13));
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(40, 50, 120, 16));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        jLabel4.setText("Activo:");
        jLabel4.setBounds(new Rectangle(40, 180, 120, 16));
        jLabel4.setSize(new Dimension(120, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jLabel3.setText("Contrase\u00f1a:");
        jLabel3.setBounds(new Rectangle(40, 115, 120, 16));
        jLabel3.setSize(new Dimension(120, 16));
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setFont(new Font("Tahoma", 1, 13));
        jButton1.setText("Guardar");
        jButton1.setBounds(new Rectangle(270, 225, 105, 22));
        jButton1.setSize(new Dimension(105, 22));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jButton1_actionPerformed(e);
            }
        });
        jButton2.setText("Regresar");
        jButton2.setBounds(new Rectangle(55, 225, 105, 22));
        jButton2.setSize(new Dimension(105, 22));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jLabel5.setText("Sucursal:");
        jLabel5.setBounds(new Rectangle(40, 145, 120, 16));
        jLabel5.setSize(new Dimension(120, 16));
        jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel5.setFont(new Font("Tahoma", 1, 13));
        jRadioButton1.setText("S\u00ed");
        jRadioButton1.setBounds(new Rectangle(175, 180, 55, 20));
        jRadioButton1.setSelected(true);
        jRadioButton2.setText("No");
        jRadioButton2.setBounds(new Rectangle(240, 180, 86, 18));
        grupo1.add(jRadioButton1);
            grupo1.add(jRadioButton2);

        for(Object sucursal : m_sucursal.getNombresSucursales()){
            jComboBox1.addItem(sucursal);
        }
        jComboBox1.setBounds(new Rectangle(175, 145, 200, 20));

        jPasswordField1.setBounds(new Rectangle(175, 115, 200, 20));
        this.getContentPane().add(jPasswordField1, null);
        this.getContentPane().add(jComboBox1, null);
        this.getContentPane().add(jRadioButton2, null);
        this.getContentPane().add(jRadioButton1, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jTextField2, null);
        setLocationRelativeTo(null);

    }


    private void jButton2_actionPerformed(ActionEvent e) {
        Usuarios users =  new Usuarios();
        users.setVisible(true);
        this.dispose();        
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        String nombre = jTextField1.getText();    
        String correo = jTextField2.getText();
        char[] contrasena = jPasswordField1.getPassword();
        Boolean activo = jRadioButton1.isSelected();
        Integer id_sucursal = jComboBox1.getSelectedIndex();
        
        //Validar
        if( validar.camposVacios(jTextField1,jTextField2,jPasswordField1)  & validar.correo(jTextField2) ){
            //Si valida, guardar
            m_usuario usr = new m_usuario();
            if( usr.agregarUsuario(nombre, correo, contrasena, activo, id_sucursal) ){
                Usuarios usuario = new Usuarios();
                usuario.setVisible(true);
                this.dispose();
            }
        }
    }
}
