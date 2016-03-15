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

public class FacturasReporte extends JFrame {

    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JTable  jTable1  = new JTable();
    private JButton jButton4 = new JButton();
    private Button button1 = new Button();
    public static Integer posicion = -1;

    public FacturasReporte() {
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

        this.setTitle("Listado de clientes");
        

        String[] columnNames = { "Nombre", "Correo", "NIT", "Cheque", "Crédito" };
        //Configuración tabla
            jTable1.setFillsViewportHeight(true);
        //Agregar títulos de columnas
            aModel.setColumnIdentifiers(columnNames);
        //Agregar filas
            
            List listaClientes = m_cliente.getClientes();
            int tLista = listaClientes.size();
        if (tLista > 0) {            
                for (int i = 0; i < tLista; i++) {
                    Object[] objects = new Object[5];
                    m_cliente a = (m_cliente)listaClientes.get(i);
                    objects[0] = a.nombre;
                    objects[1] = a.correo;
                    objects[2] = a.nit;
                    objects[3] = a.usa_cheque;
                    objects[4] = a.usa_credito;
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
        jButton4.setText("Eliminar cliente");
        jButton4.setBounds(new Rectangle(305, 260, 110, 21));
        jButton4.setSize(new Dimension(110, 21));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton4_actionPerformed(e);
            }
        });
        jButton3.setText("Editar cliente");
        jButton3.setBounds(new Rectangle(424, 260, 110, 21));
        jButton3.setSize(new Dimension(110, 21));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3_actionPerformed(e);
            }
        });
        jButton2.setText("Nuevo cliente");
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
        ClientesNuevos cli = new ClientesNuevos();
        cli.setVisible(true);
        this.dispose();
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            ClientesEdicion cli = new ClientesEdicion();
            cli.setVisible(true);
            this.dispose();
        }
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        posicion = jTable1.getSelectedRow();
        if(posicion>=0){
            m_cliente cli = new m_cliente();
            if( cli.eliminarCliente(posicion) ){
                aModel.removeRow(posicion);
            }else{
                JOptionPane.showMessageDialog(this, "<html><body>No se ha podido eliminar el cliente.</body></html>","Error", JOptionPane.WARNING_MESSAGE);            
            }
        }
    }
}
