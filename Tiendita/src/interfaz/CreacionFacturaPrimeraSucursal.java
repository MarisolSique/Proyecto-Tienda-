
package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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

    public CreacionFacturaPrimeraSucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(649, 621));
        jLabel1.setText("La Tiendita");
        jLabel1.setBounds(new Rectangle(230, 15, 190, 25));
        jLabel1.setFont(new Font("Constantia", 3, 30));
        jLabel1.setForeground(new Color(85, 85, 220));
        jLabel2.setText("FACTURA serie \"A\"");
        jLabel2.setBounds(new Rectangle(30, 75, 150, 35));
        jLabel2.setFont(new Font("Constantia", 1, 16));
        jLabel2.setForeground(new Color(84, 84, 215));
        jTable1.setBounds(new Rectangle(325, 310, 0, 0));
        jSeparator1.setBounds(new Rectangle(435, 260, 0, 2));
        jLabel3.setText("FECHA");
        jLabel3.setBounds(new Rectangle(360, 115, 185, 20));
        jLabel3.setBackground(new Color(231, 57, 0));
        jLabel3.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel3.setAlignmentX((float) 1.0);
        jLabel3.setFont(new Font("Constantia", 1, 17));
        jLabel4.setText("DIA");
        jLabel4.setBounds(new Rectangle(360, 135, 80, 20));
        jLabel4.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel4.setFont(new Font("Constantia", 1, 13));
        jLabel5.setText("MES");
        jLabel5.setBounds(new Rectangle(440, 135, 50, 20));
        jLabel5.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel5.setFont(new Font("Constantia", 1, 13));
        jLabel6.setText("A\u00d1O");
        jLabel6.setBounds(new Rectangle(490, 135, 55, 20));
        jLabel6.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel6.setFont(new Font("Constantia", 1, 13));
        jLabel7.setText("SE\u00d1OR:");
        jLabel7.setBounds(new Rectangle(30, 210, 65, 25));
        jLabel7.setFont(new Font("Constantia", 0, 13));
        jLabel8.setText("DIRECCI\u00d3N:");
        jLabel8.setBounds(new Rectangle(30, 245, 90, 15));
        jLabel8.setFont(new Font("Constantia", 0, 13));
        jLabel9.setText("NIT:");
        jLabel9.setBounds(new Rectangle(370, 270, 70, 25));
        jLabel9.setFont(new Font("Constantia", 0, 13));
        jTextArea1.setBounds(new Rectangle(90, 210, 485, 25));
        jTextArea2.setBounds(new Rectangle(120, 240, 455, 25));
        jTextArea3.setBounds(new Rectangle(400, 270, 175, 25));
        jSeparator2.setBounds(new Rectangle(30, 180, 585, 2));
        jSeparator3.setBounds(new Rectangle(370, 210, 0, 2));
        jTextArea4.setBounds(new Rectangle(360, 155, 80, 25));
        jTextArea5.setBounds(new Rectangle(440, 155, 50, 25));
        jTextArea6.setBounds(new Rectangle(490, 155, 55, 25));
        jSeparator4.setBounds(new Rectangle(30, 300, 580, 2));
        jLabel10.setText("DESCRIPCION                                                                                                                                     TOTAL");
        jLabel10.setBounds(new Rectangle(35, 320, 575, 25));
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

}