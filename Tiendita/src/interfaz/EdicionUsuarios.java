package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class EdicionUsuarios extends JFrame {
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JTable jTable1 = new JTable();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    public static Integer id = -1;
    private JEditorPane jEditorPane1 = new JEditorPane();
    private JToggleButton jToggleButton5 = new JToggleButton();

    public EdicionUsuarios() {
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
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(699, 294));
        this.setTitle("Usuarios");
        
        String[] columnNames = { "Nombre Completo", "Correo y/o Usuario"};
        jTable1.setFillsViewportHeight(true);
        aModel.setColumnIdentifiers(columnNames);


        jToggleButton5.setText("Regresar a Opciones..");
        jToggleButton5.setBounds(new Rectangle(35, 220, 150, 20));
        jToggleButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton5_actionPerformed(e);
            }
        });
        jTable1.setBounds(new Rectangle(55, 45, 580, 130));
        jToggleButton2.setText("Eliminar Usuario");
        jToggleButton2.setBounds(new Rectangle(295, 220, 120, 20));
        jToggleButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton2_actionPerformed(e);
            }
        });
        jToggleButton3.setText("Moficar Usuario");
        jToggleButton3.setBounds(new Rectangle(430, 220, 107, 21));
        jToggleButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton3_actionPerformed(e);
            }
        });
        jToggleButton4.setText("Crear Usuario");
        jToggleButton4.setBounds(new Rectangle(545, 220, 107, 21));
        jToggleButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton4_actionPerformed(e);
            }
        });
        this.getContentPane().add(jToggleButton5, null);
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jTable1, null);
        this.getContentPane().add(jToggleButton1, null);
        
        setLocationRelativeTo(null);
    }
        


    private void jToggleButton5_actionPerformed(ActionEvent e) {
        Opciones ops = new Opciones();
        ops.setVisible(true);
        this.dispose();
    }

    private void jToggleButton2_actionPerformed(ActionEvent e) {
    }

    private void jToggleButton3_actionPerformed(ActionEvent e) {
    }

    private void jToggleButton4_actionPerformed(ActionEvent e) {
        CreacionUsuarios crea = new CreacionUsuarios();
        crea.setVisible(true);
    }
}
