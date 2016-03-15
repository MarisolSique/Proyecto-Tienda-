
package interfaz;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import javax.swing.JComboBox;

import metodos.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.SystemColor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import javax.swing.SwingConstants;

import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

import javax.swing.table.DefaultTableModel;

import metodos.m_cliente;

public class FacturaNueva extends JFrame {

    m_producto prod = new m_producto();
    private Float suma = 0.0f;
    private String total = "";
    private String id_cliente = "";
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
    private JSeparator jSeparator2 = new JSeparator();
    private JSeparator jSeparator3 = new JSeparator();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JTextArea jTextArea6 = new JTextArea();
    private JSeparator jSeparator4 = new JSeparator();
    private JSeparator jSeparator5 = new JSeparator();
    private JSeparator jSeparator6 = new JSeparator();
    private JTextArea jTextArea8 = new JTextArea();
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
    private JTextField jTextField7 = new JTextField();
    private JTextField jTextField8 = new JTextField();
    private JTable jTable2 = new JTable();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel15 = new JLabel();
    private JComboBox jComboBox1 = new JComboBox();


    public FacturaNueva() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /******************************************************************/
    CellEditorListener ChangeNotification = new CellEditorListener() {
            public void editingCanceled(ChangeEvent e) {
                System.out.println("The user canceled editing.");
            }

            public void editingStopped(ChangeEvent e) {
                System.out.println("The user stopped editing successfully.");
            }
        };
    /******************************************************************/

    DefaultTableModel aModel = new DefaultTableModel() {
        //Tabla read-only
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };

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
        jSeparator5.setBounds(new Rectangle(105, 425, 0, 2));
        jSeparator6.setBounds(new Rectangle(30, 270, 580, 2));
        jTextArea8.setBounds(new Rectangle(415, 240, 190, 25));
        jTextArea8.setCaretColor(SystemColor.activeCaptionBorder);
        jTextArea8.setBackground(new Color(215, 215, 215));
        jTextArea8.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent e) {
                jTextArea8_keyReleased(e);
            }
        });
        jLabel11.setText("Original: Cliente            ");
        jLabel11.setBounds(new Rectangle(25, 595, 205, 25));
        jLabel11.setFont(new Font("Constantia", 1, 12));
        jLabel12.setText("Duplicado: Contabilidad");
        jLabel12.setBounds(new Rectangle(25, 605, 205, 25));
        jLabel12.setFont(new Font("Constantia", 1, 12));
        jToggleButton1.setText("Regresar...");
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
        jToggleButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton3_actionPerformed(e);
            }
        });
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

        jTextField7.setBounds(new Rectangle(120, 170, 485, 25));
        jTextField8.setBounds(new Rectangle(120, 205, 485, 25));

