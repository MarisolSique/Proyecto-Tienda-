package interfaz;

import javax.swing.JButton;

import metodos.*;
import java.awt.Button;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;



public class Opciones extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    private JToggleButton jToggleButton8 = new JToggleButton();
    private Button button1 = new Button();
    private JToggleButton jToggleButton5 = new JToggleButton();
    private JButton jButton1 = new JButton();


    public Opciones() 
    {
        try 
        {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(610, 437));
        this.setTitle("Menú");
        setLocationRelativeTo(null);
        
        jLabel1.setText("¿Que desea realizar?");
        jLabel1.setBounds(new Rectangle(195, 15, 220, 35));
        jLabel1.setFont(new Font("Constantia", 0, 21));
        jToggleButton1.setText("Sucursales");
        jToggleButton1.setBounds(new Rectangle(120, 75, 150, 55));
        jToggleButton1.setActionCommand("Sucursales");
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        jToggleButton2.setText("Productos");
        jToggleButton2.setBounds(new Rectangle(325, 75, 150, 55));
        jToggleButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton2_actionPerformed(e);
                }
            });
        jToggleButton3.setText("Usuarios");
        jToggleButton3.setBounds(new Rectangle(325, 145, 150, 55));
        jToggleButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton3_actionPerformed(e);
                }
            });
        jToggleButton4.setText("Clientes");
        jToggleButton4.setBounds(new Rectangle(120, 145, 150, 55));
        jToggleButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton4_actionPerformed(e);
            }
        });
        jToggleButton8.setText("Salir");
        jToggleButton8.setBounds(new Rectangle(25, 345, 190, 40));
        jToggleButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton8_actionPerformed(e);
                }
            });
        button1.setLabel("Demo");
        button1.setBounds(new Rectangle(510, 10, 72, 21));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1_actionPerformed(e);
            }
        });
        jToggleButton5.setText("Facturacion");
        jToggleButton5.setBounds(new Rectangle(120, 220, 150, 55));
        jToggleButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton5_actionPerformed(e);
            }
        });
        jButton1.setText("Reporte de facturaci\u00f3n");
        jButton1.setBounds(new Rectangle(325, 220, 150, 55));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jToggleButton5, null);
        this.getContentPane().add(button1, null);
        this.getContentPane().add(jToggleButton8, null);
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    {
        Sucursales su = new Sucursales();
        su.setVisible(true);
        this.dispose();
    }

    private void jToggleButton2_actionPerformed(ActionEvent e) 
    {
        Productos pro = new Productos();
        pro.setVisible(true);
        this.dispose();
    }

    private void jToggleButton3_actionPerformed(ActionEvent e) 
    {
        Usuarios users =  new Usuarios();
        users.setVisible(true);
        this.dispose();
    }

    private void jToggleButton8_actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }

    private void jToggleButton4_actionPerformed(ActionEvent e) {
        Clientes cli = new Clientes();
        cli.setVisible(true);
        this.dispose();
    }

    private void button1_actionPerformed(ActionEvent e) {
        //Métodos
        m_usuario usr = new m_usuario();
        m_cliente cli = new m_cliente();
        m_sucursal sc = new m_sucursal();
        m_producto pro = new m_producto();
        for(int i=0;i<10;i++){
            Random random = new Random();
            //Agregar clientes
            int nit = 1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1));
            cli.agregarCliente("Cliente_"+i, "cliente"+i+"@nuevo.com", "12345678", "direccion", nit+"-"+random.nextInt(10), false, false, null);
            //Agregar sucursales
            sc.agregarSucursal("Sucursal_"+i, "direccion_"+i);
            //Agregar usuarios
            char[] ps = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
            usr.agregarUsuario("Usuario_"+i, "usuario"+i+"@nuevo.com", ps, true,i);
            //Agregar productos
            pro.agregarProducto("codigo_"+i, "producto_"+i, Float.parseFloat( random.nextInt(99)+"."+random.nextInt(99) ) );
            
        }
    }

    private void jToggleButton5_actionPerformed(ActionEvent e) {
        FacturaNueva fact = new FacturaNueva();
        fact.setVisible(true);
        this.dispose();
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        FacturasReporte fact = new FacturasReporte();
        fact.setVisible(true);
        this.dispose();
    }
}
