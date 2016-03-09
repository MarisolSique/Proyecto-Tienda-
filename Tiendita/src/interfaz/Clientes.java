package interfaz;

import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clientes extends JFrame {

    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public Clientes() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(692, 361));

        //
        DefaultTableModel aModel = new DefaultTableModel() {
            //Tabla read-only
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] columnNames = { "Nombre", "Correo", "NIT", "Cheque", "Crédito" };
        //Configuración tabla
            JTable jTable1 = new JTable();
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
        scrollPane.setBounds(new Rectangle(45, 20, 615, 235));

        jButton2.setText("Nuevo usuario");
        jButton2.setBounds(new Rectangle(555, 260, 105, 21));
        jButton2.setSize(new Dimension(105, 21));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        jButton1.setText("Regresar...");
        jButton1.setBounds(new Rectangle(440, 260, 105, 21));
        jButton1.setActionCommand("");
        jButton1.setSize(new Dimension(105, 21));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        scrollPane.setSize(615, 235);

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
}
