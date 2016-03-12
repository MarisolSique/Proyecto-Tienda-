package interfaz;

import metodos.*;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Productos extends JFrame {

    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JTable  jTable1  = new JTable();
    private JButton jButton4 = new JButton();
    public static Integer posicion = -1;
    private Button button1 = new Button();

    public Productos() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    DefaultTableModel aModel = new DefaultTableModel() {
        //Tabla read-only
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(692, 326));

        this.setTitle("Listado de Productos");
        

        String[] columnNames = { "Código", "Nombre", "Costo por Unidad"  };
        //Configuración tabla
            jTable1.setFillsViewportHeight(true);
        //Agregar títulos de columnas
            aModel.setColumnIdentifiers(columnNames);
        //Agregar filas
            
            List listaProductos = m_producto.getProductos();
            int tLista = listaProductos.size();
        if (tLista > 0) {            
                for (int i = 0; i < tLista; i++) {
                    Object[] objects = new Object[3];
                    m_producto a = (m_producto)listaProductos.get(i);
                    objects[0] = a.codigo;
                    objects[1] = a.nombre;
                    objects[2] = a.precio_unitario;
                    aModel.addRow(objects);
                }
        }else{
            jTable1.setModel(aModel);
            
        }
        //Añadir modelo personalizado a tabla
        jTable1.setModel(aModel);
        
        
        JScrollPane scrollPane = new JScrollPane(jTable1);
        scrollPane.setBounds(new Rectangle(10, 325, 615, 235));
        scrollPane.setBounds(new Rectangle(20, 320, 615, 235));
        scrollPane.setBounds(new Rectangle(38, 20, 615, 235));

        button1.setLabel("button1");
        jButton4.setText("Eliminar producto");
        jButton4.setBounds(new Rectangle(270, 260, 125, 20));
        jButton4.setSize(new Dimension(125, 21));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton4_actionPerformed(e);
            }
        });
        jButton3.setText("Editar producto");
        jButton3.setBounds(new Rectangle(403, 260, 125, 20));
        jButton3.setSize(new Dimension(125, 20));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jButton2.setText("Nuevo producto");
        jButton2.setBounds(new Rectangle(535, 260, 120, 20));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jButton1.setText("Regresar...");
        jButton1.setBounds(new Rectangle(38, 260, 120, 21));
        jButton1.setActionCommand("");
        jButton1.setSize(new Dimension(120, 21));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        scrollPane.setSize(615, 235);

        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(scrollPane, null);
        setLocationRelativeTo(null);

    }

    private void jButton1_actionPerformed(ActionEvent e) {
        Opciones opc = new Opciones();
        opc.setVisible(true);
        this.dispose();
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        ProductosNuevos pro = new ProductosNuevos();
        pro.setVisible(true);
        this.dispose();
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            ProductosEdicion pro = new ProductosEdicion();
            pro.setVisible(true);
            this.dispose();
        }
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            m_producto pro = new m_producto();
            if( pro.eliminarProducto(posicion) ){
                aModel.removeRow(posicion);
            }else{
                JOptionPane.showMessageDialog(this, "<html><body>No se ha podido eliminar el producto.</body></html>","Error", JOptionPane.WARNING_MESSAGE);            
            }
        }
    }
}
