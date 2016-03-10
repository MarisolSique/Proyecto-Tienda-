
package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class ClientesPrimeraSucursal extends JFrame {


    private JTable jTable1 = new JTable();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    public static Integer id = -1;
    
    public ClientesPrimeraSucursal() {
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
        this.setSize(new Dimension(712, 407));
        
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
        
        
        jTable1.setBounds(new Rectangle(40, 45, 600, 220));
        jToggleButton1.setText("Regresar");
        jToggleButton1.setBounds(new Rectangle(25, 335, 107, 21));
        jToggleButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton1_actionPerformed(e);
            }
        });
        jToggleButton2.setText("Eliminar");
        jToggleButton2.setBounds(new Rectangle(270, 330, 107, 21));
        jToggleButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton2_actionPerformed(e);
            }
        });
        jToggleButton3.setText("Editar Cliente");
        jToggleButton3.setBounds(new Rectangle(395, 330, 107, 21));
        jToggleButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton3_actionPerformed(e);
            }
        });
        jToggleButton4.setText("Nuevo Cliente");
        jToggleButton4.setBounds(new Rectangle(535, 330, 107, 21));
        jToggleButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton4_actionPerformed(e);
            }
        });
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jTable1, null);
        setLocationRelativeTo(null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    
    {
        PrimeraSucursal clie = new PrimeraSucursal();
       clie.setVisible(true);
        this.dispose();
        
    }

    private void jToggleButton2_actionPerformed(ActionEvent e) 
    {
       //Boton Eliminar
    }

    private void jToggleButton3_actionPerformed(ActionEvent e)
    {
        //editar cliente
        id = jTable1.getSelectedRow();
        if(id>=0){
            EdicionCliente cli = new EdicionCliente();
            cli.setVisible(true);
            this.dispose();
        }
    }

    private void jToggleButton4_actionPerformed(ActionEvent e)
    {
        // Ir hacia clientes nuevos primera sucursal
        CreacionClientesPrimeraSucursal clip = new CreacionClientesPrimeraSucursal();
        clip.setVisible(true);
        this.dispose();
    }
}
