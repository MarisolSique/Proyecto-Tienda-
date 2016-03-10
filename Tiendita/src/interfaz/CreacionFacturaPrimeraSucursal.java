
package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.SystemColor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingConstants;

public class CreacionFacturaPrimeraSucursal extends JFrame {


    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTable jTable1 = new JTable();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JSeparator jSeparator2 = new JSeparator();
    private JSeparator jSeparator3 = new JSeparator();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JTextArea jTextArea6 = new JTextArea();
    private JSeparator jSeparator4 = new JSeparator();
    private JLabel jLabel10 = new JLabel();
    private JSeparator jSeparator5 = new JSeparator();
    private JSeparator jSeparator6 = new JSeparator();
    private JSeparator jSeparator7 = new JSeparator();
    private JTextArea jTextArea7 = new JTextArea();
    private JTextArea jTextArea8 = new JTextArea();
    private JTextArea jTextArea9 = new JTextArea();
    private JTextArea jTextArea10 = new JTextArea();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JRadioButton jRadioButton3 = new JRadioButton();
    private JLabel jLabel13 = new JLabel();
    private JTextArea jTextArea11 = new JTextArea();
    private JLabel jLabel14 = new JLabel();
    private JTextArea jTextArea12 = new JTextArea();

    public CreacionFacturaPrimeraSucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(649, 670));
        jLabel1.setText("La Tiendita");
        jLabel1.setBounds(new Rectangle(230, 15, 190, 25));
        jLabel1.setFont(new Font("Constantia", 3, 30));
        jLabel1.setForeground(new Color(85, 85, 220));
        jLabel2.setText("FACTURA serie \"A\"");
        jLabel2.setBounds(new Rectangle(30, 65, 150, 35));
        jLabel2.setFont(new Font("Constantia", 1, 16));
        jLabel2.setForeground(new Color(84, 84, 215));
        jTable1.setBounds(new Rectangle(325, 310, 0, 0));
        jSeparator1.setBounds(new Rectangle(435, 260, 0, 2));
        jLabel3.setText("               FECHA");
        jLabel3.setBounds(new Rectangle(360, 95, 185, 20));
        jLabel3.setBackground(new Color(231, 57, 0));
        jLabel3.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel3.setAlignmentX((float) 1.0);
        jLabel3.setFont(new Font("Constantia", 1, 17));
        jLabel4.setText("         DIA");
        jLabel4.setBounds(new Rectangle(360, 115, 80, 20));
        jLabel4.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel4.setFont(new Font("Constantia", 1, 13));
        jLabel5.setText("    MES");
        jLabel5.setBounds(new Rectangle(440, 115, 50, 20));
        jLabel5.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel5.setFont(new Font("Constantia", 1, 13));
        jLabel6.setText("    A\u00d1O");
        jLabel6.setBounds(new Rectangle(490, 115, 55, 20));
        jLabel6.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel6.setFont(new Font("Constantia", 1, 13));
        jLabel7.setText("SE\u00d1OR:");
        jLabel7.setBounds(new Rectangle(30, 170, 65, 25));
        jLabel7.setFont(new Font("Constantia", 0, 13));
        jLabel8.setText("DIRECCI\u00d3N:");
        jLabel8.setBounds(new Rectangle(30, 205, 90, 15));
        jLabel8.setFont(new Font("Constantia", 0, 13));
        jLabel9.setText("NIT:");
        jLabel9.setBounds(new Rectangle(375, 240, 70, 25));
        jLabel9.setFont(new Font("Constantia", 0, 13));
        jTextArea1.setBounds(new Rectangle(90, 170, 515, 25));
        jTextArea1.setBackground(new Color(215, 215, 215));
        jTextArea2.setBounds(new Rectangle(120, 205, 485, 25));
        jTextArea2.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea2.setBackground(new Color(215, 215, 215));
        jTextArea3.setBounds(new Rectangle(30, 310, 380, 165));
        jTextArea3.setBackground(new Color(215, 215, 215));
        jTextArea3.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jSeparator2.setBounds(new Rectangle(30, 160, 585, 2));
        jSeparator3.setBounds(new Rectangle(370, 210, 0, 2));
        jTextArea4.setBounds(new Rectangle(360, 135, 80, 25));
        jTextArea4.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jTextArea4.setBackground(new Color(215, 215, 215));
        jTextArea5.setBounds(new Rectangle(440, 135, 50, 25));
        jTextArea5.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jTextArea5.setBackground(new Color(215, 215, 215));
        jTextArea6.setBounds(new Rectangle(490, 135, 55, 25));
        jTextArea6.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jTextArea6.setBackground(new Color(215, 215, 215));
        jSeparator4.setBounds(new Rectangle(30, 275, 580, 2));
        jLabel10.setText("                          DESCRIPCION                                                           TOTAL");
        jLabel10.setBounds(new Rectangle(35, 285, 575, 25));
        jLabel10.setFont(new Font("Constantia", 1, 15));
        jSeparator5.setBounds(new Rectangle(105, 425, 0, 2));
        jSeparator6.setBounds(new Rectangle(30, 270, 580, 2));
        jSeparator7.setBounds(new Rectangle(30, 305, 580, 2));
        jTextArea7.setBounds(new Rectangle(410, 310, 200, 165));
        jTextArea7.setBackground(new Color(215, 215, 215));
        jTextArea7.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jTextArea8.setBounds(new Rectangle(415, 240, 190, 25));
        jTextArea8.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea8.setBackground(new Color(215, 215, 215));
        jTextArea9.setBounds(new Rectangle(30, 480, 380, 30));
        jTextArea9.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea9.setBackground(new Color(215, 215, 215));
        jTextArea9.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jTextArea10.setBounds(new Rectangle(410, 480, 200, 30));
        jTextArea10.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea10.setBackground(new Color(215, 215, 215));
        jTextArea10.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel11.setText("Original: Cliente            ");
        jLabel11.setBounds(new Rectangle(25, 595, 205, 25));
        jLabel11.setFont(new Font("Constantia", 1, 12));
        jLabel12.setText("Duplicado: Contabilidad");
        jLabel12.setBounds(new Rectangle(25, 605, 205, 25));
        jLabel12.setFont(new Font("Constantia", 1, 12));
        jToggleButton1.setText("Terminar");
        jToggleButton1.setBounds(new Rectangle(285, 580, 107, 21));
        jToggleButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton1_actionPerformed(e);
            }
        });
        jToggleButton2.setText("Borrar Datos");
        jToggleButton2.setBounds(new Rectangle(405, 580, 107, 21));
        jToggleButton3.setText("Guardar");
        jToggleButton3.setBounds(new Rectangle(525, 580, 107, 21));
        jRadioButton1.setText("Efectivo");
        jRadioButton1.setBounds(new Rectangle(505, 510, 105, 25));
        jRadioButton2.setText("Credito");
        jRadioButton2.setBounds(new Rectangle(505, 535, 105, 20));
        jRadioButton3.setText("Cheque");
        jRadioButton3.setBounds(new Rectangle(30, 515, 86, 18));
        jLabel13.setText("Banco");
        jLabel13.setBounds(new Rectangle(30, 540, 40, 20));
        jTextArea11.setBounds(new Rectangle(65, 565, 155, 20));
        jTextArea11.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea11.setBackground(new Color(215, 215, 215));
        jTextArea11.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel14.setText("No. ");
        jLabel14.setBounds(new Rectangle(30, 565, 40, 20));
        jTextArea12.setBounds(new Rectangle(65, 540, 155, 20));
        jTextArea12.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea12.setBackground(new Color(215, 215, 215));
        jTextArea12.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        this.getContentPane().add(jTextArea12, null);
        this.getContentPane().add(jLabel14, null);
        this.getContentPane().add(jTextArea11, null);
        this.getContentPane().add(jLabel13, null);
        this.getContentPane().add(jRadioButton3, null);
        this.getContentPane().add(jRadioButton2, null);
        this.getContentPane().add(jRadioButton1, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel12, null);
        this.getContentPane().add(jLabel11, null);
        this.getContentPane().add(jTextArea10, null);
        this.getContentPane().add(jTextArea9, null);
        this.getContentPane().add(jTextArea8, null);
        this.getContentPane().add(jTextArea7, null);
        this.getContentPane().add(jSeparator7, null);
        this.getContentPane().add(jSeparator6, null);
        this.getContentPane().add(jSeparator5, null);
        this.getContentPane().add(jLabel10, null);
        this.getContentPane().add(jSeparator4, null);
        this.getContentPane().add(jTextArea6, null);
        this.getContentPane().add(jTextArea5, null);
        this.getContentPane().add(jTextArea4, null);
        this.getContentPane().add(jSeparator3, null);
        this.getContentPane().add(jSeparator2, null);
        this.getContentPane().add(jTextArea3, null);
        this.getContentPane().add(jTextArea2, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jLabel9, null);
        this.getContentPane().add(jLabel8, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jSeparator1, null);
        this.getContentPane().add(jTable1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel3, null);
        setLocationRelativeTo(null);

    }

    private void jToggleButton1_actionPerformed(ActionEvent e) {
        Facturación1sucursal fact = new Facturación1sucursal();
        fact.setVisible(true);
        this.dispose();
    }
}
