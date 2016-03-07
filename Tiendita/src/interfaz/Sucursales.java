package interfaz;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Sucursales extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToolBar jToolBar1 = new JToolBar();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    private JToggleButton jToggleButton5 = new JToggleButton();
    private JToggleButton jToggleButton6 = new JToggleButton();

    public Sucursales() 
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
        this.setSize(new Dimension(447, 339));
        this.setTitle("Sucursales ");
        setLocationRelativeTo(null);
        
        jLabel1.setText("Escoja Sucursal que desea:");
        jLabel1.setBounds(new Rectangle(90, 15, 265, 30));
        jLabel1.setFont(new Font("Constantia", 0, 20));
        jLabel1.setForeground(new Color(49, 49, 255));
        jToggleButton1.setText("Primera Sucursal");
        jToggleButton1.setBounds(new Rectangle(55, 80, 140, 20));
        jToggleButton1.setFont(new Font("Constantia", 0, 13));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        jToggleButton2.setText("Segunda Sucursal");
        jToggleButton2.setBounds(new Rectangle(270, 80, 140, 20));
        jToggleButton2.setFont(new Font("Constantia", 0, 13));
        jToggleButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton2_actionPerformed(e);
                }
            });
        jToggleButton3.setText("Tercera Sucursal");
        jToggleButton3.setBounds(new Rectangle(55, 145, 140, 20));
        jToggleButton3.setFont(new Font("Constantia", 0, 13));
        jToggleButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton3_actionPerformed(e);
                }
            });
        jToggleButton4.setText("Cuarta Sucursal");
        jToggleButton4.setBounds(new Rectangle(270, 145, 140, 20));
        jToggleButton4.setFont(new Font("Constantia", 0, 13));
        jToggleButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton4_actionPerformed(e);
                }
            });
        jToggleButton5.setText("Quinta Sucursal");
        jToggleButton5.setBounds(new Rectangle(145, 205, 170, 20));
        jToggleButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton5_actionPerformed(e);
                }
            });
        jToggleButton6.setText("Regresar a Menu");
        jToggleButton6.setBounds(new Rectangle(305, 270, 107, 21));
        jToggleButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton6_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton6, null);
        this.getContentPane().add(jToggleButton5, null);
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    {
        PrimeraSucursal prim = new PrimeraSucursal();
        prim.setVisible(true);
        this.dispose();    
    }

    private void jToggleButton2_actionPerformed(ActionEvent e) 
    {
        SegundaSucursal seg = new SegundaSucursal();
        seg.setVisible(true);
        this.dispose();
    }

    private void jToggleButton3_actionPerformed(ActionEvent e)
    {
        TerceraSucursal ter = new TerceraSucursal();
        ter.setVisible(true);
        this.dispose();
    }

    private void jToggleButton4_actionPerformed(ActionEvent e) 
    {
        CuartaSucursal cuarta = new CuartaSucursal();
        cuarta.setVisible(true);
        this.dispose();
    }

    private void jToggleButton5_actionPerformed(ActionEvent e) 
    {
        QuintaSucursal quinta = new QuintaSucursal();
        quinta.setVisible(true);
        this.dispose();
    }

    private void jToggleButton6_actionPerformed(ActionEvent e) 
    {
        Opciones opsi = new Opciones();
        opsi.setVisible(true);
        this.dispose();
    }
}