//Popular datos
        //Fecha
        Calendar cal = Calendar.getInstance();
        jTextArea4.setText(Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));
        jTextArea5.setText(Integer.toString(cal.get(Calendar.MONTH)+1));
        jTextArea6.setText(Integer.toString(cal.get(Calendar.YEAR)));
        //Tabla de productos
       Action action = new AbstractAction()
       {
           public void actionPerformed(ActionEvent e)
           {
               TableCellListener tcl = (TableCellListener)e.getSource();
               m_producto producto = new m_producto();
               
               int col = jTable2.getEditingColumn();
               int row = jTable2.getEditingRow();
               DecimalFormat df = new DecimalFormat("#.##");

               if(row >= 0 & col >= 0){
                   
                   switch(col){
                   case 0:
                       producto = m_producto.obtenerProductoPorCodigo((String) jTable2.getValueAt(row, col));
                       if(producto != null){
                           //Descripcion
                           jTable2.setValueAt(producto.nombre, row, col+1);
                           //Cantidad
                           jTable2.setValueAt(1, row, col+2);
                           //Precio unitario
                           jTable2.setValueAt(Float.toString(producto.precio_unitario) , row, col+3);
                           //Total
                           jTable2.setValueAt(Float.toString(producto.precio_unitario) , row, col+4);
                           Object[] objects = new Object[5];
                           objects[0] = null;
                           objects[1] = null;
                           objects[2] = null;
                           objects[3] = null;
                           objects[4] = null;
                           aModel.addRow(objects);
                       }
                       break;
                   case 2:
                        Float cant = Float.parseFloat(jTable2.getValueAt(row, 2).toString() );
                        Float pu = Float.parseFloat(jTable2.getValueAt(row, 3).toString() );
                        
                        jTable2.setValueAt(df.format(cant*pu).toString(), row, 4);
                       break;
                   }
                    
                    for(int i=0;i<jTable2.getRowCount()-1;i++){
                        suma+= Float.parseFloat( jTable2.getValueAt(i, 4).toString() );
                    }
                    total = df.format(suma);
                    m_facturas conversion = new m_facturas();
                    jLabel10.setText( conversion.numerosALetras(total,true) );
                    jLabel15.setText( "Q."+total );
               }    
           }
       };

       TableCellListener tcl = new TableCellListener(jTable2, action);
       

        String[] columnNames = { "Código", "Descripcion", "Cantidad", "P. Unidad", "Total" };
        //Configuración tabla
            jTable2.setFillsViewportHeight(true);
        //Agregar títulos de columnas
            aModel.setColumnIdentifiers(columnNames);
        //Agregar primera fila
                //for (int i = 0; i < 20; i++) {
                    Object[] objects = new Object[5];
                    
                    objects[0] = null;
                    objects[1] = null;
                    objects[2] = null;
                    objects[3] = null;
                    objects[4] = null;
                    aModel.addRow(objects);
                //}

        
        //Añadir modelo personalizado a tabla
        jTable2.setModel(aModel);
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(325);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(jTable2);       
        scrollPane.setBounds(new Rectangle(25, 285, 600, 190));


        jLabel15.setBounds(new Rectangle(410, 480, 200, 30));
        jLabel15.setBackground(new Color(215, 215, 215));
        jLabel15.setOpaque(true);
        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel15.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        jLabel15.setFont(new Font("Tahoma", 1, 11));
        jLabel10.setBounds(new Rectangle(30, 480, 380, 30));
        jLabel10.setBackground(new Color(215, 215, 215));
        jLabel10.setOpaque(true);
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        this.getContentPane().add(jLabel15, null);
        this.getContentPane().add(jLabel10, null);
        this.getContentPane().add(jTextField8, null);
        this.getContentPane().add(jTextField7, null);
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
        this.getContentPane().add(jTextArea8, null);
        this.getContentPane().add(jSeparator6, null);
        this.getContentPane().add(jSeparator5, null);
        this.getContentPane().add(jSeparator4, null);
        this.getContentPane().add(jTextArea6, null);
        this.getContentPane().add(jTextArea5, null);
        this.getContentPane().add(jTextArea4, null);
        this.getContentPane().add(jSeparator3, null);
        this.getContentPane().add(jSeparator2, null);
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

        this.getContentPane().add(scrollPane, null);
        scrollPane.setSize(600, 190);

        setLocationRelativeTo(null);

    }

    private void jToggleButton1_actionPerformed(ActionEvent e) {
        Opciones op = new Opciones();
        op.setVisible(true);
        this.dispose();
    }

    private void jToggleButton3_actionPerformed(ActionEvent e) {
        
        List<detalleFacturaProducto> listaProductoCompleta = new ArrayList<detalleFacturaProducto>();
        detalleFacturaProducto productoActual = new detalleFacturaProducto();

        for (int count = 0; count < jTable2.getRowCount()-1; count++){
            m_producto producto = m_producto.obtenerProductoPorCodigo(jTable2.getValueAt(count, 0).toString());
            productoActual.producto = producto;
            productoActual.cantidad = Integer.parseInt(jTable2.getValueAt(count, 2).toString());
            listaProductoCompleta.add(productoActual);
        }
        
        
        m_facturas miFactura = new m_facturas();
        if( miFactura.agregarFactura(Integer.parseInt(jTextArea4.getText()),
                                     Integer.parseInt(jTextArea5.getText()),
                                     Integer.parseInt(jTextArea6.getText()),
                                     id_cliente,
                                     listaProductoCompleta,
                                     Float.parseFloat(total)) )
        {
          Opciones op = new Opciones();
          op.setVisible(true);
          this.dispose();
        }
    }


    private void jTextArea8_keyReleased(KeyEvent e) {
        String nit = jTextArea8.getText();
        m_cliente cliente = m_cliente.obtenerClientePorNit(nit.trim());
        if(cliente != null){
            id_cliente = cliente.id;
            jTextField7.setText(cliente.nombre);
            jTextField8.setText(cliente.direccion);
        }else{
            id_cliente = "";
            jTextField7.setText(null);
            jTextField8.setText(null);
        }
    }

}
