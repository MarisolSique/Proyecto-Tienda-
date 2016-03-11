package interfaz;
import metodos.*;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Sucursales extends JFrame {

    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JTable  jTable1  = new JTable();
    private JButton jButton4 = new JButton();
    public static Integer posicion = -1;
    private Button button1 = new Button();

    public Sucursales() {
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

        this.setTitle("Sucursales");
        

        String[] columnNames = { "Nombre","Direcci�n" };
        //Configuraci�n tabla
            jTable1.setFillsViewportHeight(true);
        //Agregar t�tulos de columnas
            aModel.setColumnIdentifiers(columnNames);
        //Agregar filas
            
            List ListaSucursal = m_sucursal.getSucursales();
            int tLista = ListaSucursal.size();
        if (tLista > 0) {            
                for (int i = 0; i < tLista; i++) {
                    Object[] objects = new Object[5];
                    m_sucursal a = (m_sucursal)ListaSucursal.get(i);
                    objects[0] = a.nombre;
                    objects[1] = a.direccion;
                    aModel.addRow(objects);
                }
        }else{
            jTable1.setModel(aModel);
            
        }
        //A�adir modelo personalizado a tabla
        jTable1.setModel(aModel);
        
        
        JScrollPane scrollPane = new JScrollPane(jTable1);
        scrollPane.setBounds(new Rectangle(10, 325, 615, 235));
        scrollPane.setBounds(new Rectangle(20, 320, 615, 235));
        scrollPane.setBounds(new Rectangle(38, 20, 615, 235));

        button1.setLabel("button1");
        jButton4.setText("Eliminar Sucursal");
        jButton4.setBounds(new Rectangle(305, 260, 115, 20));
        jButton4.setSize(new Dimension(115, 20));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton4_actionPerformed(e);
            }
        });
        jButton3.setText("Editar Sucursal");
        jButton3.setBounds(new Rectangle(427, 260, 110, 21));
        jButton3.setSize(new Dimension(110, 21));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jButton2.setText("Nueva Sucursal");
        jButton2.setBounds(new Rectangle(543, 260, 110, 21));
        jButton2.setSize(new Dimension(110, 21));
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
        SucursalesNuevas cli = new SucursalesNuevas();
        cli.setVisible(true);
        this.dispose();
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            SucursalesEdicion edit = new SucursalesEdicion();
            edit.setVisible(true);
            this.dispose();
        }
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            m_sucursal cli = new m_sucursal();
            if( cli.eliminarSucursal(posicion) ){
                aModel.removeRow(posicion);
            }else{
                JOptionPane.showMessageDialog(this, "<html><body>No se ha podido eliminar la sucursal.</body></html>","Error", JOptionPane.WARNING_MESSAGE);            
            }
        }
    }
}
