
package interfaz;

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

public class CreacionUsuarios extends JFrame {


    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextField jTextField3 = new JTextField();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();

    public CreacionUsuarios() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(605, 407));
        jTextField2.setBounds(new Rectangle(150, 70, 200, 20));
        jTextField2.setSize(new Dimension(200, 20));
        jTextField1.setBounds(new Rectangle(150, 35, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField1_actionPerformed(e);
            }
        });
        jLabel2.setText("Correo:");
        jLabel2.setBounds(new Rectangle(25, 70, 120, 16));
        jLabel2.setSize(new Dimension(120, 16));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setFont(new Font("Tahoma", 1, 13));
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(20, 35, 120, 20));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        jTextArea1.setBounds(new Rectangle(150, 140, 200, 45));
        jTextArea1.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jTextField3.setBounds(new Rectangle(150, 105, 200, 20));
        jTextField3.setSize(new Dimension(200, 20));
        jLabel4.setText("Direcci\u00f3n:");
        jLabel4.setBounds(new Rectangle(25, 155, 120, 16));
        jLabel4.setSize(new Dimension(120, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jLabel3.setText("Tel\u00e9fono:");
        jLabel3.setBounds(new Rectangle(25, 105, 120, 16));
        jLabel3.setSize(new Dimension(120, 16));
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setFont(new Font("Tahoma", 1, 13));
        jButton1.setText("Guardar");
        jButton1.setBounds(new Rectangle(295, 310, 75, 21));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
            }
        });
        jButton2.setText("Regresar");
        jButton2.setBounds(new Rectangle(15, 310, 105, 20));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jButton3.setText("Borrar Datos");
        jButton3.setBounds(new Rectangle(150, 310, 115, 20));
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jTextField2, null);
        setLocationRelativeTo(null);

    }

    private void jTextField1_actionPerformed(ActionEvent e) {
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        EdicionUsuarios edi= new EdicionUsuarios();
        edi.setVisible(true);
        this.dispose();
        
    }
}
