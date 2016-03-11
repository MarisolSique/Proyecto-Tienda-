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
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ClientesEdicion extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextField jTextField4 = new JTextField();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JRadioButton jRadioButton3 = new JRadioButton();
    private JRadioButton jRadioButton4 = new JRadioButton();
    private ButtonGroup grupo1 = new ButtonGroup();
    private ButtonGroup grupo2 = new ButtonGroup();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
     Integer id;
    private Integer posicion;

    public ClientesEdicion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(432, 461));
        this.setTitle("Actualizar datos de cliente");
        
        
        //Definir campos
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(20, 37, 120, 16));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        jLabel2.setText("Correo:");
        jLabel2.setBounds(new Rectangle(20, 82, 120, 16));
        jLabel2.setSize(new Dimension(120, 16));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setFont(new Font("Tahoma", 1, 13));
        jLabel3.setText("Tel\u00e9fono:");
        jLabel3.setBounds(new Rectangle(20, 127, 120, 16));
        jLabel3.setSize(new Dimension(120, 16));
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setFont(new Font("Tahoma", 1, 13));
        jLabel4.setText("Direcci\u00f3n:");
        jLabel4.setBounds(new Rectangle(20, 160, 120, 16));
        jLabel4.setSize(new Dimension(120, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jLabel5.setText("NIT:");
        jLabel5.setBounds(new Rectangle(20, 260, 120, 16));
        jLabel5.setSize(new Dimension(120, 16));
        jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel5.setFont(new Font("Tahoma", 1, 13));
        jLabel6.setText("Aceptar cheque:");
        jLabel6.setBounds(new Rectangle(20, 290, 120, 16));
        jLabel6.setSize(new Dimension(120, 16));
        jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel6.setFont(new Font("Tahoma", 1, 13));
        jLabel7.setText("Tiene cr\u00e9dito:");
        jLabel7.setBounds(new Rectangle(20, 330, 120, 16));
        jLabel7.setSize(new Dimension(120, 16));
        jLabel7.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel7.setFont(new Font("Tahoma", 1, 13));
        jTextField1.setBounds(new Rectangle(150, 35, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jTextField2.setBounds(new Rectangle(150, 80, 200, 20));
        jTextField2.setSize(new Dimension(200, 20));
        jTextField3.setBounds(new Rectangle(150, 125, 200, 20));
        jTextField3.setSize(new Dimension(200, 20));
        jTextArea1.setBounds(new Rectangle(150, 160, 200, 85));
        jTextArea1.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jTextField4.setBounds(new Rectangle(150, 255, 200, 20));
        jTextField4.setSize(new Dimension(200, 20));
        jRadioButton1.setText("S\u00ed");
        jRadioButton1.setBounds(new Rectangle(155, 290, 50, 20));
        jRadioButton2.setText("No");
        jRadioButton2.setBounds(new Rectangle(227, 290, 50, 20));
        jRadioButton3.setText("S\u00ed");
        jRadioButton3.setBounds(new Rectangle(155, 330, 50, 20));
        jRadioButton4.setText("No");
        jRadioButton4.setBounds(new Rectangle(225, 330, 55, 20));

        //Obtener y popular información
            posicion = Clientes.posicion;
            m_cliente c = new m_cliente();
            m_cliente cliente = c.obtenerCliente(posicion);
            id = cliente.id;
        jTextField1.setText(cliente.nombre);
        jTextField2.setText(cliente.correo);
        jTextField3.setText(cliente.telefono);
        jTextArea1.setText(cliente.direccion);
        jTextField4.setText(cliente.nit);
        if(cliente.usa_cheque){ jRadioButton1.setSelected(true); }else{ jRadioButton2.setSelected(true); }
        if(cliente.usa_credito){ jRadioButton3.setSelected(true); }else{ jRadioButton4.setSelected(true); }
        
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
        grupo1.add(jRadioButton1);
        grupo1.add(jRadioButton2);
        grupo2.add(jRadioButton3);
        grupo2.add(jRadioButton4);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jRadioButton4, null);
        this.getContentPane().add(jRadioButton3, null);
        this.getContentPane().add(jRadioButton2, null);
        this.getContentPane().add(jRadioButton1, null);
        this.getContentPane().add(jTextField4, null);
        this.getContentPane().add(jTextArea1, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        setLocationRelativeTo(null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        Clientes cli = new Clientes();
        cli.setVisible(true);
        this.dispose();
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        
        String nombre = jTextField1.getText();    
        String correo = jTextField2.getText();
        String telefono = jTextField3.getText();
        String direccion = jTextArea1.getText();
        String nit = jTextField4.getText();
        Boolean usa_cheque = jRadioButton1.isSelected();
        Boolean usa_credito = jRadioButton3.isSelected();
        
        //Validar
        if( validar.camposVacios(jTextField1,jTextField2,jTextField3,jTextField4) & validar.areasVacias(jTextArea1) & validar.correo(jTextField2) ){
            //Si valida, actualizar
            m_cliente cli = new m_cliente();
            if( cli.editarCliente(posicion,id,nombre, correo, telefono, direccion, nit, usa_cheque, usa_credito, null) ){
                Clientes cliente = new Clientes();
                cliente.setVisible(true);
                this.dispose();
            }
        }
        
    }
}
