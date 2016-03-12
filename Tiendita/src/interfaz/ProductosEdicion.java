package interfaz;
import metodos.*;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ProductosEdicion extends JFrame {
    String id;
    private Integer posicion;
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public ProductosEdicion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(432, 289));
        this.setTitle("Crear producto nuevo");
        jLabel1.setText("C\u00f3digo:");
        jLabel1.setBounds(new Rectangle(35, 45, 120, 16));
        jLabel1.setSize(new Dimension(120, 16));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        jLabel2.setText("Nombre:");
        jLabel2.setBounds(new Rectangle(35, 90, 120, 16));
        jLabel2.setSize(new Dimension(120, 16));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setFont(new Font("Tahoma", 1, 13));
        jLabel3.setText("Precio unitario:");
        jLabel3.setBounds(new Rectangle(35, 135, 120, 16));
        jLabel3.setSize(new Dimension(120, 16));
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setFont(new Font("Tahoma", 1, 13));

        jTextField1.setBounds(new Rectangle(165, 45, 200, 20));
        jTextField1.setSize(new Dimension(200, 20));
        jTextField2.setBounds(new Rectangle(165, 90, 200, 20));
        jTextField2.setSize(new Dimension(200, 20));
        jTextField3.setBounds(new Rectangle(165, 135, 200, 20));
        jTextField3.setSize(new Dimension(200, 20));

        //Obtener y popular información
            posicion = Productos.posicion;
            m_producto c = new m_producto();
            m_producto producto = c.obtenerProducto(posicion);
            id = producto.id;
        jTextField1.setText(producto.codigo);
        jTextField2.setText(producto.nombre);
        jTextField3.setText(Float.toString(producto.precio_unitario));
        
        jButton1.setText("Regresar ...");
        jButton1.setBounds(new Rectangle(50, 180, 105, 22));
        jButton1.setSize(new Dimension(105, 22));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jButton2.setText("Guardar");
        jButton2.setBounds(new Rectangle(260, 180, 105, 22));
        jButton2.setSize(new Dimension(105, 22));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        setLocationRelativeTo(null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        Productos pro = new Productos();
        pro.setVisible(true);
        this.dispose();
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        
        String codigo = jTextField1.getText();    
        String nombre = jTextField2.getText();
        Float precio_unitario = Float.parseFloat(jTextField3.getText());
        
        //Validar
        if( validar.camposVacios(jTextField1,jTextField2,jTextField3) & validar.Numerico(jTextField3) ){
            //Si valida, actualizar
            m_producto pro = new m_producto();
            if( pro.editarProducto(posicion, id,codigo, nombre, precio_unitario) ){  
                Productos producto = new Productos();
                producto.setVisible(true);
                this.dispose();
            }
        }
        
    }

}
