package interfaz;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Opciones extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    private JToggleButton jToggleButton7 = new JToggleButton();
    private JToggleButton jToggleButton8 = new JToggleButton();


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
        jToggleButton1.setText("Edición de Sucursales");
        jToggleButton1.setBounds(new Rectangle(120, 75, 150, 55));
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
        jToggleButton3.setText("Edición de Usuarios");
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
        jToggleButton7.setText("Ir a Sucursales");
        jToggleButton7.setBounds(new Rectangle(395, 345, 190, 40));
        jToggleButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton7_actionPerformed(e);
                }
            });
        jToggleButton8.setText("Salir");
        jToggleButton8.setBounds(new Rectangle(25, 345, 190, 40));
        jToggleButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton8_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton8, null);
        this.getContentPane().add(jToggleButton7, null);
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jToggleButton7_actionPerformed(ActionEvent e)
    {
        Sucursales su = new Sucursales();
        su.setVisible(true);
        this.dispose();
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    {
     EdicionSucursales Edi = new EdicionSucursales();
     Edi.setVisible(true);
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
}
