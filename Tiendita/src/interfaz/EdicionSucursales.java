package interfaz;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class EdicionSucursales extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextArea jTextArea1 = new JTextArea();
    private ButtonGroup grupo1 = new ButtonGroup();
    private ButtonGroup grupo2 = new ButtonGroup();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    public static Integer id = -1;

    public EdicionSucursales() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(432, 461));
        this.setTitle("Actualizar datos de sucursal");
        
        
        //Definir campos
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(20, 37, 120, 16));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        jLabel4.setText("Direcci\u00f3n:");
        jLabel4.setBounds(new Rectangle(20, 160, 120, 16));
        jLabel4.setSize(new Dimension(120, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jTextField1.setBounds(new Rectangle(150, 35, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jTextArea1.setBounds(new Rectangle(150, 160, 200, 85));
        jTextArea1.setBorder(BorderFactory.createLineBorder(Color.lightGray));

        //Obtener y popular información
            id = EdicionSucursales.id;
            m_sucursal c = new m_sucursal();
            m_sucursal sucursal = c.obtenerSucursal(id);
        jTextField1.setText(sucursal.nombre);
        jTextArea1.setText(sucursal.direccion);
        
        jButton1.setText("Regresar ...");
        jButton1.setBounds(new Rectangle(35, 370, 105, 22));
        jButton1.setSize(new Dimension(105, 22));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jButton2.setText("Guardar");
        jButton2.setBounds(new Rectangle(245, 370, 105, 22));
        jButton2.setSize(new Dimension(105, 22));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel1, null);
        setLocationRelativeTo(null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        EdicionSucursales suc = new EdicionSucursales();
        suc.setVisible(true);
        this.dispose();
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        
        String nombre = jTextField1.getText();    
        String direccion = jTextArea1.getText();
        
        //Validar
        if( validar.camposVacios(jTextField1) & validar.areasVacias(jTextArea1) ){
            //Si valida, actualizar
            m_sucursal suc = new m_sucursal();
            if( suc.editarSucursal(id,nombre, direccion) ){
                Sucursales sucursal = new Sucursales();
                sucursal.setVisible(true);
                this.dispose();
            }
        }
        
    }
}
